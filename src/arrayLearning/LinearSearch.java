package arrayLearning;

public class LinearSearch {
    public static void main(String[] args){
        int[] nums = {2,7,1,9,8};
        int target = 9;
        int ans = linearSearch(nums, target);
        System.out.println("Element Index: " + ans);
    }

    public static int linearSearch(int[] nums, int target){
        for(int i=0;i<nums.length;++i){
            if(nums[i] == target) return i;
        }

        return -1;
    }
}
