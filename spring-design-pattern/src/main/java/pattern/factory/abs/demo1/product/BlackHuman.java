package pattern.factory.abs.demo1.product;

import pattern.factory.abs.demo1.Human;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/12/18  ����7:12
 * @Version 1.0
 */

public abstract class BlackHuman implements Human {

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
        System.out.println("������˵����һ��������...");
    }

}
