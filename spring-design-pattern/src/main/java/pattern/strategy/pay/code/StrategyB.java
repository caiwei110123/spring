package pattern.strategy.pay.code;

public class StrategyB extends Strategy{

	public double zhekou ;
	
	public StrategyB(double zhekou) {
		super();
		this.zhekou = zhekou;
	}

	@Override
	public double calcMoney() {
	System.out.println("zhekou");
		return price*zhekou*num;
	}

}
