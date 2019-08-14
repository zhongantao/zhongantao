package Test;

import java.util.Scanner;

/*
 * 10、判断.java文件名是否正确
 */
public class Test10 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("输入java源文件名：");
		//录入文件名
		String s=input.next();
		//转换成StringBuilder
		StringBuilder sb=new StringBuilder(s);
		//endWith判断是否正确
		if (s.endsWith(".java")) {
			System.out.println("文件名输入正确");
		}else {
			System.out.println("文件名格式错误");
		}
		
		
		
		
		
	}
}
