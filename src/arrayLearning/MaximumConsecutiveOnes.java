package arrayLearning;

public class MaximumConsecutiveOnes {
    public static void main(String[] args){
        int nums[] = {1,1,0,0,0,1,1,1,1,0,1,1,};
        int ans = maximumConsecutiveOnes(nums);
        System.out.println(ans);
    }

    public static int maximumConsecutiveOnes(int[] nums){
        int maxOnes = 0;
        int finalMax = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                maxOnes += 1;
                finalMax = Math.max(maxOnes, finalMax);
            }else if(nums[i] != 1){
               maxOnes = 0;
            }
        }

        return finalMax;
    }
}

//class Solution {
//    public boolean rotateString(String s, String goal) {
//        int m = s.length();
//        int n = goal.length();
//
//        // If the lengths are not equal, they can't be rotations
//        if (m != n) {
//            return false;
//        }
//
//        // Check all possible rotations
//        for (int rotationCount = 1; rotationCount <= m; ++rotationCount) {
//            // Perform one rotation by shifting left by one character
//            s = s.substring(1) + s.charAt(0);
//            if (s.equals(goal)) {
//                return true;
//            }
//        }
//        return false;
//    }
//}
