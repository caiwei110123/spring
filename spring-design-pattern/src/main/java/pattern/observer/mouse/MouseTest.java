package pattern.observer.mouse;


import java.lang.reflect.Method;

/**
 * Created by Tom on 2018/3/17.
 */
public class MouseTest {

    public static void main(String[] args) {

        /*
        * var input = document.getElementById("username");
        * input.addLisenter("click",function(){
        *
        *     alert("�����������ı���");
        *
        * });
        *
        *
        * */

        //�۲��ߺͱ��۲���֮��û�б�Ȼ��ϵ
        //ע���ʱ�򣬲Ų�����ϵ


        //����


        try {
//            MouseEventCallback callback = new MouseEventCallback();
//            Method onClick = MouseEventCallback.class.getMethod("onClick", Event.class);


            //��Ϊ�ĵ������ĵ����¼�
            Mouse mouse = new Mouse();
//            mouse.addLisenter(MouseEventType.ON_CLICK, callback,onClick);

            mouse.click();

        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
