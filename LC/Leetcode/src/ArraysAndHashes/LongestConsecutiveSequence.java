package ArraysAndHashes;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    // Brute force approach
    public int longestConsecutive1(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int n: nums){
            numSet.add(n);
        }
        int res = 0;
        for(int num : nums){
            int longest = 0;
            int current = num;
            while(numSet.contains(current))
            {
                current++;
                longest++;
            }
            res = Math.max(res, longest);
        }
        return res;
    }

    /*
    Create a set
    Loop through set
    Check if current element -1 exists
    if not then consider that as least and check current element + length exists in set
    take the longest of these
     */
    public int longestConsecutive2(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int n: nums){
            numSet.add(n);
        }
        int longest = 0;
        for(int num : numSet){
            if(!numSet.contains(num - 1))
            {
                int length = 1;
                while(numSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest,length);
            }
        }
        return longest;
    }
}
