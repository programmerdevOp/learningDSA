package arrayLearning;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,4,3,0,1,5,7,0,4,0};
        moveZero(arr);
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
}
