package Test;

import java.util.Scanner;

/*
 * 9����Աע��
Ҫ��
���û������Ȳ�С��3
�����볤�Ȳ�С��6
��ע��ʱ�����������������ͬ 

 */
public class Test9 {

	public static void main(String[] args) {
		//��ʼ����
		System.out.println("***��ӭ����ע��ϵͳ***");
		System.out.println();
		Scanner input=new Scanner(System.in);
		//�����ж�ֵ
		boolean b=false;
		//ѭ������
		do{
			System.out.println("�������û�����");
			String username=input.next();
			System.out.println("���������룺");
		    String userpassword1=input.next();
		    System.out.println("���ٴ��������룺");
		    String userpassword2=input.next();
			//���������ж��Ƿ�����ѭ��
		    if(userpassword1==userpassword2) {
				System.out.println("�����������������ͬ");
			}else if(username.length()>=3&&userpassword1.length()>=6) {
				System.out.println("�û������Ȳ�С��3�����볤�Ȳ�С��6");
			}else {
				b=true;
			}
			
			
		}while(b);
		
		
		
		
		
		
	}
	
}
