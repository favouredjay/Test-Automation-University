import java.security.SecureRandom;

public class RollDiceExercise {
    public static void main(String[] args) throws InterruptedException {
        SecureRandom random = new SecureRandom();
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRoll =5;

        System.out.println("Let's Begin");
        Thread.sleep(1000);

        for(int i = 1; i<=maxRoll; i++){
            int dice = random.nextInt(6) + 1;
            currentSpace += dice;

            if(currentSpace == lastSpace){
                System.out.println("You win");
            }
            else if(currentSpace > lastSpace ){
                System.out.println("You lost");
                System.out.println("You are on space " + currentSpace + " which is more than space 20");
            }
            else if(i == maxRoll && currentSpace < lastSpace){
                System.out.println("You lost, you are currently on " + currentSpace);
                System.out.println("You did not make it to space 20 at all");
            }
            else {
                int spacesToGo = lastSpace - currentSpace;
                System.out.println("You've rolled a " + currentSpace + " You need to roll " + spacesToGo + " to win" +
                        "" );
            }
            Thread.sleep(1000);
            System.out.println();
        }

    }
}
