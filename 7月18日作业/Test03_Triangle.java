package thursday;

import java.util.Scanner;

public class Test03_Triangle {

	double a;
	double b;
	double c;
	static Scanner input=new Scanner(System.in);
	
	public void in() {
		System.out.println("请输入第一条边");
		a=input.nextDouble();
		System.out.println("请输入第二条边");
		b=input.nextDouble();
		System.out.println("请输入第三条边");
		c=input.nextDouble();
	}
	
	public void judge() {
		if(a+b<c||a+c<b||b+c<a) {
			System.out.println("不是三角形！");
		}else {
			if(a*a+b*b==c*c||b*b+c*c==a*a||a*a+c*c==b*b) {
				System.out.println("这是一个直角三角形");
			}else if(a*a+b*b<c*c||b*b+c*c<a*a||a*a+c*c<b*b) {
				System.out.println("这是一个钝角三角形");
			}else if(a*a+b*b>c*c||b*b+c*c>a*a||a*a+c*c>b*b) {
				System.out.println("这是一个锐角三角形");
			}
		}
	}
	
	public static void main(String[] args) {
		Test03_Triangle tr=new Test03_Triangle();
		String choose;
		do {
			tr.in();
			tr.judge();
			System.out.println("继续吗？（y/n）");
			choose=input.next();
		}while("y".equals(choose));
		System.out.println("谢谢使用！");
		
	}
	
}
