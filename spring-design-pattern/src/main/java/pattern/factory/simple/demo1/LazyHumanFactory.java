package pattern.factory.simple.demo1;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午7:07
 * @Version 1.0
 */

import java.util.HashMap;
import java.util.Map;

public class LazyHumanFactory {

    // 定义一个map，初始化过的Human对象都放在这里
    private static Map<String, Human> humans = new HashMap();

    // 定义一个烤箱，泥巴塞进去，人就出来，这个太先进了
    public static Human createHuman(Class c) {
        Human human = null;

        try {
            if(humans.containsKey(c.getSimpleName())) {
                human = humans.get(c.getSimpleName());
            }else {
                human = (Human) Class.forName(c.getName()).newInstance();
                // 放到map中
                humans.put(c.getSimpleName(), human);
            }

        } catch (InstantiationException e) {
            e.printStackTrace();
            System.out.println("必须指定人种的颜色!");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.out.println("人种定义错误！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("混蛋，你指定的人种找不到！");
        }

        return human;
    }
}
