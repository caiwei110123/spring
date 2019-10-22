package pattern.proxy.jdk;

import pattern.proxy.staticed.Person;

/**
 * Created by Tom on 2018/3/10.
 */
public class XieMu implements Person {

    public void findLove(){
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("胸大，6块腹肌");

    }

    public void zufangzi() {
        System.out.println("租房子");
    }

    public void buy() {
        System.out.println("买东西");
    }

    public void findJob() {
        System.out.println("月薪20K-50k");
        System.out.println("找工作");
    }
}
