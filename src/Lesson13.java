// ***********INNER CLASS**************

class Outer {

    public void show() {
        System.out.println("Outer class");

    }

    static class Inner {
        public void config() {
            System.out.println("Inner class");
        }
    }

}

public class Lesson13 {

    public static void main(String[] args) {

        Outer out = new Outer();

        out.show();

        // To call the inner class without the static method

        // Outer.Inner outIn = out.new Inner();

        // To call the inner class with the static method

        Outer.Inner outStatic = new Outer.Inner();

        outStatic.config();

    }

}
