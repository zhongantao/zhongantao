package test03;

import java.util.Scanner;

public class LeaseManagement implements VehicleBusiness{

	
	public void service(Car car,Bus bus) {
		Scanner input=new Scanner(System.in);
		int a,b;
		double c,sum;
		for(int i=0;i<11;i++) {
			System.out.print("*");
		}
		System.out.println("欢迎光临腾飞汽车租赁公司");
		for(int i=0;i<11;i++) {
			System.out.print("*");
		}
		System.out.println("\n1、轿车\t2、客车\n请选择您要租赁的汽车类型：");
		int j=input.nextInt();
		if(j==1) {
			System.out.println("请选择你要租赁的汽车品牌：1、宝马X6 2、宝马550i 3、别克林荫大道 4、别克GL8");
			a=input.nextInt();
			System.out.println("请输入您要租赁的天数：");
			b=input.nextInt();
			c=car.discount(b);
		sum=c*b*car.dayRents[a-1];
		System.out.println("分配给您的汽车牌号是:"+car.licensePlate[a-1]);
		System.out.println("您需要支付的租赁费用是："+sum+"元");
		}if(j==2){
			System.out.println("请选择你要租赁的汽车品牌：1、金杯16座 2、金龙16座  3、金杯34座  4、金龙34座");
			a=input.nextInt();
			System.out.println("请输入您要租赁的天数：");
			b=input.nextInt();
			c=bus.discount(b);
		sum=c*b*bus.dayRents[a-1];
		System.out.println("分配给您的汽车牌号是:"+bus.licensePlate);
		System.out.println("您需要支付的租赁费用是："+sum+"元");
		}
	}

	
	
}
