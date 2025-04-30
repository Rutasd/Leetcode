package ArraysAndHashes;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    //O(n)
    public boolean containsDuplicate1(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

//O(n)
    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            seen.add(num);
        }
        return seen.size() != nums.length;
    }
}
