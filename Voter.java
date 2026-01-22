// InvalidAgeForVoterException.java
class InvalidAgeForVoterException extends Exception {
    public InvalidAgeForVoterException(String message) {
        super(message);
    }
}

// Voter.java
class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) throws InvalidAgeForVoterException {
        if (age < 18) {
            throw new InvalidAgeForVoterException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Voter [voterId=" + voterId + ", name=" + name + ", age=" + age + "]";
    }
}