import java.util.*;
/*
Link: https://leetcode.com/problems/3sum
BruteForce: 3 loops, check for each triplet-> sort -> store in set.
O(N^3 * log(no. of unique triplets))

Better: 2 loops. x+y = -z. if present in current set, create list -> sort -> store in result set
T.C: O(N^2 * log(n. of unique triplets))
space: O(2*(no of unique triplets)) + O(N)

Optimal: sortingt he array, using two pointer to check sum and skipping duplicates
T.C: O(N^2) + O(NlogN)
S.C: O(no. of triplets)     or       O(1) in auxiliary space
*/
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < n; i++) {

            //skip for first duplicates
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int left = i+1;
            int right = n-1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    //for left pointer duplicates
                    while(left < right && nums[left] == nums[left-1]) left++;

                    //for right pointer duplicates
                    while(left < right && nums[right] == nums[right+1]) right--;
                }
                else if(sum < 0) left++;
                else right--;
            }
        }
        return result;
    }
    /*
    public static List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;

        Set<List<Integer>> result = new HashSet<>();

        for(int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            for(int j = i+1; j  < n; j++) {
                int third = -(nums[i]+nums[j]);
                if(set.contains(third)) {
                    List<Integer> list = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(list);
                    result.add(list);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(result);
    }*/

    static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSum(arr);
        System.out.println(list);
    }
}
