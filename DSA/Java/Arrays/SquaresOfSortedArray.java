//Link: 977 Squares of a Sorted Array
/* Brute force: O(NlogN + N) square each element and add it to new arr, then sort the new array and return it.
Optimal: to use two pointer, as edge value will always be greater than middle ones.
O(N) */
public class SquaresOfSortedArray {

    public static int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int[] res = new int[n];
        for(int i = n-1; i >= 0; i--) {
            if(Math.abs(nums[right]) > Math.abs(nums[left])) {
                res[i] = nums[right]*nums[right];
                right--;
            } else {
                res[i] = nums[left]*nums[left];
                left++;
            }
        }
        return res;
    }

    static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        arr = sortedSquares(arr);
        for(int x: arr) {
            System.out.print(x + " ");
        }
    }
}
