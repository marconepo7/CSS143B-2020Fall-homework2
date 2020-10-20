public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:
    Create two pointers to point to locations for 0 and 2.
    Use for loop to traverse array.
    If current element is 2, swap element with pointer, and decrement pointer, loop until current element is not 2.
    If current element is 0, swap element with pointer unless index is equal to pointer.
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int p0 = 0;
        int p2 = nums.length - 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && i < p2) {
                do {
                    swap(nums, i, p2);
                    p2--;
                }
                while (nums[i] == 2);
            }

            if (nums[i] == 0) {
                if (i != p0) {
                    swap(nums, i, p0++);
                } else {
                    p0++;
                }
            }
        }
    }

    public static void swap(int[] data, int j, int k) {
        int temp = data[j];
        data[j] = data[k];
        data[k] = temp;
    }
}
