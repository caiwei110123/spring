package pattern.decorator.code.code1;

/**
 * 装饰类
 */
public  abstract class Decorator  extends Component{

	/**
	 * 聚合关系
	 */
	protected Component component;

	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void Operation() {
		if(component!=null){
			component.Operation();
		}
		
	}
	
	
	
}
