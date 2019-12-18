package pattern.factory.simple.demo1;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午6:30
 * @Version 1.0
 */

/**
 * @Description: 女蜗，这是真的神啊
 */
public class NvWa {

    public static void main(String[] args) {

        // 女娲第一次造人，试验性质，少造点，火候不足，缺陷产品
        System.out.println("第一批人：白种人-----------------");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.cry();
        whiteHuman.laugh();
        whiteHuman.talk();

        // 女娲第二次造人，火候加足点，然后又出了个次品，黑人
        System.out.println("第一批人：黑种人-----------------");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.cry();
        blackHuman.laugh();
        blackHuman.talk();

        //第三批人了，这次火候掌握的正好，黄种人
        System.out.println("第一批人：黄种人-----------------");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.cry();
        yellowHuman.laugh();
        yellowHuman.talk();
    }

}
