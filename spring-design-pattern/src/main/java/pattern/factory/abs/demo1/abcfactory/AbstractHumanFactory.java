package pattern.factory.abs.demo1.abcfactory;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/12/18  ����7:17
 * @Version 1.0
 */

import pattern.factory.abs.demo1.Human;
import pattern.factory.abs.demo1.HumanEnum;
import pattern.factory.abs.demo1.HumanFactory;

/**
 * @Description: ��дһ�������࣬����enum����һ���������
 */
public abstract class AbstractHumanFactory implements HumanFactory {

    // ����һ���Ա����֣�����һ��������� רҵ�����ǲ�����Ʒ�ȼ�
    protected Human createHuman(HumanEnum humanEnum) {
        Human human = null;
        // ������ݽ�������һ��Enum�о����һ��Element�Ļ����򲻴���
        if(!humanEnum.getValue().equals("")) {
            try {
                human = (Human) Class.forName(humanEnum.getValue()).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                // ��Ϊʹ����enum��������쳣�����������ˣ��������enum������
            }
        }
        return human;
    }

}

