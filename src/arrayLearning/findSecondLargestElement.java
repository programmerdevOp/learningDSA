package arrayLearning;

public class findSecondLargestElement {
    public static void main(String[] args) {
        int[] arr  = {3,2,4,5,2};
        int n = arr.length;
        int ans = findSecondLargest(arr,n);
        System.out.println("Second Largest Element: " + ans);
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

    static int findSecondLargest(int[] arr, int n){
        int maxi = findLargest(arr, n);
        System.out.println("maxi which is largest element: "+maxi);
        int secondMaxi = arr[0];

        for(int i=1;i<n;i++){
            if(arr[i] > secondMaxi && arr[i] != maxi){
                secondMaxi = arr[i];
            }
        }

        return secondMaxi;
    }
}
