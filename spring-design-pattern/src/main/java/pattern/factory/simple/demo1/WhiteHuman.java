package pattern.factory.simple.demo1;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/12/18  ����6:30
 * @Version 1.0
 */

/**
 * @Description: ��ɫ����
 */
public class WhiteHuman implements Human {

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
        System.out.println("������˵����һ�㶼�ǵ��ֽ�...");
    }

}
