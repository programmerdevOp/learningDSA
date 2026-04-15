package generics;

public class GenericWithMethod {
    public static void main(String[] args){
        Integer intValue = 11;
        String name = "bhumi thapliyal";
        getPair(intValue, name);

        String gettingName =  getName(name);
        System.out.println(gettingName);
    }

    public static <T,U> void getPair(T intValue, U name){
        System.out.println("value: " + intValue);
        System.out.println("name: " + name);
    }

    public static <U> U getName(U name){
//        System.out.println("U name: "+name);
        return name;
    }
}
