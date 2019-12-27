package com.caiwei.extenaltest;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.stereotype.Service;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/26  上午7:12
 * @Version 1.0
 */
@Service(value = "TestListableBeanFactory")
public class TestListableBeanFactory extends DefaultListableBeanFactory {
    @Override
    public int getBeanDefinitionCount() {
        int c = super.getBeanDefinitionCount();
        System.out.println("========:"+c);
        return c;
    }
}
