package pattern.observer.code;

/**
 * ����Ĺ۲���
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
        System.out.println("�۲���B����״̬{1}"+"    "+name+"    "+observerStatus);

    }

}