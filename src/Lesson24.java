// collection API--> concept
// Collection -> Interface
// Collections -> Class

import java.util.*;

public class Lesson24 {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();

        // Set supports unique values only, so it doesn't allow duplicates
        // It does not maintain the order of elements
        // Set<Integer> setNums = new HashSet<Integer>();
        // to make the values sorted use TreeSet
        // Set<Integer> setNums = new TreeSet<Integer>();
        Collection<Integer> setNums = new TreeSet<Integer>();

        nums.add(4);
        nums.add(8);
        nums.add(9);
        nums.add(1);

        System.out.println("List get Index" + nums.get(2));
        System.out.println("List get Index of" + nums.indexOf(1));

        // for (int n : nums) {
        // System.out.println(n);
        // }

        setNums.add(42);
        setNums.add(38);
        setNums.add(59);
        setNums.add(31);
        setNums.add(21);
        setNums.add(21);

        // for (int n : setNums) {
        // System.out.println(n);
        // }

        Iterator<Integer> values = setNums.iterator();

        while (values.hasNext())
            System.out.println(values.next());

    }

}
