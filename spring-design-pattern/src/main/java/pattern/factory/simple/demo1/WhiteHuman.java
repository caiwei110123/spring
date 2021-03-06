package pattern.factory.simple.demo1;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午6:30
 * @Version 1.0
 */

/**
 * @Description: 白色人种
 */
public class WhiteHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("白种人会笑...");
    }

    @Override
    public void cry() {
        System.out.println("白种人会哭...");
    }

    @Override
    public void talk() {
        System.out.println("白种人说话，一般都是单字节...");
    }

}
