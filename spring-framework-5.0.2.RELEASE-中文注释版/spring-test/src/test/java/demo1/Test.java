package demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/10/23  下午8:05
 * @Version 1.0
 */
public class Test {


    public static void main(String[] args){
        //@SuppressWarnings("resource")
        //如果是web项目，则使用以下代码加载配置文件，如果是一般的Java项目，则使用注释的方式
        AnnotationConfigApplicationContext appCtx1 = new AnnotationConfigApplicationContext();

        appCtx1.scan("com.caiwei");
        appCtx1.refresh();
        System.out.println(appCtx1.getBean("helloWorldImpl1"));
        //ApplicationContext appCtx = new ClassPathXmlApplicationContext("/application.xml");
        //appCtx1.register(TestListableBeanFactory.class);
        //appCtx1.refresh();
        //TestListableBeanFactory TestListableBeanFactory = (TestListableBeanFactory)appCtx1.getBean("TestListableBeanFactory");
        //System.out.println(TestListableBeanFactory);
        //TestListableBeanFactory.registerSingleton("test",new TestListableBeanFactory());
        //System.out.println(TestListableBeanFactory.getBean("test"));
        //ApplicationContext appCtx = new FileSystemXmlApplicationContext("conf/application.xml");
        //HelloWorld hw1 = (HelloWorld) appCtx.getBean("proxy");
        //HelloWorld hw2 = (HelloWorld) appCtx.getBean("proxy2");
        //hw1.printHelloWorld();
        //hw2.printHelloWorld();
        //
        //System.out.println("=====================");
        //System.out.println();
        //ParamObj paramObj = new ParamObj();
        //paramObj.setActionName("test");
        //paramObj.setJobApplicationId("xxxxxxxx");
        //paramObj.setJobRequisitionId("ddddddddddddddd");
        //paramObj.setTitle("你好啊");
        //hw1.doPrint(paramObj);
        //System.out.println();

        //hw2.printHelloWorld();
        //System.out.println();
        //hw2.doPrint();
    }
}
