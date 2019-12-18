package pattern.factory.simple.demo1;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午6:29
 * @Version 1.0
 */

/**
 * @Description: 黑色人种
 */
public class BlackHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("黑种人会笑...");
    }

    @Override
    public void cry() {
        System.out.println("黑种人会哭...");
    }

    @Override
    public void talk() {
        System.out.println("黑种人说话，一般都听不懂...");
    }

}