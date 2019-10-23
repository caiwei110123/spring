package pattern.observer.mouse;

import pattern.observer.core.Event;

/**
 * �۲���
 *
 * �ص���Ӧ���߼������Լ�ʵ��
 * Created by Tom on 2018/3/17.
 */
public class MouseEventCallback {

    public void onClick(Event e){
        System.out.println("������굥���Ժ�Ҫִ�е��߼�");
        System.out.println("=======������굥���¼�========\n" + e);
    }

    public void onDoubleClick(Event e){
        System.out.println("=======�������˫���¼�========\n" + e);
    }

    public void onUp(Event e){
        System.out.println("=======������굯���¼�========\n" + e);
    }
    public void onDown(Event e){
        System.out.println("=======������갴���¼�========\n" + e);
    }
    public void onMove(Event e){
        System.out.println("=======��������ƶ��¼�========\n" + e);
    }
    public void onWheel(Event e){
        System.out.println("=======�����������¼�========\n" + e);
    }

    public void onOver(Event e){
        System.out.println("=======���������ͣ�¼�========\n" + e);
    }




}
