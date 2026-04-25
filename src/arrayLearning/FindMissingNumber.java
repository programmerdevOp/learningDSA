package arrayLearning;

public class FindMissingNumber {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,11,12};
        int missingNumber = findMissing(arr);
        System.out.println("Missing Number: " + missingNumber);
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
}
