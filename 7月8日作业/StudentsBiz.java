package Morning;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 9����һ��ѧ����Ϣ������StudentsBiz�����Ա���30��ѧ�������б�
 * ������������ѧ����������������ʾ�����ѧ�������б�
 * ��������һ���������ѧ��������
����Ч����

 */
public class StudentsBiz {
    String name;
	String names[]=new String[30];
	Scanner input=new Scanner(System.in);

	public void inputName(int i) {
	System.out.println("������ѧ��������");
	names[i]=input.next();
}

public void nameForm(int i) {
	System.out.println("����ѧ���б�");
	for(int b=0;b<i;b++) {
		System.out.print(names[b]+"\t");
	}
}

public void search() {
	System.out.println("�����뿪ʼ���ҵ�λ�ã�");
	int start=input.nextInt();
	System.out.println("�����뿪ʼ���ҵ�λ�ã�");
	int end=input.nextInt();
	System.out.println("��������ҵ�������");
    String name=input.next();
    int searchNum=Arrays.binarySearch(names, name);
    System.out.println("****���ҽ��****");
    if(searchNum>=start&&searchNum<=end) {
    	System.out.println("�ҵ��ˣ�");
    }else {
    	System.out.println("û�ҵ���");
    }
}

	public static void main(String[] args) {
		StudentsBiz form=new StudentsBiz();	
		
		int i=0;
		for(;i<5;i++) {
		form.inputName(i);
		
		}
		form.nameForm(i);
		
	}

}
