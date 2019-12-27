package demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/10/23  下午8:00
 * @Version 1.0
 */
@Service
public class HelloWorldImpl2 implements HelloWorld {

    @Autowired
    Abs1 abs;
    public void printHelloWorld() {
        System.out.println(abs.getMap());
        System.out.println("------222222------按下HelloWorld2.printHelloWorld()------2222222------");
    }

    public String doPrint(ParamObj paramObj) {
        System.out.println("-------22222-----打印HelloWorldImpl2------22222-----");
        return "abc";
    }

}
