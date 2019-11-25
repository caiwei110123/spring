package pattern.template.demo;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/11/14  下午8:40
 * @Version 1.0
 */
public class HouseTwo extends HouseTemplate {

    HouseTwo(String name){
        super(name);
    }

    @Override
    protected void buildDoor() {
        System.out.println(name + "的门采用木门");
    }

    @Override
    protected void buildWindow() {
        System.out.println(name + "的窗户要向南");
    }

    @Override
    protected void buildWall() {
        System.out.println(name + "的墙使用玻璃制造");
    }

    @Override
    protected void buildBase() {
        System.out.println(name + "的地基使用花岗岩");
    }

    @Override
    protected void buildToilet() {
        System.out.println(name + "的厕所建在西北角");
    }

}