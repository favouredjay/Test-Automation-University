import java.security.SecureRandom;

public class ArrayExamples {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int [] array = new int [6];
        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(67);
            System.out.println("Index " + i + " - " +  array[i]);
        }



    }
}
