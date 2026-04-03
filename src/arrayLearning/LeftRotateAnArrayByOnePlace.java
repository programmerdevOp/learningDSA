package arrayLearning;

public class LeftRotateAnArrayByOnePlace {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        // after left rotate -> [2,3,4,5,1]
        leftRotateByOne(nums, nums.length);

        for(int num: nums){
            System.out.print(nums+" ");
        }
    }

    private static void leftRotateByOne(int[] nums, int n){
        int[] tempArr = new int[n];
        int firstElem = nums[0];

        int i = 1 ; int j = 0;
        while(i<n){
            tempArr[j] = nums[i];
            i++;
            j++;
        }

        tempArr[tempArr.length-1] = firstElem;
//        for(int num: tempArr){
//            System.out.print(num+" ");
//        }

        int b = 0;
        int s = 0;

        while(b< tempArr.length){
            nums[s] = tempArr[b];
            b++;
            s++;
        }
    }

    private static void leftRotateBetter(int[] nums, int n){
        //[]
    }
}
