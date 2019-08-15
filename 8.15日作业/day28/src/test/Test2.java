package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * 、自己键盘录入一个时间，格式为"yyyy-MM-dd HH:mm:ss"。然后分别输出这个时间的分量：年，月，日。
如果录入的日期字符串格式不对，可重新录入时间。

 */
public class Test2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	    //循环判断值
		boolean b=true;
		do {
			System.out.println("请输入一个时间：");
		//取得输入
			String str=input.nextLine();
		//SimpleDateFormat格式化
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//转换为date,然后转换为string并判断
		try {
		Date date=sdf.parse(str);
		String str1=sdf.format(date);
		Calendar gl=Calendar.getInstance();
		gl.setTime(date);
		int year=gl.get(Calendar.YEAR);
		int month=gl.get(Calendar.MONTH);
		int day=gl.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year+"年"+(month+1)+"月"+day);
		}catch(ParseException p) {
			System.out.println("请重新输入");
			b=false;
		}
		}while(!b);
		
		
		
		
		
		
		
		
		
		}
	
}
