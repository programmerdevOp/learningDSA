package springPractice.com.sumit.coupling.tightCouling;

public class TightCouplingPractice {
    public static void main(String[] args){
//        Palkia palkia = new Palkia();
//        String powerGem = palkia.powerGem();
//        System.out.println(powerGem);
//        Xerenas  xerenas = new Xerenas();
//        String xerFinalBlow = xerenas.moonblast();
//       System.out.println(xerFinalBlow);
//        XerenasMoves xerenasMoves = new XerenasMoves();
//        String ans = xerenasMoves.fairyMoves();
//        System.out.println(ans);
//        LegendaryMoveSet legendaryMoveSet = new LegendaryMoveSet();
//        String ans = legendaryMoveSet.rockType();
//        System.out.println(ans);
        Xerenas xerenas = new Xerenas();
        String ans = xerenas.fairyAttack();
        System.out.println(ans);
    }
}
