package pattern.template.demo;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/11/14  ����8:40
 * @Version 1.0
 */
public class HouseTwo extends HouseTemplate {

    HouseTwo(String name){
        super(name);
    }

    @Override
    protected void buildDoor() {
        System.out.println(name + "���Ų���ľ��");
    }

    @Override
    protected void buildWindow() {
        System.out.println(name + "�Ĵ���Ҫ����");
    }

    @Override
    protected void buildWall() {
        System.out.println(name + "��ǽʹ�ò�������");
    }

    @Override
    protected void buildBase() {
        System.out.println(name + "�ĵػ�ʹ�û�����");
    }

    @Override
    protected void buildToilet() {
        System.out.println(name + "�Ĳ�������������");
    }

}