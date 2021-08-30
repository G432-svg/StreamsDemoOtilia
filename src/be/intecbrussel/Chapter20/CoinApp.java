package be.intecbrussel.Chapter20;

import java.util.HashMap;
import java.util.Map;

public class CoinApp {
    public static void main(String[] args) {

        Map<Coin, Integer> coinPurse = new HashMap<>();
        coinPurse.put(Coin.ONE_CENT,5);
        coinPurse.put(Coin.TWO_CENT,5);
        coinPurse.put(Coin.FIVE_CENT,1);

        double sum = 0;

        for(Coin coin : coinPurse.keySet()){
            sum+=coinPurse.get(coin)*coin.getValue();

        }
        System.out.println("Sum= "+ sum);
    }
}
