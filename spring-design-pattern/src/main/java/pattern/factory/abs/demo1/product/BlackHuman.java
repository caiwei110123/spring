package pattern.factory.abs.demo1.product;

import pattern.factory.abs.demo1.Human;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午7:12
 * @Version 1.0
 */

public abstract class BlackHuman implements Human {

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
        System.out.println("黑种人说话，一般听不懂...");
    }

}
