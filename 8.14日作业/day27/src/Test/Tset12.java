package Test;

import java.util.Scanner;

/*
 * 12、键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数,其他字符出现的次数。
例如键盘录入：ABCDEabcd123456!@#$%^
 输出：ABCDEabcd123456!@#$%^中大写字母有:5个,小写字母有:4个,数字字符:6个,其他字符:6。

 */
public class Tset12 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str1="abcdefghijklmnopqrstuvwxyz";
		String str2="1234567890";
		String str3="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int sum1=0,sum2=0,sum3=0;
		System.out.println("请输入字符串：");
		String str4=input.next();
		for(int i=0;i<str4.length();i++) {
			for(int j=0;j<str1.length();j++) {
				if(str4.toCharArray()[i]==str1.toCharArray()[j]) {
					sum1+=1;
				}
			}
			for(int j=0;j<str1.length();j++) {
				if(str4.toCharArray()[i]==str2.toCharArray()[j]) {
					sum2+=1;
				}
			}
			for(int j=0;j<str1.length();j++) {
					if(str4.toCharArray()[i]==str3.toCharArray()[j]) {
						sum3+=1;
				}
			}
				
			
		
		}
		System.out.println(str4+"中大写字母有"+sum3+"个，小写字母"+sum1+"个，数字"+sum2+"个，其他字符"+(str4.length()-sum1-sum2-sum3)+"个");
			
			
		}
		
		
		
		
		
		
		
		
	}
	

