package pattern.proxy.jdk;


import pattern.proxy.staticed.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Tom on 2018/3/10.
 */
public class JDKMeipo implements InvocationHandler{
    //������Ķ��󣬰����ø���������
    private Person target;

    public Object getInstance(Person target) throws Exception{
        this.target = target;

       Class<?> clazz = target.getClass();

        //�°�أ���ʦ����ײ�������ҽ����ֽ�������������
        //��������һ���µĶ����ֽ���������ʵ�֣�
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("����ý�ţ���Ҫ�����Ҷ��������Ѿ��õ��������");
        System.out.println("��ʼ��ɫ");

        method.invoke(this.target,args);

        System.out.println("������ʵĻ�����׼������");

        return  null;
    }
}
