package pattern.factory.abs.demo1.productcluster;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/12/18  ����7:13
 * @Version 1.0
 */

import pattern.factory.abs.demo1.product.YellowHuman;

/**
 * @Description: ���Ի�����
 */
public class YellowMaleHuman extends YellowHuman {

    @Override
    public void sex() {
        System.out.println("�û����˵��Ա�Ϊ��...");
    }

}