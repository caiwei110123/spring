package pattern.observer.code1;

import pattern.observer.code1.observer.AbsObserver;
import pattern.observer.code1.observer.StockObserver;
import pattern.observer.code1.subject.Boss;

import java.lang.reflect.Method;

public class test1 {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException, Throwable {
        Boss huhansan = new Boss();//（通知者类）所有观察者都盯着老板，只要老板进入办公室，立刻发出通知。

        AbsObserver st  = new StockObserver("我是看股票的人说:");//看股票的观察者
        Class c = st.getClass();
        Method mm = c.getMethod("setMoney",Double.class);
       mm.invoke(st, 3.215);
        //		mm.invoke(obj, args)
        //
        //通知相应的人员，老板来了请做正事！
        Object res = huhansan.invoke(st, st.getClass().getMethod("closeStock"), null);
        //System.out.println(st.getName()+" "+res);

        //相应的人员收到通知后，给通知者酬劳
        Double money = (Double) huhansan.invoke(st, st.getClass().getMethod("giveObserverMoney",Double.class),
            new Object[]{st.getClass().getMethod("getMoney").invoke(st, null)});
        System.out.println(st.getName()+" 已付酬劳： "+money);

        huhansan.saySomeThing();
        //		Object res = st.getClass().getMethod("closeStock", null).invoke(st, null);
        //		System.out.println(st.getName()+" "+res);
        //		Double money  =  (Double) st.getClass().getMethod("giveObserverMoney", Double.class).invoke(st, new Object[]{3.25});
        //		System.out.println("通知者获得报酬："+money);
        //		Double money = (Double)  st.getClass().invoke(st, st.getClass().getMethod("giveObserverMoney", Double.class), new Object[]{3.25});


        //		System.out.println("通知者获得报酬："+money);

        //		Double [] param = new Double[]{3.25};
        //		Method m = st.getClass().getMethod("giveObserverMoney", Double.class);
        //		System.out.println("通知者获得报酬："+huhansan.invoke(st,m, param));



        // Observer nba  = new NBAObserver(" 我是看NBA的人");//被通知的人
        // huhansan.invokeba, nba.getClass().getMethod("closeNBA"), null);

        //		 huhansan.notifys();

        // huhansan.setUpdate(EventHandler.create(EventHandler.class, st, "closeStock"));
        //
        // huhansan.notifys();
    }
}
