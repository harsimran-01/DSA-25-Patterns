public class removeDuplicates26 {
    public static int removeDupl(int nums[]){
        int n = nums.length;
        int i = 0;

        for(int j = 1;j<n;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
        
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2};
        System.out.println(removeDupl(nums));
    }
}
