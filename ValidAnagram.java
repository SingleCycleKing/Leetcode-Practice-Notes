/**
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 *
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] array = new int[26];
        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i) - 'a']++; // find char at magazine and count number
        }
        for (int i = 0; i < t.length(); i++) {
            --array[t.charAt(i) - 'a'];
        }

        for (int anArray : array) {
            if (anArray != 0) return false;
        }
        return true;
    }
}
