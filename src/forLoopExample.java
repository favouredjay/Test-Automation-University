import java.util.Scanner;

public class forLoopExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Quantity of goods picked");
        int quantity = input.nextInt();

        double total = 0;
        for(int i = 0; i<quantity; i++){
            System.out.println("Enter cost of quantity");
            double price = input.nextDouble();

            total += price;
        input.close();
        }
        System.out.println("Your total is "+total);
    }
}
