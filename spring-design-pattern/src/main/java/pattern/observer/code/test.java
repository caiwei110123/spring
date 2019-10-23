package pattern.observer.code;

public class test {

    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        s.attach(new ConcreteAObserver(s,"A观察者"));

        s.attach(new ConcreteBObserver(s,"B观察者"));

        s.attach(new ConcreteAObserver(s,"A观察者"));

        s.setSubjectStatus("ABC");
    }
}
