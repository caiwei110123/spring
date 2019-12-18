package pattern.factory.abs.demo1;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/18  下午7:11
 * @Version 1.0
 */

/**
 *
 * @Description:
 * 定义一个人类的统称，问题出来了，刚刚定义的时候忘记定义性别了
 * 这个重要的问题非修改不可，否则这个世界上太多太多的东西不存在了
 */
public interface Human {

    // 首先定义什么是人类

    // 人会笑，表达愉快
    void laugh();

    // 人会哭，表达悲伤
    void cry();

    // 人会说话
    void talk();

    // 定义性别
    void sex();

}
