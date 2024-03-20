// ******************* INHERITANCE ********************

//  *******************Super-class ***************************
class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int subtract(int n1, int n2) {
        return n1 - n2;
    }
}

// ****** Sub-class **********
class AdvancedCalc extends Calc { //// Inheritance
    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public int divide(int n1, int n2) {
        return n1 / n2;
    }
}

class VeryAdvancedCalc extends AdvancedCalc {
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}

public class Lesson6 {
    public static void main(String[] args) {

        VeryAdvancedCalc advancedCalc = new VeryAdvancedCalc();
        int r1 = advancedCalc.add(67, 78);
        int r2 = advancedCalc.divide(6, 2);
        double r3 = advancedCalc.power(6, 2);

        System.out.println(r1 + " " + r2 + " " + r3);

    }

}
