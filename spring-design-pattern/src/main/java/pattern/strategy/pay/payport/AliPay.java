package pattern.strategy.pay.payport;

import pattern.strategy.pay.PayState;

/**
 * Created by Tom on 2018/3/11.
 */
public class AliPay implements Payment {

    @Override
    public PayState pay(String uid, double amount) {
        System.out.println(" ali pay ��ӭʹ��֧����");
        System.out.println("��ѯ�˻�����ʼ�ۿ�");
        return new PayState(200,"֧���ɹ�",amount);
    }
}
