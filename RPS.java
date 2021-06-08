package rockpaper;
import java.util.Scanner;
import java.util.Random;
 
public class rockPaperScissors {
 
    public static void main(String[] args) {
        
         Random random = new Random();
         Scanner input = new Scanner(System.in);
         int compProb = random.nextInt(9)+1;
         String move; 
         String play; 
         intro();
         String answer = input.nextLine();
         move = start();
          while(answer.equalsIgnoreCase("yes")){  
              String compHand;
              
              //this while loop is for when you choose rock
             while(move.equalsIgnoreCase("rock")){  
             compHand= compChoice(compProb);
             System.out.println("Computer: " + compHand);

             //when you pick rock and computer picks paper
             if(move.equalsIgnoreCase("rock") && compHand.equalsIgnoreCase("paper")){
             play = lost();
             if(play.equalsIgnoreCase("Yes")){
              move=start();
              compProb=randomNumber();
             }else{
                goodbye();
                 break;
             }
             
             //when you pick rock and the computer picks scissors
            } else if(move.equalsIgnoreCase("rock") && compHand.equalsIgnoreCase("scissors")){ 
                play= win();
             if(play.equalsIgnoreCase("Yes")){
                 move=start();
                 compProb=randomNumber();
             }else{
                goodbye();
                 break;
             }
             //when you pick rock and the computer picks rock
           } else if(move.equalsIgnoreCase("rock") && compHand.equalsIgnoreCase("rock")){
            play= tie();
            if(play.equalsIgnoreCase("Yes")){
             move=start();
             compProb=randomNumber();
             }else{
                goodbye();
                 break;
             }
           } 
             }
             //when you choose paper
            while(move.equalsIgnoreCase("paper")){
                compHand= compChoice(compProb);
                System.out.println("Computer: " + compHand);
                //when you choose paper and the computer picks rock
             if(move.equalsIgnoreCase("paper") && compHand.equalsIgnoreCase("rock")){
               play= win();
             if(play.equalsIgnoreCase("Yes")){
                 move=start();
                 compProb=randomNumber();
            } else{
                 goodbye();
                 break;
             }
             //when you choose paper and the computer picks paper
             }else if (move.equalsIgnoreCase("paper") && compHand.equalsIgnoreCase("paper")){
            play= tie();
            if(play.equalsIgnoreCase("Yes")){
             move=start();
             compProb=randomNumber();
             }
            //when you choose paper and the computer picks scissors
            } else if (move.equalsIgnoreCase("paper") && compHand.equalsIgnoreCase("scissors")){
            play= lost();
             if(play.equalsIgnoreCase("Yes")){
              move=start();
              compProb=randomNumber();
            }else{
                 goodbye();
                 break;}
            }
            }  //when you choose scissors
           while(move.equalsIgnoreCase("scissors")){
                compHand = compChoice(compProb);
                System.out.println("Computer: " + compHand);
                //when you choose scissors and the computer picks paper
            if(move.equalsIgnoreCase("scissors") && compHand.equalsIgnoreCase("paper")){
             play= win();
             if(play.equalsIgnoreCase("Yes")){
                 move=start();
                 compProb=randomNumber();
             }else{
                goodbye();
                 break;}
            }//when you choose scissors and the computer picks rock
            else if(move.equalsIgnoreCase("scissors") && compHand.equalsIgnoreCase("rock")){
            play= lost();
             if(play.equalsIgnoreCase("Yes")){
              move=start();
              compProb=randomNumber();
             }else{
                 goodbye();
                 break;
                } 
                //when you choose scissors and the computer picks scissors
            } else if(move.equalsIgnoreCase("scissors") && compHand.equalsIgnoreCase("scissors")){
            play=tie(); 
             if(play.equalsIgnoreCase("Yes")){
             move=start();
             compProb=randomNumber();
             }else{
                 goodbye();
                 break;}
            }
            }
         
         } 
         
          
    }
    //game intro introduction statement
     public static void intro(){
         System.out.println("Hello, welcome to rock, paper, scissors! Would you like to begin?. Yes/No");
     }   
     // prints out congrats text and prompts if you want to play again 
     public static String win(){
         Scanner input = new Scanner(System.in);
         System.out.println("Congratulations! You won! Would you like to play again? Yes/No");
         String play = input.nextLine();
         return play;
     }
     //prints out loser statement and prompts if you want to play again
     public static String lost(){
         Scanner input = new Scanner(System.in);
         System.out.println("Oh too bad, you lost! Play again? Yes/No");
          String play= input.nextLine();
          return play;
     }
     //prints tie statement and prompts if you want to play again
     public static String tie(){
         Scanner input = new Scanner(System.in);
         System.out.println("You tied! Play again?");
         String play= input.nextLine();
         return play;
         
     }
     // starts the game and gets your first move
     public static String start(){
         Scanner input = new Scanner(System.in);
     System.out.println("Great! Rock, Paper or Scissors?");
     String move= input.nextLine();
     return move;
     }
     // takes the random int from the computer and based on the value it returns it as rock,paper,or scissors
     public static String compChoice(int compProb){

     if(compProb>=1 && compProb <=3){
         return "rock";
     } else if (compProb>=4 && compProb <=6){
         return "paper";
     } 
        return "scissors";
     }
// same idea as the ladder method but it realtes to the players choice and not the computer
     public static String playerChoice(int playerProb){

     if(playerProb>=1 && playerProb <=3){
         return"rock";
     } else if (playerProb>=4 && playerProb <=6){
         return "paper";
     } 
        return "scissors";
     }
// random number generator from 1 to 10
     public static int randomNumber(){
         Random randomStart = new Random();
         int randomNumber= randomStart.nextInt(9)+1;
         return randomNumber;
        
     }
     //exit statements 
     public static void goodbye(){
         System.out.println("Thanks for playing! Bye.");
          System.exit(0);
     }
        
     }
