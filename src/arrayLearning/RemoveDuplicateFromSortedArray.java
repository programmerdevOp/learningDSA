package arrayLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,3,3};
        int n = arr.length;

        int[] ansArr = removeDuplicate(arr, n);

        for(int i=0;i< ansArr.length;++i){
//            if(ansArr[i] != 0){
//                System.out.print(ansArr[i]+ " ");
//            }

            System.out.println(ansArr[i]);
        }

        int ans = removeDuplicates(arr);
        System.out.println("count: " +ans);
    }

    static int[] removeDuplicate(int[] arr, int n){
        int[] ansArr = new int[n];

        int i = 0;
        int j = 0;

        ansArr[j] = arr[i];
        System.out.println("ans[0] = "+ ansArr[j]);
        j++; // increasing j from 0 to 1
        i++; // increasing i also from 0 to 1
        while(i<n){

            if(arr[i] != ansArr[j-1]){ // first iteration -> 1(1),1(0)
                ansArr[j] = arr[i];
                i++;
                j++;
            } else if(arr[i] == ansArr[j-1]){
                i++;
            }

        }

        return Arrays.copyOf(ansArr, j);
    }

    static int removeDuplicates(int[] nums) {
        int n = nums.length;
        //int[] ansArr = new int[n];
        List<Integer> arrList = new ArrayList<>();

        int i = 0;
        int j = 0;
        arrList.add(nums[i]);
        i++;
        j++;
        while(i < n){
            if(nums[i] != arrList.get(j-1)){
                arrList.add(nums[i]);
                i++;
                j++;
            }else if(nums[i] == arrList.get(j-1)){
                i++;
            }
        }

        int count = arrList.size();
        return count;
    }
}
