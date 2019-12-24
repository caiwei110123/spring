package pattern.composite.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 混合节点，非叶子节点
 */
public class Composite extends Component{

	private List<Component> children = new ArrayList<Component>();
	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override	
	public void add(Component c) {
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		children.remove(c);
	}

	@Override
	public void display(int dept) {
		System.out.println("the "+(dept)+" floor    "+name+"   has son");
		for (int i = 0; i <children .size(); i++) {
			 children.get(i).display(dept+1);
		}
		
	}

}
