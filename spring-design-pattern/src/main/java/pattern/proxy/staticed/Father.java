package pattern.proxy.staticed;

/**
 * Created by Tom on 2018/3/10.
 */
public class Father {

    private Person person;

    //û�취��չ
    public Father(Person person){
        this.person = person;
    }

    //Ŀ���������ø��õ�
    public void findLove(){
        System.out.println("�������Ҫ����ɫ");
        this.person.findLove();
        System.out.println("˫����ĸ�ǲ���ͬ��");
    }

}
