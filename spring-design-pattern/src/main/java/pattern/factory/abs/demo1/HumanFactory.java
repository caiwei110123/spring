package pattern.factory.abs.demo1;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/12/18  ����7:17
 * @Version 1.0
 */

/**
 * @Description:
 * ��ζ�һ���ӿڣ�Ӧ��Ҫ�첻ͬ�Ա���ˣ���Ҫ��ͬ��������
 * ���������¯��������������˺�Ů��
 */
public interface HumanFactory {

    // ���������
    Human createYellowHuman();

    // ���������
    Human createWhiteHuman();

    // ���������
    Human createBlackHuman();

}
