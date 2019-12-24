package pattern.strategy.pay;


import pattern.strategy.pay.payport.PayType;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Tom on 2018/3/11.
 */
public class PayStrategyTest {

    public static void main(String[] args) {

        //ʡ�԰���Ʒ��ӵ����ﳵ���ٴӹ��ﳵ�µ�
        //ֱ�Ӵӵ㵥��ʼ
        Order order = new Order("1","20180311001000009",324.45);

        //��ʼ֧����ѡ��΢��֧����֧�������������������������Ƹ�ͨ
        //ÿ��������֧���ľ����㷨�ǲ�һ����
        //�����㷨�̶���

        //���ֵ����֧����ʱ��ž������ĸ�ֵ
        PayState payState = order.pay(PayType.WECHAT_PAY);
        System.out.println(payState);

        //BeanFactory

        //����urlȥ�Զ�ѡ��
        //��ȡ�ٶȵ�����     BaiduParser
        //                 SinaParser
        //                 SougouParser
        //����һ�������õ�Json��ʽ��ͳһ���ˣ��������


    }

}
