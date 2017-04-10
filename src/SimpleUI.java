

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        
      
       System.out.println("Dealer cards: "+ game.getHouseCards());
       System.out.println("Your cards: "+game.getYourCards());
        
    }
  @Override
    public boolean hitMe() {
        System.out.println("Would you like another card? Type 'true' for yes and 'false' for no");
     boolean Selection = user.nextBoolean();
     
     if (Selection == true){
         return true;
     }
     return false;
    }

    

  @Override
    public void gameOver() {
        
      
        CardPile dealer = game.getHouseCards();
        CardPile yours = game.getYourCards();
        
         System.out.println("GAME OVER");
         System.out.println("Dealer cards: "+ game.getHouseCards());
         System.out.println("Your cards: "+game.getYourCards());
         
         System.out.println("Dealer score: "+ game.score(dealer));
         System.out.println("Your score: "+ game.score(yours));
         
         if (game.score(dealer) > game.score(yours)){
             System.out.println("YOU LOSE!");}
         if (game.score(dealer) < game.score(yours)){
             System.out.println("YOU WIN!");
                     }
         else if (game.score(dealer) == game.score(yours))
                 {System.out.println("TIE!");
         }
         }
         
       
      
     

}
