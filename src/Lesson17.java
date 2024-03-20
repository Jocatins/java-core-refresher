// *****TYPES OF INTERFACES
// LAMBDA with Functional Interface

@FunctionalInterface
interface Func {
    int add(int i, int j);

}

public class Lesson17 {
    public static void main(String[] args) {

        // Lambda Expression

        Func func = (i, j) -> {

            return i + j;
        };
        func.add(7, 8);
    }
}
