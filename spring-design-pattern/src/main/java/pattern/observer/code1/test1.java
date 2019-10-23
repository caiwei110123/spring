package pattern.observer.code1;

import pattern.observer.code1.observer.AbsObserver;
import pattern.observer.code1.observer.StockObserver;
import pattern.observer.code1.subject.Boss;

import java.lang.reflect.Method;

public class test1 {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException, Throwable {
        Boss huhansan = new Boss();//��֪ͨ���ࣩ���й۲��߶������ϰ壬ֻҪ�ϰ����칫�ң����̷���֪ͨ��

        AbsObserver st  = new StockObserver("���ǿ���Ʊ����˵:");//����Ʊ�Ĺ۲���
        Class c = st.getClass();
        Method mm = c.getMethod("setMoney",Double.class);
       mm.invoke(st, 3.215);
        //		mm.invoke(obj, args)
        //
        //֪ͨ��Ӧ����Ա���ϰ������������£�
        Object res = huhansan.invoke(st, st.getClass().getMethod("closeStock"), null);
        //System.out.println(st.getName()+" "+res);

        //��Ӧ����Ա�յ�֪ͨ�󣬸�֪ͨ�߳���
        Double money = (Double) huhansan.invoke(st, st.getClass().getMethod("giveObserverMoney",Double.class),
            new Object[]{st.getClass().getMethod("getMoney").invoke(st, null)});
        System.out.println(st.getName()+" �Ѹ����ͣ� "+money);

        huhansan.saySomeThing();
        //		Object res = st.getClass().getMethod("closeStock", null).invoke(st, null);
        //		System.out.println(st.getName()+" "+res);
        //		Double money  =  (Double) st.getClass().getMethod("giveObserverMoney", Double.class).invoke(st, new Object[]{3.25});
        //		System.out.println("֪ͨ�߻�ñ��꣺"+money);
        //		Double money = (Double)  st.getClass().invoke(st, st.getClass().getMethod("giveObserverMoney", Double.class), new Object[]{3.25});


        //		System.out.println("֪ͨ�߻�ñ��꣺"+money);

        //		Double [] param = new Double[]{3.25};
        //		Method m = st.getClass().getMethod("giveObserverMoney", Double.class);
        //		System.out.println("֪ͨ�߻�ñ��꣺"+huhansan.invoke(st,m, param));



        // Observer nba  = new NBAObserver(" ���ǿ�NBA����");//��֪ͨ����
        // huhansan.invokeba, nba.getClass().getMethod("closeNBA"), null);

        //		 huhansan.notifys();

        // huhansan.setUpdate(EventHandler.create(EventHandler.class, st, "closeStock"));
        //
        // huhansan.notifys();
    }
}
