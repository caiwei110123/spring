package pattern.proxy.jdk;

import pattern.proxy.staticed.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * Created by Tom on 2018/3/10.
 */
public class JDKProxyTest {

    public static void main(String[] args) {

        try {
            Person obj = (Person)new JDK58().getInstance(new XieMu());
            System.out.println(obj.getClass());
            obj.findJob();


            //ԭ��
            //1���õ��������������ã����һ�ȡ���������еĽӿڣ������ȡ
            //2��JDK Proxy����������һ���µ��ࡢͬʱ�µ���Ҫʵ�ֱ�����������ʵ�ֵ����еĽӿ�
            //3����̬����Java���룬���¼ӵ�ҵ���߼�������һ�����߼�����ȥ���ã��ڴ��������֣�
            //4�����������ɵ�Java����.class
            //5�������¼��ص�JVM������
            //����������̾ͽ��ֽ�������

            //JDK���и��淶��ֻҪҪ��$��ͷ��һ�㶼���Զ����ɵ�

            //ͨ�������빤�߿��Բ鿴Դ����
            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("/Users/cw/$Proxy0.class");
            os.write(bytes);
            os.close();





        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
