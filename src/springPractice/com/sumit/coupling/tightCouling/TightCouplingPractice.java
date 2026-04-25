package springPractice.com.sumit.coupling.tightCouling;

public class TightCouplingPractice {
    public static void main(String[] args){
        Palkia palkia = new Palkia();
        String powerGem = palkia.powerGem();
        System.out.println(powerGem);
    }
}
