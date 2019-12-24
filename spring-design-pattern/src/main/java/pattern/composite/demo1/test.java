package pattern.composite.demo1;

public class test {

    public static void main(String[] args) {
        Component c = new Composite("root");

        Component a = new Composite("a");

        c.add(a);

        Component b = new Composite("b");

        c.add(b);

        Component leaf = new Leaf("b1");

        b.add(leaf);

        Component a1 = new Composite("a1");

        a.add(a1);

        Component a2 = new Composite("a2");

        a.add(a2);

        Component a11 = new Composite("a11");

        a1.add(a11);

        Component a12 = new Composite("a12");

        a1.add(a12);

        Component a21 = new Leaf("a21");

        a2.add(a21);

        Component a22 = new Leaf("a22");

        a2.add(a22);

        c.display(2);

    }
}
