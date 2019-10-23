package pattern.memento;

/**
 * ����¼
 * @author HH
 *
 */
public class Memento {

    private String state;

    public Memento(String state) {//���췽������������ݵ���
        super();
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Memento{" +
            "state='" + state + '\'' +
            '}';
    }
}
