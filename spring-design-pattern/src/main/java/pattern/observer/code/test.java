package pattern.observer.code;

public class test {

    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        s.attach(new ConcreteAObserver(s,"A�۲���"));

        s.attach(new ConcreteBObserver(s,"B�۲���"));

        s.attach(new ConcreteAObserver(s,"A�۲���"));

        s.setSubjectStatus("ABC");
    }
}
