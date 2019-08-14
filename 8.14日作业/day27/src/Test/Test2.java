package Test;
/*
 * 2、有一个字符串www.baidu.com 。请截取两个子字符串，分别为 baidu     com
 */
public class Test2 {

	public static void main(String[] args) {
		//创建字符串
		String str="www.baidu.com";
		//截取baidu
		String sub1=str.substring(4,9);
		//截取com
		String sub2=str.substring(10,13);
		System.out.println(sub1.toString()+"\t"+sub2.toString());
	}
	
}
