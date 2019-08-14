package Test;
/*
 * 、有字符串"  baidu  ",将这个字符串拼接成www.baidu.com
 */
public class Test3 {

	public static void main(String[] args) {
		//创建字符串
		String str="baidu";
		//转成StingBuilder类型
		StringBuilder sb=new StringBuilder(str);
		//添加.com
		sb.append(".com");
		//插入www。
		sb.insert(0, "www.");
		//转换成字符串
		str=sb.toString();
		System.out.println(str);
	}
}
