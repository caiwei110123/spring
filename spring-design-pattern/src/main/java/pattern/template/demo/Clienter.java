package pattern.template.demo;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/11/14  ����8:40
 * @Version 1.0
 */
public class Clienter {

    public static void main(String[] args){
        HouseTemplate houseOne = new HouseOne("����1", false);
        HouseTemplate houseTwo = new HouseTwo("����2");
        houseOne.buildHouse();
        houseTwo.buildHouse();
    }

}