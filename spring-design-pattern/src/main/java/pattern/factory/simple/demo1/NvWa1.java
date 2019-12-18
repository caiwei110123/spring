package pattern.factory.simple.demo1;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午6:33
 * @Version 1.0
 */

public class NvWa1 {

    public static void main(String[] args) {
        // 女娲烦躁了，爱是啥人种就是啥人种，烧吧
        for(int i = 0; i < 1000000; i++) {
            System.out.println("随机产生人种了...");
            Human human = HumanFactory1.createHuman();
            human.cry();
            human.laugh();
            human.talk();
        }
    }

}