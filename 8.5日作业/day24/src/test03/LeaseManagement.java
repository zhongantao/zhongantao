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
		System.out.println("��ӭ�����ڷ��������޹�˾");
		for(int i=0;i<11;i++) {
			System.out.print("*");
		}
		System.out.println("\n1���γ�\t2���ͳ�\n��ѡ����Ҫ���޵��������ͣ�");
		int j=input.nextInt();
		if(j==1) {
			System.out.println("��ѡ����Ҫ���޵�����Ʒ�ƣ�1������X6 2������550i 3����������� 4�����GL8");
			a=input.nextInt();
			System.out.println("��������Ҫ���޵�������");
			b=input.nextInt();
			c=car.discount(b);
		sum=c*b*car.dayRents[a-1];
		System.out.println("��������������ƺ���:"+car.licensePlate[a-1]);
		System.out.println("����Ҫ֧�������޷����ǣ�"+sum+"Ԫ");
		}if(j==2){
			System.out.println("��ѡ����Ҫ���޵�����Ʒ�ƣ�1����16�� 2������16��  3����34��  4������34��");
			a=input.nextInt();
			System.out.println("��������Ҫ���޵�������");
			b=input.nextInt();
			c=bus.discount(b);
		sum=c*b*bus.dayRents[a-1];
		System.out.println("��������������ƺ���:"+bus.licensePlate);
		System.out.println("����Ҫ֧�������޷����ǣ�"+sum+"Ԫ");
		}
	}

	
	
}
