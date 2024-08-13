package org.example.blind75;

public class BuyOrSell {
    public int maxProfit(int[] prices) {

        int min_value = prices[0];
        int diffrence = 0;
        for (int i=0;i<prices.length;i++){
            if (prices[i] < min_value)
                min_value = prices[i];
            else if (prices[i] - min_value > diffrence) {
                diffrence = prices[i] - min_value;
            }
        }
        return diffrence;
    }

    public static void main(String[] args) {

        BuyOrSell buyOrSell = new BuyOrSell();
        int[] nums = {7,1,5,3,6,4};

        System.out.println(buyOrSell.maxProfit(nums));
    }
}
