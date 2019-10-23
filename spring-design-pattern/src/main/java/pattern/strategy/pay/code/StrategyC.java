package pattern.strategy.pay.code;

public class StrategyC extends Strategy{

	public double account;
	public double sub;
	
	public StrategyC(double account, double sub) {
		super();
		this.account = account;
		this.sub = sub;
	}

	@Override
	public double calcMoney() {
		System.out.println("song");
		double accounts = price*num;
		if(accounts>account){
			accounts = accounts - sub;
		}
		return accounts;
	}

}
