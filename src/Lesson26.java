import java.util.*;

// SORTING VALUES

class Studentin implements Comparable<Studentin> {
    int age;
    String name;

    public String toString() {
        return "Studentin [age=" + age + ", name=" + name + "]";
    }

    public Studentin(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int compareTo(Studentin st) {
        if (this.age > st.age)
            return 1;
        else
            return -1;
    }

}

public class Lesson26 {
    public static void main(String[] args) {

        Comparator<Studentin> comparator = (i, j) -> i.age > j.age ? 1 : -1;

        List<Studentin> studs = new ArrayList<>();

        studs.add(new Studentin(23, "nathan"));
        studs.add(new Studentin(24, "jod"));
        studs.add(new Studentin(30, "sandra"));
        studs.add(new Studentin(23, "cynthia"));

        // Sorting based on Preference
        Collections.sort(studs, comparator);

        for (Studentin s : studs) {
            System.out.println(s);
        }

        // System.out.println(studs); // [1, 4,

    }

}
