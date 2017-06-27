package question1;

/**
 * Created by John on 11/8/16.
 */
public class Main {
    public static void main(String[] args) {
        int[] stockPricesYesterday = new int[] {10, 7, 5, 8, 11, 9};
        getMaxProfit(stockPricesYesterday);
    }

    private static void getMaxProfit(int[] prices) {
        int leftPointer = 0;
        int rightPointer = prices.length - 1;
        int smallestLoss = leftPointer - rightPointer;

        while(leftPointer < rightPointer + 2)
        if(smallestLoss <  prices[leftPointer] - prices[rightPointer - 1]) {
            rightPointer -= 1;
        } else if (smallestLoss < prices[leftPointer + 1] - prices[rightPointer]) {
            leftPointer += 1;
        }

    }

}
