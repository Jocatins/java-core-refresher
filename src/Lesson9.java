// ******* final keyword - which can be used with a variable, class, method

// final like const in JavaScript

final class Cal {
    public void show() {
        System.out.println("In the Cal class");
    }

    final int add(int n1, int n2) {
        return n1 + n2;
    }
}

class CalB {
    public void show() {
        System.out.println("In the Cal class");
    }

    final int add(int n1, int n2) {
        return n1 + n2;
    }
}

class AdCal extends CalB {

}

public class Lesson9 {
    public static void main(String[] args) {

        // final int num = 9;
        Cal objCal = new Cal();
        objCal.show();

        int r1 = objCal.add(12, 9);
        System.out.println(r1);

    }
}
