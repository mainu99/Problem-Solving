public class ProductExceptSelf {
    //Link: https://leetcode.com/problems/product-of-array-except-self/description/?envType=problem-list-v2&envId=a3j9rtxd
    //O(N)      O(1)
    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;
        int suffixProd = 1;

        //for prefix
        for(int i = 1; i < n; i++) {
            ans[i] = ans[i-1]*nums[i-1];
        }

        //ans calc with suffix update
        for(int i = n-1; i >= 0; i--) {
            ans[i] = ans[i]*suffixProd;
            suffixProd *= nums[i];
        }

        return ans;
    }
    static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int[] res = productExceptSelf(nums);

        for(int x: res) {
            System.out.print(x + " ");
        }
    }
}
