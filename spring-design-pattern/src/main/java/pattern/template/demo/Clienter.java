package pattern.template.demo;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/11/14  下午8:40
 * @Version 1.0
 */
public class Clienter {

    public static void main(String[] args){
        HouseTemplate houseOne = new HouseOne("房子1", false);
        HouseTemplate houseTwo = new HouseTwo("房子2");
        houseOne.buildHouse();
        houseTwo.buildHouse();
    }

}