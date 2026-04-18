package springPractice.com.sumit.coupling.tightCouling;

public class TightCouplingExample {
    public static void main(String[] args){
        UserManager userManager = new UserManager();
        System.out.println(userManager.getUserInfo());
    }
}
