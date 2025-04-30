package ArraysAndHashes;

import java.util.*;

public class GroupAnagrams {
    //O(n)
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] sChars = s.toCharArray();
            Arrays.sort(sChars);
            String sortedString = new String(sChars);
            map.putIfAbsent(sortedString,new ArrayList<String>());
            map.get(sortedString).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public boolean isAnagram(String s, String t){
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();
        for(char cs : s.toCharArray()){
            smap.put(cs, smap.getOrDefault(cs,0)+1);
        }
        for(char ct : t.toCharArray()){
            tmap.put(ct, tmap.getOrDefault(ct,0)+1);
        }
        return smap.equals(tmap);
    }
}
