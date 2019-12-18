package pattern.factory.abs.demo1.factory;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/12/18  ����7:17
 * @Version 1.0
 */

import pattern.factory.abs.demo1.Human;
import pattern.factory.abs.demo1.HumanEnum;
import pattern.factory.abs.demo1.abcfactory.AbstractHumanFactory;

/**
 * @Description: ���Դ�������
 */
public class MaleHumanFactory extends AbstractHumanFactory {

    // �������Ի�����
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowMaleHuman);
    }

    // �������԰�����
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    // �������Ժ�����
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }

}
