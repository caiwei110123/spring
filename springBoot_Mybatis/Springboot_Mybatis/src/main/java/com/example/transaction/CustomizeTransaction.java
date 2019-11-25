package com.example.transaction;

import org.aopalliance.intercept.MethodInvocation;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.aop.framework.autoproxy.InfrastructureAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Role;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.AnnotationTransactionAttributeSource;
import org.springframework.transaction.annotation.SpringTransactionAnnotationParser;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;
import org.springframework.transaction.config.TransactionManagementConfigUtils;
import org.springframework.transaction.event.TransactionalEventListenerFactory;
import org.springframework.transaction.interceptor.BeanFactoryTransactionAttributeSourceAdvisor;
import org.springframework.transaction.interceptor.TransactionAttribute;
import org.springframework.transaction.interceptor.TransactionAttributeSource;
import org.springframework.transaction.interceptor.TransactionInterceptor;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.lang.reflect.AnnotatedElement;
import java.util.Collection;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/11/26  上午1:13
 * @Version 1.0
 */
@Service
public class CustomizeTransaction {


    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(ContextUtils.getBean(DataSource.class));
        return sqlSessionFactoryBean;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.example");
        return mapperScannerConfigurer;
    }

    @Bean
    public DataSource dataSource() {

        //DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        //driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        //driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/smartEngine?useUnicode=true&characterEncoding=UTF-8");
        //driverManagerDataSource.setPassword("cai000wei");
        //driverManagerDataSource.setUsername("root");
        return ContextUtils.getBean(DataSource.class);

        //EmbeddedDatabaseBuilder embeddedDatabaseBuilder = new EmbeddedDatabaseBuilder();
        //return embeddedDatabaseBuilder.setType(EmbeddedDatabaseType.H2).build();
    }

    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(ContextUtils.getBean(DataSource.class));
        return transactionManager;
    }

    @Bean
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public InfrastructureAdvisorAutoProxyCreator advisorAutoProxyCreator() {
        return new InfrastructureAdvisorAutoProxyCreator();
    }

    public static class MySpringTransactionAnnotationParser extends SpringTransactionAnnotationParser {

        @Override
        public TransactionAttribute parseTransactionAnnotation(AnnotatedElement ae) {
            AnnotationAttributes attributes = AnnotatedElementUtils
                .getMergedAnnotationAttributes(ae, MyTransactional.class);
            if (attributes != null) {
                return parseTransactionAnnotation(attributes);
            } else {
                return null;
            }
        }

        public TransactionAttribute parseTransactionAnnotation(MyTransactional ann) {
            return parseTransactionAnnotation(AnnotationUtils.getAnnotationAttributes(ann, false, false));
        }

    }

    public static class MyTransactionInterceptor extends TransactionInterceptor {
        @Override
        public Object invoke(final MethodInvocation invocation) throws Throwable {
            logger.info("====================transaction method :" +
                invocation.getMethod().getDeclaringClass().getName() + "." + invocation.getMethod().getName());
            Object object = super.invoke(invocation);
            logger.info("================="+invocation.getMethod().getName() + " result :" + object);
            return object;
        }
    }

    @Configuration
    public static class MyProxyTransactionManagementConfiguration {

        protected PlatformTransactionManager txManager;

        @Bean(name = TransactionManagementConfigUtils.TRANSACTION_ADVISOR_BEAN_NAME)
        @Role(BeanDefinition.ROLE_INFRASTRUCTURE)
        public BeanFactoryTransactionAttributeSourceAdvisor transactionAdvisor() {
            BeanFactoryTransactionAttributeSourceAdvisor advisor = new BeanFactoryTransactionAttributeSourceAdvisor();
            advisor.setTransactionAttributeSource(transactionAttributeSource());
            advisor.setAdvice(transactionInterceptor());
            advisor.setOrder(Ordered.LOWEST_PRECEDENCE);
            return advisor;
        }

        @Bean
        @Role(BeanDefinition.ROLE_INFRASTRUCTURE)
        public TransactionAttributeSource transactionAttributeSource() {
            return new AnnotationTransactionAttributeSource(new MySpringTransactionAnnotationParser());
        }

        @Bean(name = TransactionManagementConfigUtils.TRANSACTIONAL_EVENT_LISTENER_FACTORY_BEAN_NAME)
        @Role(BeanDefinition.ROLE_INFRASTRUCTURE)
        public TransactionalEventListenerFactory transactionalEventListenerFactory() {
            return new TransactionalEventListenerFactory();
        }

        @Autowired(required = false)
        void setConfigurers(Collection<TransactionManagementConfigurer> configurers) {
            if (CollectionUtils.isEmpty(configurers)) {
                return;
            }
            if (configurers.size() > 1) {
                throw new IllegalStateException("Only one TransactionManagementConfigurer may exist");
            }
            TransactionManagementConfigurer configurer = configurers.iterator().next();
            this.txManager = configurer.annotationDrivenTransactionManager();
        }

        @Bean
        @Role(BeanDefinition.ROLE_INFRASTRUCTURE)
        public TransactionInterceptor transactionInterceptor() {
            TransactionInterceptor interceptor = new MyTransactionInterceptor();
            interceptor.setTransactionAttributeSource(transactionAttributeSource());
            if (this.txManager != null) {
                interceptor.setTransactionManager(this.txManager);
            }
            return interceptor;
        }
    }
}
