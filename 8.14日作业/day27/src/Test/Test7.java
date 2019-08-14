package Test;

import java.util.Scanner;

/*
 * 7、利用StringBuilder的反转方法，判断给定的字符串是否为回文(字符串自定义)
 */
public class Test7 {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入字符串：");
		//键盘录入
		String str=input.next();
		//转换str为StringBuilder
		StringBuilder sb=new StringBuilder(str);
		//创建str1为str反转字符串
		String str1=sb.reverse().toString();
		//循环判断
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=str1.charAt(i)) {
			    System.out.println("不是回文");
			    return;
			}
		}
		
		System.out.println("回文");
		
	}
	
	
}
