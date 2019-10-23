package pattern.strategy.pay.code;

public class StrategyA  extends Strategy{

	
	@Override
	public double calcMoney() {
		System.out.println("normal");
		return  price*num;
	}

}
