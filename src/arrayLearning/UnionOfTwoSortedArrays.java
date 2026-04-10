package arrayLearning;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,1,2,3,4,5};
        int[] nums2 = {2,5,6};

        unionOfSortedArr(nums1, nums2);
    }

    public static void unionOfSortedArr(int[] nums1, int[] nums2){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] tempArr = new int[nums1.length + nums2.length];

        while(i < nums1.length && j < nums2.length){
             if(nums1[i] <= nums2[j] && nums1[i] != tempArr[k]){
                 tempArr[k] = nums1[i];
                 k++;
                 i++;
             } else if(nums2[j] <= nums1[i] && nums2[j] != tempArr[k]){
                 tempArr[k] = nums2[j];
                 k++;
                 j++;
             }
        }

        for(int num : tempArr){
            System.out.print(num + " ");
        }
    }
}
