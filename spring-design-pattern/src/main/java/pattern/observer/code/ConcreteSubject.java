package pattern.observer.code;

/**
 * 具体的主体
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
