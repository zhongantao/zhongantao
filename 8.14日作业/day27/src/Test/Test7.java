package Test;

import java.util.Scanner;

/*
 * 7������StringBuilder�ķ�ת�������жϸ������ַ����Ƿ�Ϊ����(�ַ����Զ���)
 */
public class Test7 {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("�������ַ�����");
		//����¼��
		String str=input.next();
		//ת��strΪStringBuilder
		StringBuilder sb=new StringBuilder(str);
		//����str1Ϊstr��ת�ַ���
		String str1=sb.reverse().toString();
		//ѭ���ж�
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=str1.charAt(i)) {
			    System.out.println("���ǻ���");
			    return;
			}
		}
		
		System.out.println("����");
		
	}
	
	
}
