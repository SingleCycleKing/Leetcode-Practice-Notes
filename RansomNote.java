/**
 *  Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all  the  magazines,
 * write  a  function  that  will  return  true  if  the  ransom   note  can  be  constructed  from  the  magazines ;  otherwise,  it  will  return  false.
 *
 * Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] array = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            array[magazine.charAt(i) - 'a']++; // find char at magazine and count number
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--array[ransomNote.charAt(i) - 'a'] < 0) return false; // find char at ransomNote and sub number
        }
        return true;
    }

}
