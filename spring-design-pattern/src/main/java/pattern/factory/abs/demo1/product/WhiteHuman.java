package pattern.factory.abs.demo1.product;

import pattern.factory.abs.demo1.Human;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午7:12
 * @Version 1.0
 */

public abstract class WhiteHuman implements Human {

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
        System.out.println("白种人说话，一般说的都是单字节...");
    }

}
