package pattern.observer.code1.observer;

/**
 * ��Ʊ
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
        System.out.println(name+"  ���Ǹ����ڿ���Ʊ���ˣ����Ѿ��ӵ���֪ͨ�ϰ����ˣ���͹رչ�Ʊ����������");
        return "�����յ�֪ͨ!";
    }
    @Override
    public Double giveObserverMoney(Double money) {
        return money;
    }



}
