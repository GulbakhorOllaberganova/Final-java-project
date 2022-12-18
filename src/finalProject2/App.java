package finalProject2;

public class App {

	public static void main(String[] args) {
		
		//instantiating Deck 
        Deck deck = new Deck();
        Player player1 = new Player("Bob"); // instantiating player 1 
        Player player2 = new Player("Bill"); // instantiating player 2 
        
     // calling the shuffle method on the deck
        deck.shuffle(); 
        
        for(int i=1; i<=26; i++){
        	player1.hand.add(deck.draw());
        	player2.hand.add(deck.draw());
        }
        player1.describe();
        player2.describe();
        
        for (int i = 1; i <= 26; i++) { 
        	System.out.println("\nFlip " + i +":");
            Card BobsCard = player1.flip();
            Card BillsCard = player2.flip();
            
            // comparing the value 
            if (BobsCard.getValue() > BillsCard.getValue()) { 
            	player1.addScore(); 
            	
            
            	BobsCard.describe();
           
            	BillsCard.describe();
  
            } else if (BobsCard.getValue() < BillsCard.getValue()) { 
            	player2.addScore(); 
            	BobsCard.describe();
            	BillsCard.describe();
            	
            	if(player1.score > player2.score) {
            		System.out.println("Bob won!");
            		System.out.println("Bob scored "+player1.score + " and "+ "Bill scored "+ player2.score);
            		
            	}else if(player2.score > player1.score) {
            		System.out.println("Bill won!");
            		System.out.println("Bill scored "+player2.score + " and "+ "Bob scored "+ player1.score);
            	}else {
            		System.out.println("It's a Draw");
            	}
            	}

	}

}
}
