package pattern.memento;

/**
 * 功能描述：
 *
 * @date : 2019/10/23  下午5:02
 * @Version 1.0
 */
/**
 * 管理者
 * @author HH
 *
 */
public class CareTaker {

    private Memento memento;//得到或者设置备忘录

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
