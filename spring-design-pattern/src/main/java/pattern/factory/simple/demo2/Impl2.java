package pattern.factory.simple.demo2;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午6:07
 * @Version 1.0
 */
public class Impl2 implements Api {
    @Override
    public void operate(int s) {
        System.out.println(" the input impl2 = " + s);
    }
}
