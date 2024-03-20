// *** DownCasting and UpCasting

class AA {
    public void showA() {
        System.out.println("In the A class");
    }
}

class BB extends AA {
    public void showB() {
        System.out.println("In the B class");
    }
}

public class Lesson11 {

    public static void main(String[] args) {
        AA objA = (AA) new BB(); // UpCasting
        objA.showA();

        BB objB = (BB) objA; // DownCasting
        objB.showB();
    }
}
