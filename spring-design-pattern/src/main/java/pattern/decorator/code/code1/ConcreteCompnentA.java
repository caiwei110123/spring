package pattern.decorator.code.code1;


public class ConcreteCompnentA  extends Decorator {
	
	private String addedState;

	@Override
	public void Operation() {
		super.Operation();
		addedState = "New 	State";
		System.out.println("ConcreteCompnentA  "+addedState);
	}
	

}
