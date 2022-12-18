package finalProject2;

import java.util.ArrayList;
import java.util.List;

public class Player {
	// List of Card
    List<Card> hand = new ArrayList<Card>(); 
    int score;
    String name;
//constructor of class
    public Player(String name) {
		this.score = 0; 
		this.name = name;
	}

    //this method prints out information about the player and score
    public void describe() {
		for(Card eachCard: hand) {
			eachCard.describe();
		}
      
    }

    public Card flip() {
    	Card topCardHand = hand.get(0);
		hand.remove(0);
		return topCardHand;
    }

    public void draw(Deck cards) { 
    	Card card=cards.draw();
		hand.add(card);
    }
    
//this method will add 1 to the Player's score
    public void addScore() { 
       this.score++;
    }

    public int getScore() {
        return score;
    }


	



}

