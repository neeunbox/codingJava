package ex06.interfaceable;

public class A {
    private X x;

    public void setX(X x) {
        this.x = x;
    }

    public A() {
    }

    public void print() {
        int total = x.total();

        System.out.printf("total is : %d\n", total);
    }

}
