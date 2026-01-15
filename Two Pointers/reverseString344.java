public class reverseString344 {
    public static void reverse(char[] s){
        int left = 0;
        int right = s.length-1;

        while(left < right){
            char ch = s[left];
            s[left] = s[right];
            s[right] = ch;

            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        char[] c = {'h','e','l','l','o'};
        reverse(c);
        for(int i=0;i<c.length;i++){
            System.out.print(c[i] + " ");
        }
    }
}
