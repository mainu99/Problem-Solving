package buy_sell_stock_2;
//Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=problem-list-v2&envId=a3j9rtxd
//O(n).
/* Greedy Approach. Sell a stock immediately when you find larger value.*/
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int total_profit = 0;

        for(int i = 1; i < n; i++) {
            if(prices[i] > prices[i-1]) {
                total_profit += (prices[i] - prices[i-1]);
            }
        }
        return total_profit;
    }
}

public class BuySellStock2 {

    static void main(String[] args) {
        int[] a = {7, 1, 5, 3, 6, 4};
        Solution solution = new Solution();
        int res = solution.maxProfit(a);
        System.out.println(res);
    }
}
