package TwoPointers;

public class TwoSum2SortedArray {
    public int[] twoSum1(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while(i<j){
            if(numbers[i]+numbers[j] < target){
                i++;
            }
            if(numbers[i]+numbers[j] > target){
                j--;
            }
            if(numbers[i]+numbers[j] == target) {
                return new int[]{i+1,j+1};
            }
        }
        return new int[]{};
    }

    /*
    Binary search approach
     */
    public int[] twoSum2(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int l = i + 1, r = numbers.length - 1;
            int tmp = target - numbers[i];
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (numbers[mid] == tmp) {
                    return new int[] { i + 1, mid + 1 };
                } else if (numbers[mid] < tmp) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return new int[0];
    }
}
