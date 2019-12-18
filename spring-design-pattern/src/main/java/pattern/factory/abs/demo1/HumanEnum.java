package pattern.factory.abs.demo1;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午7:16
 * @Version 1.0
 */

/**
 * @Description:
 * 世界上有哪些类型的人，列出来
 * java enum类型简单易用，尽量不要使用多态、继承等方法
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
