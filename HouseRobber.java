/**
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing each of them is that adjacent houses have security system connected
 * and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of money of each house,
 * determine the maximum amount of money you can rob tonight without alerting the police.
 */
public class HouseRobber {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        else if (n == 1) return nums[0];
        else if (n < 3) return Math.max(nums[0], nums[1]);
        int[] totalMoney = new int[n];
        totalMoney[0] = nums[0];
        totalMoney[1] = Math.max(totalMoney[0], nums[1]);
        for (int i = 2; i < n; i++) {
            totalMoney[i] = Math.max((nums[i] + totalMoney[i - 2]), totalMoney[i - 1]); // Dynamic Programming
        }
        return totalMoney[n - 1];
    }
}
