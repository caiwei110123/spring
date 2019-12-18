package pattern.factory.simple.demo1;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/12/18  ����6:30
 * @Version 1.0
 */

/**
 * @Description: Ů�ϣ����������
 */
public class NvWa {

    public static void main(String[] args) {

        // Ů洵�һ�����ˣ��������ʣ�����㣬����㣬ȱ�ݲ�Ʒ
        System.out.println("��һ���ˣ�������-----------------");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.cry();
        whiteHuman.laugh();
        whiteHuman.talk();

        // Ů洵ڶ������ˣ�������㣬Ȼ���ֳ��˸���Ʒ������
        System.out.println("��һ���ˣ�������-----------------");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.cry();
        blackHuman.laugh();
        blackHuman.talk();

        //���������ˣ���λ�����յ����ã�������
        System.out.println("��һ���ˣ�������-----------------");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.cry();
        yellowHuman.laugh();
        yellowHuman.talk();
    }

}
