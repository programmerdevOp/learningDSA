package arrayLearning;

public class RightRotateAnArrayByOnePlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        // problem - hame array ko left rotate karna hai mtlb last element first par aa jayeega rotate hoke aur baki
        // forward push ho jayenge -> [5,1,2,3,4]
        RightRotateByOnePlace(arr, n);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    private static void RightRotateByOnePlace(int[] arr, int n) {
        int lastElement = arr[n-1];
        //System.out.println("last element: "+lastElement);
        int[] tempArr = new int[n];

        int i = 0;
        int j = 0;
        tempArr[j] = lastElement;
        j++;
        while(i<n-1){
            tempArr[j] = arr[i];
            i++;
            j++;
        }

        // tempArr [5,1,2,3,4]
//        for(int num: tempArr){
//            System.out.print(num+" ");
//        }

        int m = 0;
        for(int k=0;k< tempArr.length;k++){
            arr[m] = tempArr[k];
            m++;
        }

    }
}
