package pattern.strategy.pay.payport;

import pattern.strategy.pay.PayState;

/**
 * Created by Tom on 2018/3/11.
 */
public class JDPay implements Payment {

    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("��ӭʹ�þ�������");
        System.out.println("��ѯ�˻�����ʼ�ۿ�");
        return new PayState(200,"֧���ɹ�",amount);
    }
}
