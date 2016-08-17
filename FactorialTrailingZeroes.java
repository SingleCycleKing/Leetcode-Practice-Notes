/**
 * Given an integer n, return the number of trailing zeroes in n!.
 *
 * notes:
 * n:0-5-10-15-20-25-30-35-40-45
 * 0:0-1-2-3-4-6-7-8-9-10
 *
 * 0 counts: n/5 + n/25 + n/125 + ... + n/5^i
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int number = 0;
        while (n != 0) {
            number += n / 5;
            n /= 5;
        }
        return number;
    }
}
