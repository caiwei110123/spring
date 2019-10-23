package pattern.observer.code;

/**
 * 具体的观察者
 */
public class ConcreteBObserver extends Observer{

    private String name ;
    private String observerStatus;
    private ConcreteSubject subject;


    public ConcreteBObserver(ConcreteSubject subject, String name) {
        super();
        this.name = name;
        this.subject = subject;
    }


    @Override
    public void update() {
        observerStatus = subject.getSubjectStatus();
        System.out.println("观察者B的新状态{1}"+"    "+name+"    "+observerStatus);

    }

}