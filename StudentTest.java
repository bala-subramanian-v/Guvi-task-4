// StudentTest.java  (this file name matches the public class)
public class StudentTest {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(101, "Ramesh Kumar", 19, "CS");
            System.out.println(s1);
            // Student s2 = new Student(102, "Priya@123", 18, "IT"); // test exception
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}