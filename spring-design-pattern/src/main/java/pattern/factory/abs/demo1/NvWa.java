package pattern.factory.abs.demo1;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/12/18  ����7:18
 * @Version 1.0
 */

import pattern.factory.abs.demo1.factory.FemaleHumanFactory;
import pattern.factory.abs.demo1.factory.MaleHumanFactory;

/**
 * @Description:
 * Ů洽����������������ߣ��ֱ��ǣ�
 * ����������
 * Ů��������
 */
public class NvWa {

    public static void main(String[] args) {
        // ����������
        HumanFactory maleHumanFactory = new MaleHumanFactory();

        // Ů��������
        HumanFactory femaleHumanFactory = new FemaleHumanFactory();

        // �����߽�����ϣ���ʼ��������:
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();

        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();

        maleYellowHuman.cry();
        maleYellowHuman.laugh();
        femaleYellowHuman.sex();
        /*
         * ...
         */

    }

}
