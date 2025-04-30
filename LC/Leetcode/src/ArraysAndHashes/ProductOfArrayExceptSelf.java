package ArraysAndHashes;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] before = new int[nums.length];
        int[] after = new int[nums.length];
        int[] res = new int[nums.length];
        before[0] = 1;
        for(int i= 1;i<nums.length;i++){
            before[i] = before[i-1] * nums[i-1];
        }
        for(int n: before)
            System.out.println(n);
        after[nums.length -1] = 1;
        for( int i=nums.length -1; i>0 ;i--){
            after[i-1] = after[i] * nums[i];
        }
        for(int n: after)
            System.out.println(n);

        for(int i=0;i<nums.length;i++)
            res[i] = before[i] * after[i];
        return res;
    }

    /*
    [1,2,3,4] -> input

    before array
    [1,1,2,6]

    after array
    [24,12,4,1]

    result
    [24,12,8,6]
     */
}
