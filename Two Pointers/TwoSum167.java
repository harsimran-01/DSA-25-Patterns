
public class TwoSum167 {
        public static int[] twoSum(int[] nums, int target) {
        int slow = 0;
        int fast = nums.length-1;

        while(slow < fast){
            if((nums[slow] + nums[fast])>target){
                fast--;
            }else if((nums[slow] + nums[fast])<target){
                slow++;
            }else{
                return new int[] {slow+1,fast+1};
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(twoSum(numbers, target));
    }
}
