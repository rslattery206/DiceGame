import java.util.Scanner;
import java.util.Random;

public class Dice {
    public static void main(String[] args) throws InterruptedException {
        int hero; // Player's dice
        int villain; // "Dealer's" dice
        int money = 50; // The player starts with 50$

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a basic dice game. If you win, your wager is doubled. If not, you lose your wager.");

       while (money>0) { //The game always continues unless the player has no money

           int upperbound = 6; //Upperbound of 6 makes numbers generate between 0 and 5
           hero = random.nextInt(upperbound)+1; //Adds 1 to random number to make it 0 through 6
           villain = random.nextInt(upperbound)+1;

           System.out.printf("You have $%d\n", money);
           System.out.println("How much would you like to wager: ");
           int wager = scanner.nextInt();

           while (wager > money || wager < 0) { // Makes it how you can't wager more than your money or a negative number
               System.out.println("Invalid Wager! Enter a new one\n");
               wager = scanner.nextInt();
           }

           System.out.printf("You have rolled %d\n", hero); //Rolls the dice
           System.out.printf("The computer has rolled %d\n", villain);

           Thread.sleep(2000);


           if (hero == villain){
               System.out.println("A Tie! You have received your wager back");
               Thread.sleep(3000);
               System.out.println(" ");
           }
           if (hero > villain){
               System.out.println("You have the higher number! You have doubled your wager");
               money += (wager);      // Adds wager to money
               Thread.sleep(3000);
               System.out.println(" ");
           }
           if (hero < villain){
               System.out.println("The computer has the higher number! You have lost your wager");
               money -= (wager);      // Subtracts wager from money
               Thread.sleep(3000);
               System.out.println(" ");
           }


       }
        System.out.println("You have no more money. This is why gambling is bad");
        System.out.println("Game over!!");
       // If money reaches 0, the while loop stops, and the game ends.
    }

}
