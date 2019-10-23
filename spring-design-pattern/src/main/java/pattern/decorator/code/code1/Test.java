package pattern.decorator.code.code1;


public class Test {
	public static void main(String[] args) {
		ConcreteCompnent concreteCompnent = new ConcreteCompnent();
		ConcreteCompnentA  concreteCompnentA  = new ConcreteCompnentA();
		concreteCompnentA.setComponent(concreteCompnent);
		concreteCompnentA.Operation();


		//ConcreteCompnentB concreteCompnentB  = new ConcreteCompnentB();
		//		concreteCompnentB.setComponent(concreteCompnent);
		//		concreteCompnentB.Operation();


	}

}
