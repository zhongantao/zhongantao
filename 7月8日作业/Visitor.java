package Morning;

import java.util.Scanner;

/*
 * ���ݲ�ͬ���ο�������䣬������Ʊ���á�
��Ʊ����10�꼰���£���Ʊ��ѣ�10��60�꣬��ƱȫƱ������60�꣬��Ʊ���
Ч����ʾ���£�
 

 */
public class Visitor {
    static String name;
    static int age;
    
    

	public static void main(String[] args) {
		char dicision;
		do {
		Scanner input=new Scanner(System.in);
		System.out.print("������������");
        name=input.next();
		System.out.println();
        System.out.print("���������䣺");
		age=input.nextInt();
		System.out.println();
		Ticket ct=new Ticket();
		ct.cost(age);
		System.out.println("�Ƿ������y/n����");
		dicision=input.next().charAt(0);
		}while(dicision=='y');
	}

}
class Ticket{
	
	
	public static void cost(int age) {
		if(age<10) {
			System.out.println("��Ʊ���");
		}else if(age>=10&&age<=60) {
			System.out.println("��Ʊȫ�ѣ�20Ԫ");
		}else {
		    System.out.println("��Ʊ��ۣ�10Ԫ");
		}
	}	
	
}