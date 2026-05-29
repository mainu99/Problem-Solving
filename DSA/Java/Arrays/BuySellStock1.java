/*Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=problem-list-v2&envId=a3j9rtxd
T.C:    O(N)
hint:    maintain minimum price and keep calculating maxProfit*/
public class BuySellStock1 {

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < n; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            else if(prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }

    static void main(String[] args) {
        int[] a = {7, 1, 5, 3, 6, 4};
        int res = maxProfit(a);
        System.out.println(res);
    }
}