package pattern.factory.abs.demo1.factory;

import pattern.factory.abs.demo1.Human;
import pattern.factory.abs.demo1.HumanEnum;
import pattern.factory.abs.demo1.abcfactory.AbstractHumanFactory;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午7:27
 * @Version 1.0
 */
public class xxxxHumanFactory  extends AbstractHumanFactory{
    // 创造男性黄种人
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowMaleHuman);
    }

    // 创造男性白种人
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    // 创造男性黑种人
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }
}
