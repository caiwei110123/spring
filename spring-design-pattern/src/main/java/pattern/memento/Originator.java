package pattern.memento;

/**
 * 发起人
 * @author HH
 *
 */
public class Originator {

    private String state;//需要保存的属性，可能是多个

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    //创建备忘录，将当前需要保存的信息导入，并实例化出一个Memento对象
    public Memento  createMemento(){

        return new Memento(state);
    }
    //回复备忘录，讲Memento导入并将相关数据恢复
    public void SetMenento(Memento memento){
        state = memento.getState();
    }
    public void show(){
        System.out.println("state=  "+state);
    }

    @Override
    public String toString() {
        return "Originator{" +
            "state='" + state + '\'' +
            '}';
    }
}
