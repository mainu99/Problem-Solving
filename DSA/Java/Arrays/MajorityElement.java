public class MajorityElement {

    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int candidate = 0;

        for(int i = 0; i < n; i++) {
            if(count == 0) {
                candidate = nums[i];
            }
            if(nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    static void main(String[] args) {
        
    }
}

//Link: https://leetcode.com/problems/majority-element/description/?envType=problem-list-v2&envId=a3j9rtxd
//Hint: Moore Voting Algorithm: T.C: O(N)       S.C: O(1)
