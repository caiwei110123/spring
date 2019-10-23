package pattern.observer.code;

/**
 * ����Ĺ۲���
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
        System.out.println("�۲���A����״̬{1}"+"    "+name+"    "+observerStatus);

    }

}