/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 *
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 *
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        int endPointer = nums.length - 1;
        for (int i = 0; i <= endPointer; i++) {
            if (nums[i] == val) {
                while (endPointer > i && nums[endPointer] == val) {
                    endPointer--;
                }
                nums[i] = nums[endPointer--];
            }
        }
        return endPointer + 1;
    }
}
