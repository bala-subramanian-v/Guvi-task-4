import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day position (0-6): ");

        try {
            int index = sc.nextInt();
            System.out.println("Day name: " + weekdays[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Day index must be between 0 and 6");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
        } finally {
            sc.close();
        }
    }
}