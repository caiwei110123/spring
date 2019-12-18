package pattern.factory.abs.demo1;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午7:18
 * @Version 1.0
 */

import pattern.factory.abs.demo1.factory.FemaleHumanFactory;
import pattern.factory.abs.demo1.factory.MaleHumanFactory;

/**
 * @Description:
 * 女娲建立起了两条生产线，分别是：
 * 男性生产线
 * 女性生产线
 */
public class NvWa {

    public static void main(String[] args) {
        // 男性生产线
        HumanFactory maleHumanFactory = new MaleHumanFactory();

        // 女性生产线
        HumanFactory femaleHumanFactory = new FemaleHumanFactory();

        // 生产线建立完毕，开始生产人了:
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
