package arrayLearning;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args){
        int[] arr = {2,7,11,23,5,2,3};

        int t = 14;

        List<List<Integer>> ans =  findTSum(arr,t);
        System.out.println(ans);
    }

    static List<List<Integer>>  findTSum(int[] arr, int t){
        List<List<Integer>> output = new ArrayList<>();
        int n = arr.length;

        for(int  i=0;i<n;i++){
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n-2; k++) {
                    if(arr[i] + arr[j] + arr[k]  == t){
                        List<Integer> sum = new ArrayList<>();
                        sum.add(i);
                        sum.add(j);
                        sum.add(k);
                        output.add(sum);
                    }
                }
            }
        }

        return output;
    }
}
