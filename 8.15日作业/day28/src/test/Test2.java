package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * ���Լ�����¼��һ��ʱ�䣬��ʽΪ"yyyy-MM-dd HH:mm:ss"��Ȼ��ֱ�������ʱ��ķ������꣬�£��ա�
���¼��������ַ�����ʽ���ԣ�������¼��ʱ�䡣

 */
public class Test2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	    //ѭ���ж�ֵ
		boolean b=true;
		do {
			System.out.println("������һ��ʱ�䣺");
		//ȡ������
			String str=input.nextLine();
		//SimpleDateFormat��ʽ��
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//ת��Ϊdate,Ȼ��ת��Ϊstring���ж�
		try {
		Date date=sdf.parse(str);
		String str1=sdf.format(date);
		Calendar gl=Calendar.getInstance();
		gl.setTime(date);
		int year=gl.get(Calendar.YEAR);
		int month=gl.get(Calendar.MONTH);
		int day=gl.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year+"��"+(month+1)+"��"+day);
		}catch(ParseException p) {
			System.out.println("����������");
			b=false;
		}
		}while(!b);
		
		
		
		
		
		
		
		
		
		}
	
}
