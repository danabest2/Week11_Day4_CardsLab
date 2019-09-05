import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

        Deck deck;

        @Before
        public void before(){
            deck = new Deck();
        }

        @Test
        public void canStartEmpty(){
                assertEquals(0, deck.getCards().size());
        }

        @Test
        public void canAddCard(){
                Card card = new Card(SuitType.HEARTS, Value.FOUR);
                deck.addCard(card);
                assertEquals(1, deck.getCards().size());
        }

        @Test
        public void canPopulateDeck(){
                deck.populate();
                assertEquals(52, deck.getCards().size());

                //System.out.println();
        }

//        @Test
//        public void canShuffleCards(){
//                assertEquals(52, deck.shuffle());
//                System.out.println();
//;        }

        @Test
        public void canPrintCards(){
                System.out.println();
        }
}


