package lesson1.inner;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer(5);

        Outer.Inner inner = outer.new Inner(8);
        inner.printOutValue();

        Outer.InnerStaticClass staticClass = new Outer.InnerStaticClass();
        staticClass.print();


    }

    private void someMethod(){
        class LocalClass{
            int x;
            int y;

            public LocalClass(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }

        LocalClass lc = new LocalClass(4,9);

    }
}
