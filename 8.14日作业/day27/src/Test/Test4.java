package Test;
/*
 * 4、判断"123456789"是否是回文（利用charAt方法）
 */
public class Test4 {

	public static void main(String[] args) {
		//创建字符串
		String str="123456789";
		//循环判断
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				System.out.println("不是回文");
				return;
			}
		}
		System.out.println("回文");
	}
}
