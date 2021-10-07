import java.util.Scanner;

public class doWhileExamples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean again;
        do {
            System.out.println("Enter first number");
            int firstNumber = input.nextInt();

            System.out.println("Enter second Number");
            int secondNumber = input.nextInt();
            
            int sum = firstNumber + secondNumber;

            System.out.println("The sum of " + firstNumber + "and " + secondNumber + " is " + sum);
            System.out.println("Would you like to start over?");
            again = input.nextBoolean();
        }while (again);

    }
}
