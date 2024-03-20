import java.io.*;
import java.util.Scanner;

public class Lesson20 {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");

        // int num = System.in.read();
        // System.out.println(num);

        // InputStreamReader input = new InputStreamReader(System.in);
        // BufferedReader bufferedReader = new BufferedReader(input);

        // int num = Integer.parseInt(bufferedReader.readLine());

        // System.out.println(num);

        // bufferedReader.close();

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
    }
}
