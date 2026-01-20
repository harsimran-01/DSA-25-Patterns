import java.util.*;

public class squareofSortedArray977 {
    public static int[] sortedArray(int nums[]){
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int res[] = new int[n];
        int pos = n-1;

        while(left <= right){
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                res[pos] = nums[right]*nums[right];
                right--;
            }else{
                res[pos] = nums[left]*nums[left];
                left++;
            }
            pos--;
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedArray(nums)));
    }
}
