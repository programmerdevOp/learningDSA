package generics;

public class DemoFourLearning {
    public static void main(String[] args){
        BoxThree<Integer> bx3 = new BoxThree<>(23);
        BoxThree<String> bx3_1 = new BoxThree<>("Hey bhumi");
        Integer value = bx3.getValue();
        System.out.println("value: " + value);

        String strValue = bx3_1.getValue();
        System.out.println("String value: " + strValue);
    }
}

class BoxThree<T>{
    private T value;

    public BoxThree(){

    }

    public BoxThree(T value){
        this.value = value;
    }

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}
