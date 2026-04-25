package springPractice.com.sumit.coupling.tightCouling;

public class LegendaryMoveSet {
    Palkia palkia = new Palkia();

    public String rockType(){
        return palkia.powerGem();
    }
}
