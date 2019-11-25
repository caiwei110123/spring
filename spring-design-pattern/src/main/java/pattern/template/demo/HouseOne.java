package pattern.template.demo;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/11/14  ����8:39
 * @Version 1.0
 */
public class HouseOne extends HouseTemplate {

    HouseOne(String name){
        super(name);
    }

    HouseOne(String name, boolean isBuildToilet){
        this(name);
        this.isBuildToilet = isBuildToilet;
    }

    public boolean isBuildToilet;

    @Override
    protected void buildDoor() {
        System.out.println(name +"����Ҫ���÷�����");
    }

    @Override
    protected void buildWindow() {
        System.out.println(name + "�Ĵ���Ҫ���򱱷�");
    }

    @Override
    protected void buildWall() {
        System.out.println(name + "��ǽʹ�ô���ʯ����");
    }

    @Override
    protected void buildBase() {
        System.out.println(name + "�ĵػ�ʹ�ø����ػ�");
    }

    @Override
    protected void buildToilet() {
        System.out.println(name + "�Ĳ������ڶ��Ͻ�");
    }

    @Override
    protected boolean isBuildToilet(){
        return isBuildToilet;
    }

}