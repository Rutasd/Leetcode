package ArraysAndHashes;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i), 0) + 1);
            tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i), 0) + 1);
        }
        return sCount.equals(tCount);
    }
}
