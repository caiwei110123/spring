package pattern.factory.abs.demo1.productcluster;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午7:13
 * @Version 1.0
 */

import pattern.factory.abs.demo1.product.WhiteHuman;

/**
 * @Description: 男性白种人
 */
public class WhiteMaleHuman extends WhiteHuman {

    @Override
    public void sex() {
        System.out.println("该白种人的性别为男...");
    }

}
