/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        int[] data = new int[n + 3];
        data[1] = 1;
        data[2] = 2;
        for (int i = 3; i <= n; i++) {
            data[i] = data[i - 2] + data[i - 1]; // at i step, there are only two ways to get there, add them.
        }
        return data[n];
    }
}
