package pattern.factory.abs.demo1.product;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/12/18  ����7:12
 * @Version 1.0
 */

import pattern.factory.abs.demo1.Human;

/**
 * @Description:
 * ΪʲôҪ�޸ĳɳ������أ�ֻ��YellowHuman��ͳ�ƣ�����Ҫ�����Ա�
 */
public abstract class YellowHuman implements Human {

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
