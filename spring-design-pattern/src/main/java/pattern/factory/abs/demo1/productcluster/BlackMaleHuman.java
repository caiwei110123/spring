package pattern.factory.abs.demo1.productcluster;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午7:14
 * @Version 1.0
 */

import pattern.factory.abs.demo1.product.BlackHuman;

/**
 * @Description: 男性黑种人
 */
public class BlackMaleHuman extends BlackHuman {

    @Override
    public void sex() {
        System.out.println("该黑种人的性别为男...");
    }

}