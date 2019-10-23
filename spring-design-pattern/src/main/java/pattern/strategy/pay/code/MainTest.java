package pattern.strategy.pay.code;

public class MainTest {

	public static void main(String[] args) {
		int num = 5;
		double price = 5.36;
		Context c = new Context(2);
		System.out.println(c.getResult(num,price));
	}
}
