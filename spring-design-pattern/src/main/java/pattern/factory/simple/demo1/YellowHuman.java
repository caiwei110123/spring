package pattern.factory.simple.demo1;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/12/18  ����6:27
 * @Version 1.0
 */

/**
 * @Description: ��ɫ����
 */
public class YellowHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("�����˻�Ц...");
    }

    @Override
    public void cry() {
        System.out.println("�����˻��...");
    }

    @Override
    public void talk() {
        System.out.println("������˵����һ��˵�Ķ���˫�ֽ�...");
    }

}