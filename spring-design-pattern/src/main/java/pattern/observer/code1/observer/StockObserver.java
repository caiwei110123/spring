package pattern.observer.code1.observer;

/**
 * 股票
 * @author HH
 *
 */
public class StockObserver extends AbsObserver implements  Observer{

    public StockObserver(String name) {
        super();
        this.name = name;
    }
    Double money;

    public Double getMoney() {
        return money;
    }
    public void setMoney(Double money) {
        this.money = money;
    }
    public String closeStock(){
        System.out.println(name+"  我是个正在看股票的人，我已经接到了通知老板来了，这就关闭股票，继续工作");
        return "我已收到通知!";
    }
    @Override
    public Double giveObserverMoney(Double money) {
        return money;
    }



}
