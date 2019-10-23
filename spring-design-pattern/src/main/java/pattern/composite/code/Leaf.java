package pattern.composite.code;

/**
 * 叶子节点
 */
public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component c) {
		System.out.println("leaf  can not add");
		
	}

	@Override
	public void remove(Component c) {
		System.out.println("leaf  can not remove");
		
	}

	@Override
	public void display(int dept) {
		System.out.println("the "+dept+" floor   "+name+"   has no son");
		
	}

}
