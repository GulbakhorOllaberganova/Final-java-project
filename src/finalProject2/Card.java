package finalProject2;

public class Card {
	
    private int value; 
    private String name;
    
 // Card constructor
    public Card(int Value, String suit) { 

      value = Value;
   // switch statement assigns String values
        switch(Value) { 
            case 2: name = "two";
                break;
            case 3: name = "three";
                break;
            case 4: name = "four";
                break;
            case 5: name = "five";
                break;
            case 6: name = "six";
                break;
            case 7: name = "seven";
                break;
            case 8: name = "eight";
                break;
            case 9: name = "nine";
                break;
            case 10: name = "ten";
                break;
            case 11: name = "Jack";
                break;
            case 12: name = "Queen";
                break;
            case 13: name = "King";
                break;
            case 14: name = "Ace";
                break;
        }

        name += " of " + suit;

    }
//getters and setters
    public int getValue() { // gets the value
        return value;
    }

    public void setValue(int value) { // sets the value
        this.value = value;
    }

    public String getName() { //gets the name of a card
        return name;
    }

    public void setName(String name) { // sets the name of a card
        this.name = name;
        
    }
  //prints out information about a card
    public void describe() { 
        System.out.printf(name + "\n");



}
}
    
