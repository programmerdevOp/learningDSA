package arrayLearning;

import java.util.Arrays;

public class SortingPractice {
    public static void  main(String[] args){
        int[] arr = {4,2,7,1,5};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
