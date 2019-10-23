package pattern.observer.code;

/**
 * 具体的观察者
 */
public class ConcreteAObserver extends Observer{

    private String name ;
    private String observerStatus;
    private ConcreteSubject subject;


    public ConcreteAObserver(ConcreteSubject subject, String name) {
        super();
        this.name = name;
        this.subject = subject;
    }


    @Override
    public void update() {
        observerStatus = subject.getSubjectStatus();
        System.out.println("观察者A的新状态{1}"+"    "+name+"    "+observerStatus);

    }

}