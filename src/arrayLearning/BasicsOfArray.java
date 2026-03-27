package arrayLearning;

import java.util.Scanner;

public class BasicsOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Taking input in array
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        printArr(arr);
    }

    static void printArr(int[] arr){
        int i = 0;
        while(i < arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
    }
}
