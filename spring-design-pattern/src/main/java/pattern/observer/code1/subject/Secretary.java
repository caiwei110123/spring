package pattern.observer.code1.subject;


import java.beans.EventHandler;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Secretary   implements Subject ,InvocationHandler {

    private EventHandler update;

    private String action;



    //	public EventHandler getUpdate() {
    //		return update;
    //	}


    public void setUpdate(EventHandler update) {
        this.update = update;
    }


    public String getAction() {
        return action;
    }


    public void setAction(String action) {
        this.action = action;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(456);
        return method.invoke(proxy, args);
    }


    @Override
    public void saySomeThing() {
        System.out.println("老子已全部通知完，钱以收到！");

    }




}
