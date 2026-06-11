package arrayLearning;

public class TwoSum {
    public static void main(String[] args){
        int[] arr = {2,7,9,11,4,5};
        int t = 9;

        int ans[] = findSum(arr,t);
        //System.out.println(ans.toString());
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }

    static int[] findSum(int[] arr, int t){
        int n = arr.length;
        //int[] ans = {-1,-1};

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] + arr[j] == t){
                    int[] ans = {i,j};
                    return ans;
                }
            }
        }

        int[] notFound = {-1,-1};
        return notFound;
    }
}
