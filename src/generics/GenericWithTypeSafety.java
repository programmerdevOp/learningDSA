package generics;

public class GenericWithTypeSafety {
    public static void main(String[] args){
        Box4<Fish> b1 = new Box4<>();
        
    }
}

class Box4<T extends Animal & Swimmable>{
    T value;
}

class Animal{
    void display(){
        System.out.println("Animal is displaying...");
    }
}

class Doggy extends Animal{

}

interface Swimmable {
    void swim();
}

class Fish extends Animal implements Swimmable{

    @Override
    public void swim() {
        System.out.println("Fish is swimming...");
    }
}
