// *********** Stream APIs **************

import java.util.*;
import java.util.stream.Stream;

public class Lesson27 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(6, 4, 2, 5, 6, 7, 8, 4, 2, 9);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n % 2 != 0);
        // Stream<Integer> s3 = s2.map(n -> n * 2);
        // int result = s3.reduce(0, (c, e) -> c + e);
        // System.out.println(result);

        // int result = nums.stream().filter(n -> n % 2 != 0).map(n -> n * 2).reduce(0,
        // (c, e) -> c + e);

        // To be able to work with streams so as to sort the values

        Stream<Integer> sortedStream = nums.stream().filter(n -> n % 2 != 0);

        sortedStream.forEach(n -> System.out.println(n));
    }
}
