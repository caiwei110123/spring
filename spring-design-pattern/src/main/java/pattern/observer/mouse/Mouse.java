package pattern.observer.mouse;

import pattern.observer.core.EventLisenter;

/**
 * ���۲���
 * �������Swing�����Ļ�����һ��������ʶ�ĸо�
 * Created by Tom on 2018/3/17.
 */
public class Mouse extends EventLisenter {

    public void click(){
        System.out.println("��굥��");
        this.trigger(MouseEventType.ON_CLICK);
    }


    public void doubleClick(){
        System.out.println("���˫��");
        this.trigger(MouseEventType.ON_DOUBLE_CLICK);
    }

    public void up(){
        System.out.println("��굯��");
        this.trigger(MouseEventType.ON_UP);
    }

    public void down(){
        System.out.println("��갴��");
        this.trigger(MouseEventType.ON_DOWN);
    }


    public void wheel(){
        System.out.println("������");
        this.trigger(MouseEventType.ON_WHEEL);
    }

    public void move(){
        System.out.println("����ƶ�");
        this.trigger(MouseEventType.ON_MOVE);
    }

    public void over(){
        System.out.println("�����ͣ");
        this.trigger(MouseEventType.ON_OVER);
    }

}
