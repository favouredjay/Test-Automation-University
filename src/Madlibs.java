import java.util.Scanner;

public class Madlibs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Adjective");
        String adjectives = input.next();

        System.out.println("Enter Season of the year");
        String season = input.next();

        System.out.println("Enter whole number");
        String number = input.next();

        System.out.println("On a " + adjectives + " "+ season + " day, I drink a minimum of " + number + " cups of coffee.");

    }
}
