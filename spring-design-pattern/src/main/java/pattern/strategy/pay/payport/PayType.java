package pattern.strategy.pay.payport;

/**
 * 姑且把这个枚举当做一个常量去维护
 * Created by Tom on 2018/3/11.
 */
public enum PayType {
    ALI_PAY("",new AliPay()),
    WECHAT_PAY("",new WechatPay()),
    UNION_PAY("",new UnionPay()),
    JD_PAY("",new JDPay());

    private  String a;
    private Payment payment;
    PayType(String a,Payment payment){
        System.out.println(payment.toString());
        this.payment = payment;
        this.a = a;
    }

    public Payment get(){
        System.out.println(payment.toString());
        return  this.payment;
    }
}
