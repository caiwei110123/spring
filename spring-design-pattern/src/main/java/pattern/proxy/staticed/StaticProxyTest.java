package pattern.proxy.staticed;

public class StaticProxyTest {

    public static void main(String[] args) {

        //ֻ�ܰ�����Ҷ���
        //���ܰ���á����ܰ�İ����
        Father father = new Father(new Son());

        father.findLove();

    }
}
