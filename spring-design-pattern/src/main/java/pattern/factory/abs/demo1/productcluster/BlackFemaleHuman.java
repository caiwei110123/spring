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
 * @Description: Ů�Ժ�����
 */
public class BlackFemaleHuman extends BlackHuman {

    @Override
    public void sex() {
        System.out.println("�ú����˵��Ա�ΪŮ...");
    }

}