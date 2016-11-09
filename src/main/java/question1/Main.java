package question1;

/**
 * Created by John on 11/8/16.
 */
public class Main {

    public static void main(String[] args) {
        int[] stockPricesYesterday = new int[]{10, 7, 5, 8, 11, 9, 12, 1, 15};
        System.out.println(getMaxProfit(stockPricesYesterday));
    }

    public static int getMaxProfit(int[] prices){
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int currentPrice: prices){
            minPrice = Math.min(minPrice, currentPrice);
            int potentialProfit = currentPrice - minPrice;
            maxProfit = Math.max(maxProfit, potentialProfit);
        }

        return maxProfit;
    }

}
