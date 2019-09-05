public class Card {

    private SuitType suitType;
    private Value value;



    public Card(SuitType suitType, Value value){
        this.suitType = suitType;
        this.value = value;
    }



    public SuitType getSuitType() {
        return suitType;
    }

    public void setSuitType(SuitType suitType) {
        this.suitType = suitType;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public int getValueFromEnum() {
        return this.value.getValue();
    }
}
