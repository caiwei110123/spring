package pattern.composite.code;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/12/20  ����4:36
 * @Version 1.0
 */
//������1 Ҷ�ӽڵ�
public class Department1 implements Company {

    private String name;
    public Department1(String name){
        this.name = name;
    }
    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        StringBuffer stringBuffer = new StringBuffer("-");
        for (int i = 0; i < depth ; i++) {
            stringBuffer.append("-");
        }

        System.out.println(stringBuffer.append(name));
    }

    @Override
    public void duty() {
        System.out.println(name + "�����з���Ʒ");
    }
}