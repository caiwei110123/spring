package pattern.observer.code1.observer;

/**
 * 股票
 * @author HH
 *
 */
public class NBAObserver   extends AbsObserver  implements  Observer{

    public NBAObserver(String name ) {
        super();
        this.name = name;
    }

    public void closeNBA(){
        System.out.println("我是看NBA的人，我收到了信息，立刻关闭电视，继续工作 !   "+name+"   " );
    }

    @Override
    public Double giveObserverMoney(Double money) {
        // TODO Auto-generated method stub
        return money;
    }



}
