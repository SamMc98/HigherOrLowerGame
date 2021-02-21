import java.util.Scanner;
import java.util.Random;
class Main {
    public static void main(String[] args) {
           Random randomNum = new Random();
        int randomInt = randomNum.nextInt(16);
        int turn = 1;

            Scanner number= new Scanner(System.in);
        System.out.println("Please guess a number between 1 and 15");
            int userNumber = number.nextInt();

            while (userNumber != randomInt){
              if (userNumber < randomInt){
              System.out.println("Guess higher!");
              userNumber = number.nextInt();
              turn++;
              }else if (userNumber > randomInt){
              System.out.println("Guess lower!");
              userNumber = number.nextInt();
              turn++;
            } 
            if (userNumber == randomInt){
      System.out.println("You got it! It took you " + turn + " turns!");
            }          
          }

          if (userNumber == randomInt && turn == 1){
            System.out.println("You got it! It took you " + turn + " turn!");
          }
          number.close();
        }
}