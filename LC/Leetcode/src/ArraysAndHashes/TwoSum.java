package ArraysAndHashes;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for(int i=0;i<nums.length;i++){

            if(map1.containsKey(target - nums[i])){
                return new int[] {i, map1.get(target - nums[i])};
            }
            map1.put(nums[i], i);
        }
        return null;
    }
}
