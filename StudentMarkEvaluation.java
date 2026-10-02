import java.util.Scanner;

public class StudentMarkEvaluation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the student's mark.
        System.out.print("Enter Student Mark: ");
        int studentMark = input.nextInt();

        // Check if the student qualifies for a distinction.
        if (studentMark >= 75) {
            System.out.println("Student qualifies for a distinction.");
        }

        // Check whether the student has passed or failed.
        if (studentMark >= 50) {
            System.out.println("Congratulations, you passed!");
            System.out.println("You may proceed to the next module.");
        } else {
            System.out.println("Unfortunately, you have failed.");
            System.out.println("Please consult your lecturer for further guidance.");
        }

        input.close();
    }
}
