package pattern.strategy.pay.code;

public class Context {

	Strategy obj = null;

	public Context(Integer type){

		switch(type){
			case 1: {
				StrategyA obj1 = new StrategyA();
				obj = obj1;
				break;
			}
			case 2: {
				StrategyB	obj1 = new StrategyB(0.8);
				obj = obj1;
				break;
			}
			case 3: {
				StrategyC	obj1 = new StrategyC(500,100);
				obj = obj1;
				break;
			}
		}
	}

	public double getResult(int num,double price){
		obj.setNum(num);
		obj.setPrice(price);
		return obj.calcMoney();
	}
}
