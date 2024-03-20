// Create a sort logic in java to sort out the length of the string

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {

        String[] strings = { "apple", "banana", "orange", "grape", "pineapple" };

        Arrays.sort(strings, Comparator.comparingInt(String::length));

        System.out.println("Sorted strings based on length:");

        for (String str : strings) {
            System.out.println(str);
        }

    }

}
