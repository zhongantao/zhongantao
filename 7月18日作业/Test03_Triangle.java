package thursday;

import java.util.Scanner;

public class Test03_Triangle {

	double a;
	double b;
	double c;
	static Scanner input=new Scanner(System.in);
	
	public void in() {
		System.out.println("�������һ����");
		a=input.nextDouble();
		System.out.println("������ڶ�����");
		b=input.nextDouble();
		System.out.println("�������������");
		c=input.nextDouble();
	}
	
	public void judge() {
		if(a+b<c||a+c<b||b+c<a) {
			System.out.println("���������Σ�");
		}else {
			if(a*a+b*b==c*c||b*b+c*c==a*a||a*a+c*c==b*b) {
				System.out.println("����һ��ֱ��������");
			}else if(a*a+b*b<c*c||b*b+c*c<a*a||a*a+c*c<b*b) {
				System.out.println("����һ���۽�������");
			}else if(a*a+b*b>c*c||b*b+c*c>a*a||a*a+c*c>b*b) {
				System.out.println("����һ�����������");
			}
		}
	}
	
	public static void main(String[] args) {
		Test03_Triangle tr=new Test03_Triangle();
		String choose;
		do {
			tr.in();
			tr.judge();
			System.out.println("�����𣿣�y/n��");
			choose=input.next();
		}while("y".equals(choose));
		System.out.println("ллʹ�ã�");
		
	}
	
}
