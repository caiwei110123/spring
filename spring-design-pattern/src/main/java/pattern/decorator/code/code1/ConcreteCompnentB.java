package pattern.decorator.code.code1;


public class ConcreteCompnentB  extends Decorator {
	

	@Override
	public void Operation() {
		super.Operation();
		AddedBehavior();
		System.out.println("ConcreteCompnentB");
	}
	

	private void AddedBehavior(){
		System.out.println("ConcreteCompnentB -----AddedBehavior");
	}
}
