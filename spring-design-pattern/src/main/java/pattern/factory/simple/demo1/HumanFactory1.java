package pattern.factory.simple.demo1;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午6:33
 * @Version 1.0
 */

import java.util.List;
import java.util.Random;

/**
 * @Description: 八卦炉，创造Human的工厂
 * @author Jed
 * @date 2018年1月10日
 */
public class HumanFactory1 {

    // 定义一个烤箱，泥巴塞进去，人就出来，这个太先进了
    public static Human createHuman(Class c) {
        Human human = null;

        try {
            // 产生一个人种
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
            // 你要是不说个人种颜色的话，没法烤，要白的黑的，你说话了才好烤
            System.out.println("必须指定人种的颜色!");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            // 定义的人种有问题，那就烤不出来了
            System.out.println("人种定义错误！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            // 你随便说个人种，我到哪里给你制造去？！
            System.out.println("混蛋，你指定的人种找不到！");
        }

        return human;
    }

    // 女娲生气了，把一团泥巴塞到八卦炉，哎产生啥人种就啥人种
    public static Human createHuman() {

        // 定义一个类型的人类
        Human human = null;

        // 首先是获得有多少个实现类，多少个人种
        List<Class> concreteHumanList = ClassUtil.getAllClassByInterface(Human.class); //定义了多少人种
        // 八卦炉自己开始想烧出什么人就什么人
        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());

        human = createHuman(concreteHumanList.get(rand));

        return human;
    }

}
