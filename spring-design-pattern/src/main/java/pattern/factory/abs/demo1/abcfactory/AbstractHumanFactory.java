package pattern.factory.abs.demo1.abcfactory;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午7:17
 * @Version 1.0
 */

import pattern.factory.abs.demo1.Human;
import pattern.factory.abs.demo1.HumanEnum;
import pattern.factory.abs.demo1.HumanFactory;

/**
 * @Description: 编写一个抽象类，根据enum创建一个人类出来
 */
public abstract class AbstractHumanFactory implements HumanFactory {

    // 给定一个性别人种，创建一个人类出来 专业术语是产生产品等级
    protected Human createHuman(HumanEnum humanEnum) {
        Human human = null;
        // 如果传递进来不是一个Enum中具体的一个Element的话，则不处理
        if(!humanEnum.getValue().equals("")) {
            try {
                human = (Human) Class.forName(humanEnum.getValue()).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                // 因为使用了enum，这个种异常情况不会产生了，除非你的enum有问题
            }
        }
        return human;
    }

}

