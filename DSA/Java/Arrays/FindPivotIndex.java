public class FindPivotIndex {

    static public int pivotIndex(int[] nums) {
        int n = nums.length;
        int total = 0;

        for(int i = 0; i < n; i++) {
            total += nums[i];
        }

        int leftTotal = 0;
        int rightTotal = 0;
        for(int i = 0; i < n; i++) {
            rightTotal = total - leftTotal - nums[i];
            if(rightTotal == leftTotal) {
                return i;
            }
            leftTotal += nums[i];
        }
        return -1;
    }

    static void main(String[] args) {

        int[] a = {1,7,3,6,5,6};
        int res = pivotIndex(a);
        System.out.println(res);
    }
}
