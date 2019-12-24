package pattern.proxy.jdk;


import pattern.proxy.staticed.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Tom on 2018/3/10.
 */
public class JDK58 implements InvocationHandler{
    private Person target;
    public Object getInstance(Person target) throws Exception{
        this.target = target;
       Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("����58����Ҫ�����ҹ����������Ѿ��õ���ļ���");
        System.out.println("��ʼͶ��");
        method.invoke(this.target,args);
        System.out.println("��������");
        return  null;
    }
}
