package pattern.composite.code;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/20  下午4:36
 * @Version 1.0
 */
//公司接口
public interface Company {

    void add(Company company);

    void remove(Company company);

    //展示树形结构

    void display(int depth);

    //不同部门所具有的各自的职责
    void duty();
}