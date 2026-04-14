package generics;

public class DownCastingLearning {
    public static void main(String[] args) {
        Object obj = "Hello bhumi";
        String str = (String) obj;
        System.out.println(str);

//        String str = "Hello bhumi";
//        Object obj = str;
//        System.out.println(obj);
    }
}
