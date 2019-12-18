package pattern.factory.abs.demo1;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午7:17
 * @Version 1.0
 */

/**
 * @Description:
 * 这次定一个接口，应该要造不同性别的人，需要不同的生产线
 * 那这个八卦炉必须可以制造男人和女人
 */
public interface HumanFactory {

    // 制造黄种人
    Human createYellowHuman();

    // 制造白种人
    Human createWhiteHuman();

    // 制造黑种人
    Human createBlackHuman();

}
