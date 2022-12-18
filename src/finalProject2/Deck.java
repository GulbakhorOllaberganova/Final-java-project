package finalProject2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Deck {
	// List of Card
	    List<Card> cards = new ArrayList<>(52); 
	    List<String> suits = Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades"); //different cards
	   

	    public Deck() {
	    	for (int i = 2; i <=14; i++) {
	
	            for (String suit : suits) { // each suit from desk suits
	                cards.add(new Card(i, suit));
	            }
	
	        }
	
	    }
	 // shuffle will randomize the order of the cards 
	    public void shuffle() { 
	        Collections.shuffle(cards);
	    }
	 //  removes and returns the top card
	    public Card draw() { 
	    	if(cards.isEmpty()) {
	    		System.out.println("NO CARD!");
	    		return null;
	    	}else {
	    		Card drawnCard= cards.get(0);
	    		cards.remove(0); 
	    		return drawnCard;
}
}
}
