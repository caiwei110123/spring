package pattern.factory.abs.demo1;

/**
 * ����������
 *
 * @author : yilie
 * @date : 2019/12/18  ����7:16
 * @Version 1.0
 */

/**
 * @Description:
 * ����������Щ���͵��ˣ��г���
 * java enum���ͼ����ã�������Ҫʹ�ö�̬���̳еȷ���
 */
public enum HumanEnum {

    YellowMaleHuman("pattern.factory.abs.demo1.productcluster.YellowMaleHuman"),
    YellowFemaleHuman("pattern.factory.abs.demo1.productcluster.YellowFemaleHuman"),
    WhiteMaleHuman("pattern.factory.abs.demo1.productcluster.WhiteMaleHuman"),
    WhiteFemaleHuman("pattern.factory.abs.demo1.productcluster.WhiteFemaleHuman"),
    BlackMaleHuman("pattern.factory.abs.demo1.productcluster.BlackMaleHuman"),
    BlackFemaleHuman("pattern.factory.abs.demo1.productcluster.BlackFemaleHuman");

    private String value = "";

    private HumanEnum(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}
