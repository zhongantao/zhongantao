package Test;

import java.util.Scanner;

/*
 * 11��ϵͳ������ĸ����ȵ���֤��(�����֣���д��ĸ��Сд��ĸ���)��
�û��ڿ���̨������֤�룬�Ա���ϵͳ����֤���Ƿ�һ��(�����ִ�Сд)

 */
public class Test11 {

	public static void main(String[] args) {
		//����ϵͳ�����Χ�ַ���
		String str="1234567890"+
	               "abcdefghijklmnopqrsrtuvwxyz"+
				   "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] arr=str.toCharArray();
		char[] arr1=new char[4];
		for(int i=0;i<4;i++) {
			arr1[i]=arr[(int)(Math.random()*arr.length)];
		}
		String str2=String.valueOf(arr1);
		System.out.println("��֤�룺"+str2);
		Scanner input=new Scanner(System.in);
		System.out.println("��������֤�룺");
		String str1=input.next();
		if(str2.equals(str)) {
			System.out.println("������ȷ");
		}else {
			System.out.println("��������");
		}
		
		
		
	}
	
	
}
