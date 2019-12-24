package pattern.decorator.code.code1;


public class Test {
	public static void main(String[] args) {
		Component component = new ConcreteCompnent();
		Decorator  decorator  = new ConcreteCompnentA();
		decorator.setComponent(component);
		decorator.Operation();


		//ConcreteCompnentB concreteCompnentB  = new ConcreteCompnentB();
		//		concreteCompnentB.setComponent(concreteCompnent);
		//		concreteCompnentB.Operation();


	}

}
