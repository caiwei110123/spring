package pattern.observer.code1.subject;


import java.beans.EventHandler;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Boss implements Subject ,InvocationHandler{

    @Override
    public Object invoke(Object obj, Method m, Object[] o) throws Throwable {
        return m.invoke(obj,o);
    }


    @Override
    public void saySomeThing() {
        System.out.println("����֪ͨ��!!!������ȫ��֪ͨ�꣬Ǯ���յ���");

    }






}
