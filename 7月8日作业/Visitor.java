package Morning;

import java.util.Scanner;

/*
 * 根据不同的游客类的年龄，计算门票费用。
门票规则：10岁及以下，门票免费；10—60岁，门票全票；超过60岁，门票半价
效果显示如下：
 

 */
public class Visitor {
    static String name;
    static int age;
    
    

	public static void main(String[] args) {
		char dicision;
		do {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入姓名：");
        name=input.next();
		System.out.println();
        System.out.print("请输入年龄：");
		age=input.nextInt();
		System.out.println();
		Ticket ct=new Ticket();
		ct.cost(age);
		System.out.println("是否继续（y/n）？");
		dicision=input.next().charAt(0);
		}while(dicision=='y');
	}

}
class Ticket{
	
	
	public static void cost(int age) {
		if(age<10) {
			System.out.println("门票免费");
		}else if(age>=10&&age<=60) {
			System.out.println("门票全费：20元");
		}else {
		    System.out.println("门票半价：10元");
		}
	}	
	
}