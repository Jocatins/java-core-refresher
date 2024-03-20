// ********* Annotation ***********

class ABC {

    public void showTheDataWhichBelongHereToTheClass() {
        System.out.println("In the ABC class");
    }
}

class DEF extends ABC {
    @Override
    public void showTheDataWhichBelongHereToTheClass() {
        System.out.println("In the DEF class");
    }
}

public class Lesson16 {
    public static void main(String[] args) {
        DEF obj = new DEF();
        obj.showTheDataWhichBelongHereToTheClass();
    }

}
