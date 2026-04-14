package generics;

class Animals{
    public void run(){
        System.out.println("Animal is running...");
    }

    public void eat(){
        System.out.println("Animal is eating...");
    }

    public void walk(){
        System.out.println("Animal is walking...");
    }
}

class Dog extends Animals{
    @Override
    public void run(){
        System.out.println("Dog is running...");
    }

    public void eat(){
        System.out.println("Dog is eating...");
    }

    public void walk(){
        System.out.println("Dog is walking...");
    }

    public void bark(){
        System.out.println("Dog is barking...");
    }
}

public class GenericsLearning {
    public static void main(String[] args) {
        Animals a = new Animals();
        Dog d = new Dog();
        a.walk();
        d.walk();
        d.bark();
    }
}
