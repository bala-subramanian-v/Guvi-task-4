// AgeNotWithinRangeException.java
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// NameNotValidException.java
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student.java
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {

        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not between 15 and 21");
        }

        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Name contains numbers or special symbols");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name +
                ", age=" + age + ", course=" + course + "]";
    }
}
