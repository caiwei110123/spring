package pattern.factory.simple.demo2;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午6:06
 * @Version 1.0
 */
public class Impl1 implements Api {
    @Override
    public void operate(int s) {
        System.out.println("the input  impl1  = " + s);
    }
}
