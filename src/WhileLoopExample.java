import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) throws InterruptedException {

        double rate = 15;
        int maxHoursWorked = 40;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of hours worked");
        int hoursWorked = input.nextInt();

        while (hoursWorked > maxHoursWorked || hoursWorked < 1){
            System.out.println("Hours must be between 1 and 40");
            Thread.sleep(1000);
            System.out.println("Enter number of hours worked");
            hoursWorked = input.nextInt();
        }
    double grossPay = rate * hoursWorked;
        System.out.println("Your gross pay is " + grossPay);
    }
}
