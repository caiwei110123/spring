package pattern.memento;

/**
 * 备忘录
 * @author HH
 *
 */
public class Memento {

    private String state;

    public Memento(String state) {//构造方法，将相关数据导入
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
