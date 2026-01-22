import java.util.HashMap;

class StudentGradeManager {
    private HashMap<String, Integer> studentGrades;

    public StudentGradeManager() {
        studentGrades = new HashMap<>();
    }

    // Add a new student with grade
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Added: " + name + " with grade " + grade);
    }

    // Remove a student
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Removed student: " + name);
        } else {
            System.out.println("Student " + name + " not found");
        }
    }

    // Display grade by name
    public void displayGrade(String name) {
        Integer grade = studentGrades.get(name);
        if (grade != null) {
            System.out.println(name + "'s grade: " + grade);
        } else {
            System.out.println("Student " + name + " not found");
        }
    }

    // Display all students
    public void displayAll() {
        System.out.println("\nAll Students and Grades:");
        for (String name : studentGrades.keySet()) {
            System.out.println(name + " -> " + studentGrades.get(name));
        }
    }
}

