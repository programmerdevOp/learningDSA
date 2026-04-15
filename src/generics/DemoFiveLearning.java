package generics;

public class DemoFiveLearning {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1,"bhumi");
        Integer no = pair.getNo();
        String name = pair.getName();
        System.out.println("No: " + no);
        System.out.println("Name: " + name);
    }
}

class Pair<T,U>{
    private T no;
    private U name;

    public Pair() {

    }

    public Pair(T no, U name) {
        this.no = no;
        this.name = name;
    }

    public void setNo(T no){
        this.no = no;
    }

    public T getNo(){
        return no;
    }

    public void setName(U name){
        this.name = name;
    }

    public U getName(){
        return name;
    }
}