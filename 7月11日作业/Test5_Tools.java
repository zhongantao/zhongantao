package Afternoon;
/*
 * 8、创建一个工具类，以后可以使用这个工具类，提供一下功能：
1、通过传入整数x,返回随机1—x的随机数。[1,x]
2、获取当前系统时间。 （核心代码System.currentTimeMillis()）
3、1到整数x的求和。
4、整数x的阶乘

 */
public class Test5_Tools {
 
	public int Tools(int x) {
		int a=(int)(Math.random()*x);
		return a;
	}
	public long getTime() {
		 return System.currentTimeMillis();
	}
	public int addition(int x) {
		int a;
		int sum=0;
		for(a=1;a<=x;a++) {
			sum+=a;
		}
		return sum;
	}
	
	public int multiplication(int x) {
		int a;
		int sum=1;
		for(a=1;a<=x;a++) {
			sum*=a;
		}
		return sum;
	}
	
}
