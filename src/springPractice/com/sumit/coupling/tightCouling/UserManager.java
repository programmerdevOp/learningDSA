package springPractice.com.sumit.coupling.tightCouling;

public class UserManager {
//    UserDataBase userDataBase = new UserDataBase();
//
//    public String getUserInfo(){
//        return userDataBase.getUserDetails();
//    }

    UserDataBase userDataBase = new UserDataBase();

    public String getUserInfo(){
        return userDataBase.getUserDetails();
    }
}
