package pattern.observer.code1.observer;

/**
 * ��Ʊ
 * @author HH
 *
 */
public class NBAObserver   extends AbsObserver  implements  Observer{

    public NBAObserver(String name ) {
        super();
        this.name = name;
    }

    public void closeNBA(){
        System.out.println("���ǿ�NBA���ˣ����յ�����Ϣ�����̹رյ��ӣ��������� !   "+name+"   " );
    }

    @Override
    public Double giveObserverMoney(Double money) {
        // TODO Auto-generated method stub
        return money;
    }



}
