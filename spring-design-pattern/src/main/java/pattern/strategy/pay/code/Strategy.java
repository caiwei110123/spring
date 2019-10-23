package pattern.strategy.pay.code;

public  abstract class Strategy {
	
	public int num;
	public double price;
	
	public abstract double calcMoney();

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	} 

	
}
