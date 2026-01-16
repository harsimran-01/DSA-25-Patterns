public class trapingRainwater24{
    //approach 1
    public static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;
        int res = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] > leftMax) {
                    leftMax = height[left];
                } else {
                    res += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] > rightMax) {
                    rightMax = height[right];
                } else {
                    res += rightMax - height[right];
                }
                right--;
            }

        }
        return res;
    }

    //approach 2
     public static int trap2(int[] height) {
        int n = height.length;
        int left[] = new int[n];
        left[0] = height[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(height[i],left[i-1]);
        }

        int right[] = new int[n];
        right[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(height[i],right[i+1]);
        }

        int trappedWater = 0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(left[i],right[i]);
            trappedWater +=waterLevel-height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int heights[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(heights));
        System.out.println(trap2(heights));
    }
}