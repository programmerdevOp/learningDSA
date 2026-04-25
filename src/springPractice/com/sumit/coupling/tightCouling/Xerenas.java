package springPractice.com.sumit.coupling.tightCouling;

public class Xerenas {

//    public String  moonblast(){
//        return "effective fairy attack";
//    }

    XerenasMoves xerenasMoves = new XerenasMoves();

    public String fairyAttack(){
        return xerenasMoves.fairyMoves();
    }
}
