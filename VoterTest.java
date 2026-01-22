// VoterTest.java
public class VoterTest {
    public static void main(String[] args) {
        try {
            Voter v1 = new Voter(1001, "Suresh", 20);
            System.out.println(v1);
            // Voter v2 = new Voter(1002, "Karthik", 16); // test exception
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}