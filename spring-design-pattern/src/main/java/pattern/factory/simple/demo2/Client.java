package pattern.factory.simple.demo2;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午6:09
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Api api = Factory.createApi(1);
        api.operate(1);
    }
}
