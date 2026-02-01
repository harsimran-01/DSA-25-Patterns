// package Slow and Fast Pointer;

public class happyNumber_202 {
    public static int helper(int n){
        int sum = 0;
        while(n>0){
            int last_digit = n%10;
            sum+=last_digit*last_digit;
            n/=10;
        }
        return sum;
    }
    public static boolean isHappy(int n){
        int slow = n;
        int fast = n;

        while(true){
            slow = helper(slow);
            fast = helper(helper(fast));

            if(slow == 1 || fast == 1){
                return true;
            }
            if(slow == fast){
                return false;
            }
        }
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));
    }
}
