import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/27  上午10:50
 * @Version 1.0
 */
public class test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext appCtx1 = new AnnotationConfigApplicationContext();

		appCtx1.scan("demo1*");
		appCtx1.refresh();
	}
}
