package Test;

import java.util.Scanner;

/*
 * 8、自定义一个字符串。用户键盘录入一个字符。
 * 判断该字符是否在自定义的字符串中（使用toCharArray方法）
 */
public class Test8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//创建字符串
		String str="今天作业好多";
		System.out.println("请输入一个字符");
		//录入字符
		String c=input.next();
		//判断是否在字符串中
		if(printArray(str.toCharArray(),c.toCharArray()[0])) {
			System.out.println("输入字符在自定义字符串中");
			return;
		}
		
		
		System.out.println("输入字符串不在字符串中");
		
		
		
	}

	private static boolean printArray(char[] charArray, char c) {
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]==c) {
				return true;
			}
		}
		return false;
	}
	
}
