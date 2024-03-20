//  *********** Handling Exceptions ************//

// Exceptions are runtime errors

public class Lesson18 {

    public static void main(String[] args) {

        int i = 4;
        int j = 0;

        int nums[] = new int[4];

        try {
            j = 24 / i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error  " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong " + e);
        }
        System.out.println(j);
        System.out.println("Code ended!!!");
    }

}
