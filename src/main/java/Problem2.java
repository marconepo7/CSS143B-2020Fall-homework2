public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
If length of array is null, 0, or 1. Return -1, 0, or 1
Create running total for the length of the new array
Go through each element, if it is the same as the next element, loop again
If it is not the same, increment length of new array and set element at the current index of new lengrh
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        int newLength = 0;

        if (nums == null) {
            return -1;
        } else if (nums.length == 1 || nums.length == 0) {
            return nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[newLength] = nums[i];
            newLength++;
        }
        return newLength;
    }
}
