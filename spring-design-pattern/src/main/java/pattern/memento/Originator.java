package pattern.memento;

/**
 * ������
 * @author HH
 *
 */
public class Originator {

    private String state;//��Ҫ��������ԣ������Ƕ��

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    //��������¼������ǰ��Ҫ�������Ϣ���룬��ʵ������һ��Memento����
    public Memento  createMemento(){

        return new Memento(state);
    }
    //�ظ�����¼����Memento���벢��������ݻָ�
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
