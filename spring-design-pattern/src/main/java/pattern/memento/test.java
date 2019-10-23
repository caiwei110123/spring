package pattern.memento;

public class test {

    public static void main(String[] args) {
        //originator初始化状态，状态属性为ON
        Originator o = new Originator();
        o.setState("on");
        o.show();
        System.out.println("初始化状态成功==================");


        //保存状态时，由于有了很好的封装，可以隐藏originator的实现细节
        CareTaker careTaker = new CareTaker();
        Memento temp = o.createMemento();
        System.out.println(temp.toString());
        careTaker.setMemento(temp);
        System.out.println(careTaker.toString());
        //将originator改变了状态属性为off
        o.setState("off");
        System.out.println("aaa   "+o.toString());
        o.show();
        System.out.println("改变状态成功========================");

        Memento temp1 = careTaker.getMemento();
        System.out.println("bb   "+temp1.toString());

        o.SetMenento(temp1);
        o.show();
        System.out.println("恢复状态成功==========================");

    }

}