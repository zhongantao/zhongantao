package Test;

import java.util.Scanner;

/*
 * 12������¼��һ���ַ�����ͳ�Ƹ��ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ���,�����ַ����ֵĴ�����
�������¼�룺ABCDEabcd123456!@#$%^
 �����ABCDEabcd123456!@#$%^�д�д��ĸ��:5��,Сд��ĸ��:4��,�����ַ�:6��,�����ַ�:6��

 */
public class Tset12 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str1="abcdefghijklmnopqrstuvwxyz";
		String str2="1234567890";
		String str3="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int sum1=0,sum2=0,sum3=0;
		System.out.println("�������ַ�����");
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
		System.out.println(str4+"�д�д��ĸ��"+sum3+"����Сд��ĸ"+sum1+"��������"+sum2+"���������ַ�"+(str4.length()-sum1-sum2-sum3)+"��");
			
			
		}
		
		
		
		
		
		
		
		
	}
	

