package pattern.factory.simple.demo1;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/12/18  ����6:29
 * @Version 1.0
 */

public class HumanFactory {

    // ����һ�����䣬�������ȥ���˾ͳ��������̫�Ƚ���
    public static Human createHuman(Class c) {
        Human human = null;

        try {
            // ����һ������
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
            // ��Ҫ�ǲ�˵��������ɫ�Ļ���û������Ҫ�׵ĺڵģ���˵���˲źÿ�
            System.out.println("����ָ�����ֵ���ɫ!");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            // ��������������⣬�ǾͿ���������
            System.out.println("���ֶ������");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            // �����˵�����֣��ҵ������������ȥ����
            System.out.println("�쵰����ָ���������Ҳ�����");
        }

        return human;
    }

}
