package Tests.T2014A;

public class A {
    private int _x;

    public A() {
        System.out.println(" A Constructor has been called");
        _x = 0;
    }

    public int x() {
        return _x;
    }

    private class B {
        B() {
            System.out.println("B Constructor has been called");

            _x = 42;

        }
    }

    void foo() {
        System.out.println(" foo function has been called");
        B b = new B();
    }
}




