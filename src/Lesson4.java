//   ************ ENCAPSULATION *****AND ******CONSTRUCTORS*********

class Human {
    private int age;
    private String name;

    public Human() { // Default Constructor
        age = 12;
        name = "Sphinx";
    }

    public Human(int age, String name) { // Parameterized Constructor
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Lesson4 {
    public static void main(String[] args) {

        Human obj = new Human();
        Human obj1 = new Human(45, "Paper");

        // obj.setAge(76);
        // obj.setName("Titan");

        System.out.println(obj.getName() + " is " + obj.getAge() + " years old");
        System.out.println(obj1.getName() + " is " + obj1.getAge() + " years old");

    }

}
