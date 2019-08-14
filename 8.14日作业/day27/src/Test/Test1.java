package Test;
/*
 * 1、有一个字符串 qwertyy123df    dsgfag，请问如何判断这个字符串中包含123？
 */
public class Test1 {

	public static void main(String[] args) {
		//原始数组
		String str="qwetyy123df";
		//查找123下标
		int index=str.indexOf("123");
		//判断输出
		if(index==-1) {
			System.out.println("字符串不包含123");
		}else {
			System.out.println("字符串包含123");
		}
		
	}
}
