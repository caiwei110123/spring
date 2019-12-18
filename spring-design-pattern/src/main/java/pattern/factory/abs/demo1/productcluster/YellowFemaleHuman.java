package pattern.factory.abs.demo1.productcluster;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午7:13
 * @Version 1.0
 */

import pattern.factory.abs.demo1.product.YellowHuman;

/**
 * @Description: 女性黄种人
 */
public class YellowFemaleHuman extends YellowHuman {

    @Override
    public void sex() {
        System.out.println("该黄种人的性别为女...");
    }

}