package Afternoon;
/*
 * ����һ�������û��� ��Ա������ �û�ID���û����롢email��ַ���ж����Ĺ��췽��
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
