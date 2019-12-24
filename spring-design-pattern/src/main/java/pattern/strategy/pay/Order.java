package pattern.strategy.pay;

import pattern.strategy.pay.payport.PayType;
import pattern.strategy.pay.payport.Payment;

/**
 * Created by Tom on 2018/3/11.
 */
public class Order {
    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid,String orderId,double amount){
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }


    //�����������ȫ������Payment����ӿ�������
    //Ϊʲô��
    //�����ؽ����switch�Ĺ��̣�����Ҫ�ڴ����߼���дswitch��
    //������Ҫдif    else if
    public PayState pay(PayType payType){
        Payment payment = payType.get();
        PayState payState = payment.pay(this.uid,this.amount);
        return payState;
    }

}
