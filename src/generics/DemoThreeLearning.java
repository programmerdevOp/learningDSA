package generics;

class Box2{
    private Object value;

    public Box2(){

    }

    public Box2(Object value){
        this.value = value;
    }

    public void setValue(Object value){
        this.value = value;
    }

    public Object getValue(){
        return value;
    }
}

public class DemoThreeLearning {
    public static void main(String[] args){
        Box2 bx2 = new Box2();
        bx2.setValue(12);
        Integer ans = (Integer) bx2.getValue();
        System.out.println(ans);

        bx2.setValue("Hello Bhumi");
        String strAns = (String)bx2.getValue();
        System.out.println(strAns);
    }
}
