package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 1、获取当前的时间，然后输出明日此刻的时间(要求输出格式 xxxx年xx月xx日  上午/下午    xx时：xx分：xx秒   星期几 )。
 */
public class Tset01 {
      public static void main(String[] args) throws ParseException{
	      //创建当前date
    	  Date date=new Date();
	      //获取内部long值
    	  long time=date.getTime();
	      //明天的long值
    	  date.setTime(time+24*60*60);
	      //SimpleDateFormat格式化
    	  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E");
	      //转换为string类型
	      String str=sdf.format(date);
	      System.out.println(str);
    	  
    	  
    	  
    	  
    	  
    	  
      }
}
