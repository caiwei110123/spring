package pattern.proxy.jdk;

import pattern.proxy.staticed.Person;

/**
 * Created by Tom on 2018/3/10.
 */
public class XieMu implements Person {

    @Override
    public void findLove(){
        System.out.println("�߸�˧");
        System.out.println("���180cm");
        System.out.println("�ش�6�鸹��");

    }

    @Override
    public void zufangzi() {
        System.out.println("�ⷿ��");
    }

    @Override
    public void buy() {
        System.out.println("����");
    }

    @Override
    public void findJob() {
        System.out.println("��н20K-50k");
        System.out.println("�ҹ���");
    }
}
