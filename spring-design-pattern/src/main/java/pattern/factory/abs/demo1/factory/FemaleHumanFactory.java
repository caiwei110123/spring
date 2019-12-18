package pattern.factory.abs.demo1.factory;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/12/18  ����7:18
 * @Version 1.0
 */

import pattern.factory.abs.demo1.Human;
import pattern.factory.abs.demo1.HumanEnum;
import pattern.factory.abs.demo1.abcfactory.AbstractHumanFactory;

/**
 * @Description: Ů�Դ�������
 */
public class FemaleHumanFactory extends AbstractHumanFactory {

    // ����Ů�Ի�����
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowFemaleHuman);
    }

    // ����Ů�԰�����
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    // ����Ů�Ժ�����
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }

}
