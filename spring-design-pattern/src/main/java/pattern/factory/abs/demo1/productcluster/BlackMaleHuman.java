package pattern.factory.abs.demo1.productcluster;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/12/18  ����7:14
 * @Version 1.0
 */

import pattern.factory.abs.demo1.product.BlackHuman;

/**
 * @Description: ���Ժ�����
 */
public class BlackMaleHuman extends BlackHuman {

    @Override
    public void sex() {
        System.out.println("�ú����˵��Ա�Ϊ��...");
    }

}