package plus_one;

//Link: https://leetcode.com/problems/plus-one/?envType=problem-list-v2&envId=a3j9rtxd
//O(N)
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] res = new int[n+1];
        res[0] = 1;
        return res;
    }
}

/*sol: we increment from behind if digit < 9 and return. eg: 192 -> 193 and returned.
else if it is 9 we keep setting it to 0 and again if firt condition satisfies we increment and return. eg 299 -> 300
else if all are 9s then we set all to 0, and outside for loop we create new arr copy of len = n+1 and assign first to 0.
eg: 999 -> 1000.

Other approach: convert to num, +1, convert back. But this breaks for very large array due to int/long overflow.
 */
public class PlusOne {

    static void main(String[] args) {
        int[] arr = {1, 9, 9};
        Solution s = new Solution();

        int[] res = s.plusOne(arr);

        for(int x: res) {
            System.out.print(x + " ");
        }
    }
}
