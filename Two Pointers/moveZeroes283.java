public class moveZeroes283 {
    public static void moveZero(int nums[]){
        int n = nums.length;
        int pos = 0;
        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                nums[pos]=nums[i];
                pos++;
            }
        }
        while(pos < n){
            nums[pos] = 0;
            pos++;
        }
    }
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        moveZero(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
