package pattern.factory.simple.demo1;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午6:27
 * @Version 1.0
 */

/**
 * @Description: 黄色人种
 */
public class YellowHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("黄种人会笑...");
    }

    @Override
    public void cry() {
        System.out.println("黄种人会哭...");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话，一般说的都是双字节...");
    }

}