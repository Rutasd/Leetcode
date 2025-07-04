package TwoPointers;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j){
            int currentArea = (Math.min(height[i],height[j])*(j-i));
            if(maxArea < currentArea)
                maxArea = currentArea;
            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
