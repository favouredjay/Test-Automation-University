import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfStudents = 23;
        int numberOfTest = 4;
        int total = 0;
        int i;
        for ( i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < numberOfTest; j++) {
                System.out.println("Enter score of test " + (j+1));
                int score = input.nextInt();
                total += score;
            }
            int average = total/numberOfTest;
            System.out.println("Student "+ (i+1) +"'s " + " total score is " + total + " and Average is " + average );
        }

    }
}
