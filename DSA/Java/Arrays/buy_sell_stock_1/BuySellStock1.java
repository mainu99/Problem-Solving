package buy_sell_stock_1;
/*Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=problem-list-v2&envId=a3j9rtxd
T.C:    O(N)
hint:    maintain minimum price and keep calculating maxProfit*/
class Solution {
    public int maxProfit(int[] prices) {
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
}

public class BuySellStock1 {
    static void main(String[] args) {
        int[] a = {7, 1, 5, 3, 6, 4};
        Solution solution = new Solution();
        int res = solution.maxProfit(a);
        System.out.println(res);
    }
}
