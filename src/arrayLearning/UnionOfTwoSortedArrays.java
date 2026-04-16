package arrayLearning;

import java.util.*;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {2,5,6};

        //unionOfSortedArr(nums1, nums2);
//        dusriApproachForUnion(nums1,nums2);
        setWaliApproach(nums1, nums2);
    }

    private static void setWaliApproach(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for(int num: nums1){
            set.add(num);
        }

        for(int num: nums2){
            set.add(num);
        }

        List<Integer> arr = new ArrayList<>(set);
        Collections.sort(arr);

        System.out.println(arr);
    }

    private static void dusriApproachForUnion(int[] nums1, int[] nums2) {
        List<Integer> arrList = new ArrayList<>();

        for(int num1: nums1){
            if(!arrList.contains(num1)){
                arrList.add(num1);
            }
        }

        for(int num2: nums2){
            if(!arrList.contains(num2)){
                arrList.add(num2);
            }
        }

        Collections.sort(arrList);

        System.out.println(arrList);
    }

    public static void unionOfSortedArr(int[] nums1, int[] nums2){
        // yeh code to chala nhi dhang se
        
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
