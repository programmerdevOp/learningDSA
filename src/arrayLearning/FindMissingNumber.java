package arrayLearning;

public class FindMissingNumber {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,11,12};
        //int missingNumber = findMissing(arr);
        //System.out.println("Missing Number: " + missingNumber);
        betterFindMissing(arr);
    }

    public static int findMissing(int[] arr){

        int i = 0;
        int j = 1;
        while(i < arr.length){
            if(arr[i] == j){
                i++;
                j++;
            } else if(arr[i] != j) {
                return j;
            }
            //i++;
        }

        return -1;
    }

    public static void betterFindMissing(int[] arr){
        /*
       // yeh wale version me calculating error hai
        int arrSum = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            //arrSum = arrSum + arr[i];
            arrSum += arr[i];
        }

        int  ithSum = 0;
        int s = n +1;
        for(int i=1;i<s;i++){
            ithSum += i;
        }

        //System.out.println(arrSum);
        System.out.println(arrSum - ithSum);

         */

        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }

        int n = arr.length + 1;
        int expectedSum = (n * (n + 1)) / 2;

        int missing = expectedSum - arrSum;
        System.out.println("Missing number: " + missing);
    }
}
