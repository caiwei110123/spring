package pattern.factory.simple.demo2;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午6:08
 * @Version 1.0
 */
public class Factory {

    public static Api createApi(int condition) {
        Api api = null;
        if (condition == 1) {
            api = new Impl1();
        } else if (condition == 2) {
            api = new Impl2();
        }
        return api;
    }
}
