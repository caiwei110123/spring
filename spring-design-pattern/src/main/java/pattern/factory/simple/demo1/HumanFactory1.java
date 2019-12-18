package pattern.factory.simple.demo1;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/12/18  ����6:33
 * @Version 1.0
 */

import java.util.List;
import java.util.Random;

/**
 * @Description: ����¯������Human�Ĺ���
 * @author Jed
 * @date 2018��1��10��
 */
public class HumanFactory1 {

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

    // Ů������ˣ���һ�������������¯��������ɶ���־�ɶ����
    public static Human createHuman() {

        // ����һ�����͵�����
        Human human = null;

        // �����ǻ���ж��ٸ�ʵ���࣬���ٸ�����
        List<Class> concreteHumanList = ClassUtil.getAllClassByInterface(Human.class); //�����˶�������
        // ����¯�Լ���ʼ���ճ�ʲô�˾�ʲô��
        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());

        human = createHuman(concreteHumanList.get(rand));

        return human;
    }

}
