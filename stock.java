package Array;

public class stock {
    public static int myFunction(int[] arg) {
        if (arg.length < 2) {
            throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
        }
        int minPrice = arg[0];
        int maxProfit = arg[1] - arg[0];


        for (int i = 1; i < arg.length; i++) {
            int currentPrice = arg[i];
            int potentialProfit = currentPrice - minPrice;
            maxProfit = Math.max(maxProfit, potentialProfit);
            minPrice = Math.min(minPrice, currentPrice);
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] testInput = {7,6,5,4,3};
        System.out.println(myFunction(testInput));
    }
}