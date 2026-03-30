package arrayLearning;

public class CheckIfArrayIsSorted {
    public static void main(String[] args){
        int[] nums = {2,3,5,7,9};
        int n = nums.length;

        boolean ans = checkSorted(nums, n);

        System.out.println(ans);
    }

    static boolean checkSorted(int[] nums, int n){
        System.out.println("Inside function");
        for(int i = 0; i < n-1; i++){
            if(nums[i] < nums[i+1]){
                //continue
            }else return false;
        }

        return true;
    }
}
