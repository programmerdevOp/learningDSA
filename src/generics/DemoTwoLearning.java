package generics;

class Box {
    private int value;

    public Box(){

    }

    public Box(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }
}

public class DemoTwoLearning {
    public static void main(String[] args) {
        Box bx = new Box();
        bx.setValue(19);
        int ans = bx.getValue();
        System.out.println("Box value: " + ans);
    }
}
