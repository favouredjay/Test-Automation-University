import java.util.Scanner;

public class LetterSearchForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        char letter = 'a';

        for (int i = 0; i < word.length(); i++) {
            char check = word.charAt(i);
            if (check == letter || check == 'A') {

                System.out.println(letter + " is present in " + word);
            }else {
                System.out.println(letter + " is not present in " + word);
            }
            break;
        }
    }
}
