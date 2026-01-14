public class containerWithMostWater11 {
    public static int maxWater(int nums[]){
        int i=0;
        int j=nums.length-1;
        int water = 0;
        int max = 0;

        while(i<j){
            int ht = Math.min(nums[i],nums[j]);
            int wd = j-i;
            water = ht*wd;
            max = Math.max(water,max);

            if(nums[i] < nums[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxWater(height));
    }
}
