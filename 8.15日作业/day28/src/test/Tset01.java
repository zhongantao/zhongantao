package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 1����ȡ��ǰ��ʱ�䣬Ȼ��������մ˿̵�ʱ��(Ҫ�������ʽ xxxx��xx��xx��  ����/����    xxʱ��xx�֣�xx��   ���ڼ� )��
 */
public class Tset01 {
      public static void main(String[] args) throws ParseException{
	      //������ǰdate
    	  Date date=new Date();
	      //��ȡ�ڲ�longֵ
    	  long time=date.getTime();
	      //�����longֵ
    	  date.setTime(time+24*60*60);
	      //SimpleDateFormat��ʽ��
    	  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E");
	      //ת��Ϊstring����
	      String str=sdf.format(date);
	      System.out.println(str);
    	  
    	  
    	  
    	  
    	  
    	  
      }
}
