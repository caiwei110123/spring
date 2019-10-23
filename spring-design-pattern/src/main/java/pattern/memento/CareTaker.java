package pattern.memento;

/**
 * ����������
 *
 * @date : 2019/10/23  ����5:02
 * @Version 1.0
 */
/**
 * ������
 * @author HH
 *
 */
public class CareTaker {

    private Memento memento;//�õ��������ñ���¼

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    @Override
    public String toString() {
        return "CareTaker{" +
            "memento=" + memento +
            '}';
    }
}
