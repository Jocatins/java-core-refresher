// Learning Static keyword

class Mobile {
    String brand;
    int price;
    static String name;
    // static means that you are making something as a member of a class

    static {
        // Static block is used to initialize the static variable
        name = "Phone";
        System.out.println("in the static block");
    }

    public Mobile() {
        brand = "";
        price = 900;
        System.out.println("in the constructor");
    }

    // instance method
    public void show() {
        System.out.println(brand + " " + price + " " + name);
    }

    // static method
    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " " + obj.price + " " + name);
    }
}

public class Lesson3 {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 2000;
        // Static variables should be called with their className
        Mobile.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 2000;
        // Static variables should be called with their className
        Mobile.name = "Smartphone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);

    }
}
