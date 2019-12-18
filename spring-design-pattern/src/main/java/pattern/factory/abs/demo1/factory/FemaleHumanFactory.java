package pattern.factory.abs.demo1.factory;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午7:18
 * @Version 1.0
 */

import pattern.factory.abs.demo1.Human;
import pattern.factory.abs.demo1.HumanEnum;
import pattern.factory.abs.demo1.abcfactory.AbstractHumanFactory;

/**
 * @Description: 女性创建工厂
 */
public class FemaleHumanFactory extends AbstractHumanFactory {

    // 创造女性黄种人
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowFemaleHuman);
    }

    // 创造女性白种人
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    // 创造女性黑种人
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }

}
