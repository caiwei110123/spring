package pattern.factory.simple.demo1;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/12/18  ����6:33
 * @Version 1.0
 */

public class NvWa1 {

    public static void main(String[] args) {
        // Ů洷����ˣ�����ɶ���־���ɶ���֣��հ�
        for(int i = 0; i < 1000000; i++) {
            System.out.println("�������������...");
            Human human = HumanFactory1.createHuman();
            human.cry();
            human.laugh();
            human.talk();
        }
    }

}