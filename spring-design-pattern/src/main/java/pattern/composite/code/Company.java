package pattern.composite.code;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/12/20  ����4:36
 * @Version 1.0
 */
//��˾�ӿ�
public interface Company {

    void add(Company company);

    void remove(Company company);

    //չʾ���νṹ

    void display(int depth);

    //��ͬ���������еĸ��Ե�ְ��
    void duty();
}