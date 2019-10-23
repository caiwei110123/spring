package pattern.observer.subject;

import pattern.observer.core.EventLisenter;

/**
 * Created by Tom on 2018/3/17.
 */
public class Subject extends EventLisenter {

    //ͨ���Ļ������ö�̬����ʵ�ּ�أ������˴�������
    public void add(){
        System.out.println("������ӵķ���");
        trigger(SubjectEventType.ON_ADD);
    }

    public void remove(){
        System.out.println("����ɾ���ķ���");
        trigger(SubjectEventType.ON_RMOVE);
    }

}
