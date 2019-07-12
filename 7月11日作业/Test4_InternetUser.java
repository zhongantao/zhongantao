package Afternoon;
/*
 * 定义一个网络用户类 成员变量有 用户ID、用户密码、email地址。有多样的构造方法
 */
public class Test4_InternetUser {
      String userID;
      int userPassword;
      String email;
	
public Test4_InternetUser(int userPassword1,String userID1,String email1) {
	userID=userID1;
}
public Test4_InternetUser(String email1, String userID1,int userPassword1) {
	userID=userID1;userPassword=userPassword1;
}
public Test4_InternetUser(String userID1,int userPassword1, String email1) {
	userID=userID1;userPassword=userPassword1;email=email1;
}

public static void main(String[] args) {
	
}

}
