/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 *
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 */
public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        if (null == nums) return 0;
        else if (1 == nums.length) return 1;
        int pointer = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] && pointer != i) {
                nums[pointer++] = nums[i];
            }
        }
        return pointer;
    }
}
