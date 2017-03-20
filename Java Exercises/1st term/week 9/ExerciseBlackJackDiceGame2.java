import java.util.*;

public class ExerciseBlackJackDiceGame2 {

   public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      Random r = new Random();

      int d1 = (r.nextInt(6) + 1);
      int d2 = (r.nextInt(6) + 1);
      int diceThrow = d1 + d2;
      int playerTotal = diceThrow;

      System.out.println("You roll a " + d1 + " and a " + d2);
      System.out.println("You start out with a: " + diceThrow);

      String playerChoice = "y";
  	//1.USER THROWS
  	  while (playerChoice.equals("y")) {
         System.out.println("Do you want want to roll the dice again y/n: ");
         playerChoice = console.next();
         if (playerChoice.equals("y")) {
            d1 = (r.nextInt(6) + 1);
            d2 = (r.nextInt(6) + 1);
            System.out.println("You roll a " + d1 + " and a " + d2);
            diceThrow = d1 + d2;
            playerTotal = playerTotal + diceThrow;
            System.out.println("You now have: " + playerTotal);
         }
         if (playerTotal > 21) {
            System.out.println("You exeded 21. The machine wins!");
            return;
         }
         if (playerTotal == 21) {
            System.out.println("BLACKJACK!!!! YOU WIN!!!!");
            return;
         }
         if (playerChoice.equals("n")) {
            int machineDiceThrow = 0;
            int machineTotal = 0;
            while (machineTotal <= 21) {
              d1 = (r.nextInt(6) + 1);
              d2 = (r.nextInt(6) + 1);
              machineDiceThrow = d1 + d2;
              machineTotal = machineTotal + machineDiceThrow;
              if (machineTotal >= 17) {
                if (machineTotal > 21) {
                  System.out.println("Machine has " + machineTotal);
                  System.out.println("Machine exeded 21. YOU WIN!");
                  return;
                } else if (machineTotal > playerTotal) {
                  System.out.println("Machine wins!");
                  System.out.println("Machine has " + machineTotal);
                  System.out.println("You have " + playerTotal);
                  return;
                } else if (machineTotal < playerTotal) {
                  System.out.println("YOU WIN!");
                  System.out.println("Machine has " + machineTotal);
                  System.out.println("You have " + playerTotal);
                  return;
                } else if (machineTotal == playerTotal) {
                  System.out.println("It is a draw!");
                  System.out.println("Machine has " + machineTotal);
                  System.out.println("You have " + playerTotal);
                  return;
                }
              }
            }
         }
      }



  	// 2.MACHINE THROWS
  	// This is more or less the same procedure as above
  	// but you do not ask the machine if it wants to go on.
  	// You have to set up some rules (algorithm) that makes
  	// the machine go on or stop.
  	// And remember that if the user got 21,
  	// then the machine has already lost.
  	// And if the user exeeded 21, then the machine has already won




  	// 3.CHECK WHO WON
  	// Here you will have to check:
  	// 1. Did the user get 21, then he wins
  	// 2. did the user exeed 21, then machine wins
  	// 3. did the machine exeed 21, then user wins
  	// 4. is the users sum larger than the machines, the user win
  	// 5. is the machine sum larger than users, then machine win
  	// 6. did user and machine get the same sum, then it is a draw

   }

}
