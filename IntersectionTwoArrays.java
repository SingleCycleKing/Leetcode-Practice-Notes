/**
 * Given two arrays, write a function to compute their intersection.
 *
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 *
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 */

public class IntersectionTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for (int i : nums1) {
            set1.add(i);
        }

        HashSet<Integer> set2 = new HashSet<Integer>();
        for (int i : nums2) {
            if (set1.contains(i)) { // o(1)
                set2.add(i);
            }
        }

        int[] result = new int[set2.size()];
        int i = 0;
        for (int n : set2) {
            result[i++] = n;
        }

        return result;
    }

}
