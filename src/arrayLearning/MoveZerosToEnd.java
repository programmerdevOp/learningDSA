package arrayLearning;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,4,3,0,1,5,7,0,4,0};
        //moveZero(arr);
        moveZerosWithPointer(arr);
    }

    public static void moveZero(int[] arr){
        int zeroCount = 0;

        for(int a: arr){
            if(a == 0) zeroCount++;
        }

        //System.out.println(zeroCount);

        int[] temp = new int[arr.length];

        int j = 0;
        for(int i=0;i< arr.length;++i){
            if(arr[i] != 0){
                temp[j] = arr[i];
                j++;
            }
        }

        // printing temp arr
//        for(int num: temp){
//            System.out.println(num);
//        }

        // aab j ke andar 0 insert kar de until array.length
        while(j<temp.length){
            temp[j] = 0;
            j++;
        }

        for(int num: temp){
            System.out.print(num+" ");
        }

        return;
    }


    public static void moveZerosWithPointer(int[] arr){
//        int[] arr = {1,0,2,4,3,0,1,5,7,0,4};
        int i = 0;
        int j = arr.length-1;

        while(i<j){
            if(arr[i] == 0 && arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j--;
            } else if(arr[i] != 0){
                i++;
            } else if(arr[j] == 0){
                j--;
            }
        }

        // printing new modified array
        for(int num: arr){
            System.out.print(num + " ");
        }

    }
}
