import java.util.HashMap;

//Hashmap, check complement exist on map, if not put value on map.
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            int comp = target - nums[i];
            if(map.containsKey(comp)) {
                return new int[] {i, map.get(comp)};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {-1, -1};
    }

    static void main(String[] args) {
        int[] a = {5, 3, 2, 1};
        int result[] = twoSum(a, 5);
        System.out.println(result[0] + " " + result[1]);
    }
}
