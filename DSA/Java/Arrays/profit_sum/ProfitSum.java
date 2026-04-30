package profit_sum;//Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=problem-list-v2&envId=a3j9rtxd

class Solution {
    //Best Approach: O(N) ---- Kadane
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;

        for(int i = 0; i < n; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            else if(prices[i] - minPrice > profit) {
                profit = prices[i] - minPrice;
            }
        }

        return profit;
    }

    //Brute Force Approach - O(n^2)
//    public int maxProfit(int[] prices) {
//
//        int n = prices.length;
//        int profit = 0;
//        for(int i = 0; i < n; i++) {
//            for(int j = i+1; j < n; j++) {
//                int newProfit = prices[j] - prices[i];
//                if( newProfit > profit) {
//                    profit = newProfit;
//                }
//            }
//        }
//
//        return profit;
//    }
}

public class ProfitSum {

    public static void main(String[] args) {

        int[] arr = {7,1,5,3,6,4};
        Solution sol = new Solution();
        System.out.println(sol.maxProfit(arr));
    }
}