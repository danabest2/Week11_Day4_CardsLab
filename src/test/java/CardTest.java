import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

        Card card;

        @Before

        public void before(){
            card = new Card(SuitType.HEARTS, Value.FOUR);
        }

        @Test
        public void canGetCard(){
            card = new Card(SuitType.HEARTS, Value.FOUR);
            assertEquals(4, card.getValueFromEnum());

        }




}
