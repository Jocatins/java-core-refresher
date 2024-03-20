// ******** THIS * ******** SUPER ****** 

// Super executes the constructor of a super class
// This method executes the constructor of the same class

class A {
    public int n;

    public A() {
        System.out.println("Constructor A");
    }

    public A(int n) {
        super();
        System.out.println("Constructor A with int");
    }

}

class B extends A {
    public B() {
        super();
        System.out.println("Constructor B");
    }

    public B(int n) {
        this();
        System.out.println("Constructor B with int");
    }

}

public class Lesson5 {
    public static void main(String[] args) {

        B objB = new B(7);
        System.out.println(objB.getClass());

    }
}
