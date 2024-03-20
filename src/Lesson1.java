// Multi dimensional arrays - Jagged Arrays

public class Lesson1 {

    public static void main(String[] args) {

        // Two dimensional array
        int nums[][] = new int[3][4];

        // Jagged Array
        int num[][] = new int[3][];

        num[0] = new int[3];
        num[1] = new int[3];
        num[2] = new int[2];

        // Looping for multi-dimensional arrays
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // Using Enhanced For Loop
        System.out.println("Enhanced for loop");
        for (int n[] : nums) {
            for (int x : n) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        // Looping for jagged Arrays
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 10);
            }
        }
        // Using Enhanced loop
        System.out.println("Jagged Loop");
        for (int x[] : num) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }

}
