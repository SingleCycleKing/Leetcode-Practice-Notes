/** We are playing the Guess Game. The game is as follows:

    I pick a number from 1 to n. You have to guess which number I picked.

    Every time you guess wrong, I'll tell you whether the number is higher or lower.

    You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

    The guess API is defined in the parent class GuessGame.

        @param num, your guess

        @return -1 if my number is lower, 1 if my number is higher, otherwise return 0

        int guess(int num); */

public class GuessNumber extends GuessGame {

    public int guessNumber(int n) {
        if (guess(n) == 0)
            return n;
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2, t = guess(mid);
            if (t == 0)
                return mid;
            else if (t == 1)
                left = mid;
            else right = mid;
        }
        return left;
    }
}