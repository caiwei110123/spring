package pattern.memento;

public class test {

    public static void main(String[] args) {
        //originator��ʼ��״̬��״̬����ΪON
        Originator o = new Originator();
        o.setState("on");
        o.show();
        System.out.println("��ʼ��״̬�ɹ�==================");


        //����״̬ʱ���������˺ܺõķ�װ����������originator��ʵ��ϸ��
        CareTaker careTaker = new CareTaker();
        Memento temp = o.createMemento();
        System.out.println(temp.toString());
        careTaker.setMemento(temp);
        System.out.println(careTaker.toString());
        //��originator�ı���״̬����Ϊoff
        o.setState("off");
        System.out.println("aaa   "+o.toString());
        o.show();
        System.out.println("�ı�״̬�ɹ�========================");

        Memento temp1 = careTaker.getMemento();
        System.out.println("bb   "+temp1.toString());

        o.SetMenento(temp1);
        o.show();
        System.out.println("�ָ�״̬�ɹ�==========================");

    }

}