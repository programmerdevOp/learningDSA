package arrayLearning;

public class RemoveDuplicateFromSortedArr2 {
    public static void main(String[] args){
      int[] arr = {1,2,2,2,2,3,3,3,4};

      int i = 0;
      int j = 1;
      int n = arr.length;

      while(j<n){
          if(arr[i] == arr[j]){
              j++;
          } else {
              i++;
              arr[i] = arr[j];
              j++;
          }
      }

        System.out.println(i+1);
    }
}
