package Test;

import java.util.Scanner;

/*
 * 10���ж�.java�ļ����Ƿ���ȷ
 */
public class Test10 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("����javaԴ�ļ�����");
		//¼���ļ���
		String s=input.next();
		//ת����StringBuilder
		StringBuilder sb=new StringBuilder(s);
		//endWith�ж��Ƿ���ȷ
		if (s.endsWith(".java")) {
			System.out.println("�ļ���������ȷ");
		}else {
			System.out.println("�ļ�����ʽ����");
		}
		
		
		
		
		
	}
}
