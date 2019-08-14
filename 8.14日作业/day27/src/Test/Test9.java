package Test;

import java.util.Scanner;

/*
 * 9、会员注册
要求：
·用户名长度不小于3
·密码长度不小于6
·注册时两次输入密码必须相同 

 */
public class Test9 {

	public static void main(String[] args) {
		//开始界面
		System.out.println("***欢迎进入注册系统***");
		System.out.println();
		Scanner input=new Scanner(System.in);
		//创建判断值
		boolean b=false;
		//循环过程
		do{
			System.out.println("请输入用户名：");
			String username=input.next();
			System.out.println("请输入密码：");
		    String userpassword1=input.next();
		    System.out.println("请再次输入密码：");
		    String userpassword2=input.next();
			//根据输入判断是否跳出循环
		    if(userpassword1==userpassword2) {
				System.out.println("两次输入密码必须相同");
			}else if(username.length()>=3&&userpassword1.length()>=6) {
				System.out.println("用户名长度不小于3，密码长度不小于6");
			}else {
				b=true;
			}
			
			
		}while(b);
		
		
		
		
		
		
	}
	
}
