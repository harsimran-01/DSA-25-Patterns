public class longestMountain845 {
    public static int lengthMountain(int arr[]){
        int n = arr.length;
        int maxLength = 0;

        for(int i=1;i<n-1;i++){ // as the ends can't be the peaks
            //calculating peak
            if(arr[i-1] < arr[i] && arr[i+1] < arr[i]){
                //peak found at ith index

                //expanding left and right to find the longest length

                //expanding left
                int left = i;
                while(left >0 && arr[left-1]<arr[left]){
                    left--;
                }

                //expanding right
                int right = i;
                while(right < n-1 && arr[right+1] < arr[right]){
                    right++;
                }

                //find the max length
                int currLength = right-left+1;
                maxLength = Math.max(currLength, maxLength);

                //optionally i need to assign my i with right
                i=right;
            }

        }
        return maxLength;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,4,7,3,2,5};
        System.out.println("Longest length of mountain : "+lengthMountain(arr));
    }
}
