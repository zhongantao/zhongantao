package Test;

import java.util.Scanner;

/*
 * 8���Զ���һ���ַ������û�����¼��һ���ַ���
 * �жϸ��ַ��Ƿ����Զ�����ַ����У�ʹ��toCharArray������
 */
public class Test8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//�����ַ���
		String str="������ҵ�ö�";
		System.out.println("������һ���ַ�");
		//¼���ַ�
		String c=input.next();
		//�ж��Ƿ����ַ�����
		if(printArray(str.toCharArray(),c.toCharArray()[0])) {
			System.out.println("�����ַ����Զ����ַ�����");
			return;
		}
		
		
		System.out.println("�����ַ��������ַ�����");
		
		
		
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
