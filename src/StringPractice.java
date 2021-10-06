import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String words = "I love Jesus";
        String str = "ILoveJesus";
        String [] word = words.split(" ");
        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);

        }
        for (int i = words.length()-1; i >=0 ; i--) {
            System.out.print(words.charAt(i));

        }
        StringBuilder str2 = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {

            if(Character.isUpperCase(str2.charAt(i))){
                str2.insert(i, " ");
                i++;
            }


        }
        System.out.println();
        System.out.println(str2);

    }
}
