package move_zeroes;

//Link: https://leetcode.com/problems/move-zeroes/description/?envType=problem-list-v2&envId=a3j9rtxd
//T.C: O(2n)
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        while(j < n) {
            nums[j] = 0;
            j++;
        }
    }
}

/*2nd sol with only one traversal, but has more operations so a little slower than 1st.
T.C: O(n)
class Solution2 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
*/
public class MoveZeroes {

    static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        Solution sol = new Solution();

        sol.moveZeroes(arr);
        for(int x: arr) {
            System.out.print(x + " ");
        }
    }
}
