//  ******** Polymorphism on run time compilation

class AB {
    public void show() {
        System.out.println("in the A class");
    }
}

class BA extends AB {
    public void show() {
        System.out.println("in the B class");
    }
}

class CA extends AB {
    public void show() {
        System.out.println("in the C class");
    }
}

public class Lesson8 {
    public static void main(String[] args) {

        AB obj = new AB();
        obj.show();

        obj = new BA();
        obj.show();

        obj = new CA();
        obj.show();

    }
}
