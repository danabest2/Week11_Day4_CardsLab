import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
   }

   public ArrayList<Card> getCards(){
        return this.cards;
   }

   public void addCard(Card card){
        this.cards.add(card);
   }

   public void populate(){
        SuitType[] suits = SuitType.values();
        Value[] values = Value.values();

        for(int s = 0; s < suits.length; s++){
            for(int v = 0; v < values.length; v++){
                Card card = new Card(suits[s], values[v]);
                addCard(card);
            }
        }
   }




}
