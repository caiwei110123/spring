package pattern.factory.abs.demo1.productcluster;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/12/18  ����7:13
 * @Version 1.0
 */

import pattern.factory.abs.demo1.product.WhiteHuman;

/**
 * @Description: ���԰�����
 */
public class WhiteMaleHuman extends WhiteHuman {

    @Override
    public void sex() {
        System.out.println("�ð����˵��Ա�Ϊ��...");
    }

}
