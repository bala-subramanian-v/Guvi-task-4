public class StudentGradeTest {
    public static void main(String[] args) {
        StudentGradeManager manager = new StudentGradeManager();

        manager.addStudent("Ramesh", 85);
        manager.addStudent("Priya", 92);
        manager.addStudent("Karthik", 78);

        manager.displayGrade("Priya");
        manager.displayAll();

        manager.removeStudent("Karthik");
        manager.displayAll();
    }
}