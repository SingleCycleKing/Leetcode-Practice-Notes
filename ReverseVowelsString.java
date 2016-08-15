/**
 * Write a function that takes a string as input and reverse only the vowels of a string.
 */

public class ReverseVowelsString {
    public String reverseVowels(String s) {
        int vowelSave = -1;
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            chars[i] = c;
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                if (vowelSave == -1) vowelSave = i;
                else {
                    chars[i] = s.charAt(vowelSave);
                    chars[vowelSave] = c;
                    System.out.print(chars[i] + ":" + chars[vowelSave]);
                    vowelSave = i;
                }
            }
        }
        return String.valueOf(chars);
    }
}
