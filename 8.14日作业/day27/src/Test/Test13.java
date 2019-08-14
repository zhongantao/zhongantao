package Test;
/*
 * 12、在一个字符串“0”，循环十次。(使用stringBuilder，避免多次创建对象)
第一次：”01”
第二次: ”012”
第三次：”0123”
。。。。。。。
第十次：”012345678910”

注：输出最终结果的字符串

 */
public class Test13 {

	public static void main(String[] args) {
		//创建字符串0
		String str="0";
		//转换为StringBuilder类型
		StringBuilder sb=new StringBuilder(str);
		//append循环添加数字1——10
		for(int i=1;i<=10;i++) {
			sb.append(i);
		}
		//转为String类型并打印
		str=sb.toString();
		System.out.println(str);
		
	}
	
	
}
