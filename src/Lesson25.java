//  ******************* MAP *******************

import java.util.*;

public class Lesson25 {

    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("nico", 23);
        students.put("titan", 2);
        students.put("okay", 23);
        students.put("chi", 23);

        System.out.println(students.keySet());

        for (String key : students.keySet()) {
            System.out.println(key + " " + students.get(key));
        }
    }

}
