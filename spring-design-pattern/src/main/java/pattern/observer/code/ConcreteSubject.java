package pattern.observer.code;

/**
 * ���������
 */
public class ConcreteSubject extends Subject{

    private String subjectStatus;

    public String getSubjectStatus() {
        return subjectStatus;
    }

    public void setSubjectStatus(String subjectStatus) {
        this.subjectStatus = subjectStatus;
        notifys();
    }


}
