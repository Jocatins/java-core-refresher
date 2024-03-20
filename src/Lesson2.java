class Student {
    int rollNo;
    String name;
    int marks;
}

public class Lesson2 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollNo = 101;
        s1.name = "Zara";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollNo = 11;
        s2.name = "Phillips";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollNo = 102;
        s3.name = "Brave";
        s3.marks = 90;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " :" + students[i].marks);
        }

        System.out.println("------------Enhanced for loop---------");
        for (Student stud : students) {
            System.out.println(stud.name + " " + stud.marks);
        }

    }

}
