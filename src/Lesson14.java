// ***************** INTERFACES ****************

// class - class -> extends
// interface - interface -> extends
// class - interface -> extends

// By default every method inside an interface is a public abstract
interface Computer {

    // By default all the variables inside the interface are final and static
    final int age = 90;

    void code();

    void config();

}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run");
    }

    public void config() {
    }

}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run, faster");
    }

    public void config() {
    }
}

class Developer {
    public void devApp(Computer pc) {
        pc.code();
    }
}

public class Lesson14 {

    public static void main(String[] args) {

        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        Developer nico = new Developer();
        nico.devApp(laptop);
        nico.devApp(desktop);
    }

}
