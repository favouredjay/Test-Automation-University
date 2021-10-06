import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {


        double requiredSalary = 3000;
        double requiredYears = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Salary");
        double salary = scanner.nextDouble();

        System.out.println("Enter years");
        double years = scanner.nextDouble();

        if(salary >= requiredSalary){
            if(years > requiredYears){
                System.out.println("Congrats");
            }
            else {
                System.out.println("You should work for more than "+ years + " Year to qualify");
            }

        }
        else{
            System.out.println("You should earn more than "+ salary + " dollars to qualify");
        }
    }
}
