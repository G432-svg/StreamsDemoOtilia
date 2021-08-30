package be.intecbrussel.Chapter20;

public enum Coin {
    //list of euro coins values(cents):
    //One_cent:1,two_cent:2,five_cent:5,ten_cent:10,
    //twenty_cent:20,fifty_cent:50,one_euro:100,twee_euro:200

    ONE_CENT(0.01),TWO_CENT(0.02),
    FIVE_CENT(0.05),TEN_CENT(0.10),
    TWENTY_CENT(0.20),FIFTY_CENT(0.50),
    ONE_EURO(1.00),TWEE_EURO(2.00);

    private final double value;

    Coin(double value){
        this.value = value;

    }
    public double getValue(){
        return value;
    }


    @Override
    public String toString() {
        return "Coin{ " +this.name() + "value="  + value + '}';
    }
}
