package Moring;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1������¼��ѧԱ������ѧ�֡�
¼����Ϻ󣬹���ϵͳ���Զ��޸�ѧԱ�ɼ�������60�����2�֡�Ҳ��������Ե�ѧԱ�ɼ���

 */
public class Test1 {
   
	static String[] names=new String[100000];
	static int[] scores=new int[100000];
	static Scanner input=new Scanner(System.in);
public static void inScore() {	
	for(int i=0;i<1000;i++) {
	
	
		if(names[i]==null) {
	System.out.println("������������");
	names[i]=input.next();
    System.out.println("������ѧ���ɼ���");
    scores[i]=input.nextInt();
	if(scores[i]<60) {
		scores[i]+=2;
	}
	
	System.out.println("�Ƿ����y/n��");
	String choose=input.next();
    
	if("y".equals(choose)) {
		continue;
	}else {
		break;
	}
		}
	}
}

public static void outScore() {
	for(int i=0;i<1000;i++) {
		if(names[i]!=null) {
			System.out.println("ѧ������"+names[i]+"\t"+"ѧ���ɼ�"+scores[i]);
		}else {
			break;
		}
	}
}

public static void main(String[] args) {
	inScore();
	outScore();
	
	
}
	
}
