package arrayLearning;

public class LargestElementInArray {
    public static void main(String[] args){
        int[] arr  = {3,2,1,5,2};
        int n = arr.length;
        int ans = findLargest(arr,n);
        System.out.println("Largest Element: " + ans);
    }

    static int findLargest(int[] arr,int n){
        int maxi = arr[0];

        for(int idx = 1;idx<n;idx++){
            if(arr[idx] > maxi){
                maxi = arr[idx];
            }
        }

        return maxi;
    }
}
