package Test;

import java.util.Scanner;

/*
 * 11、系统随机了四个长度的验证码(由数字，大写字母，小写字母组成)。
用户在控制台输入验证码，对比与系统的验证码是否一致(不区分大小写)

 */
public class Test11 {

	public static void main(String[] args) {
		//创建系统随机范围字符串
		String str="1234567890"+
	               "abcdefghijklmnopqrsrtuvwxyz"+
				   "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] arr=str.toCharArray();
		char[] arr1=new char[4];
		for(int i=0;i<4;i++) {
			arr1[i]=arr[(int)(Math.random()*arr.length)];
		}
		String str2=String.valueOf(arr1);
		System.out.println("验证码："+str2);
		Scanner input=new Scanner(System.in);
		System.out.println("请输入验证码：");
		String str1=input.next();
		if(str2.equals(str)) {
			System.out.println("输入正确");
		}else {
			System.out.println("输入有误");
		}
		
		
		
	}
	
	
}
