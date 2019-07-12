package Afternoon;
/*
 * 4、在控制台输出九九乘法表（依据二维数组提供循环变量）：
 */
public class Test1 {
int[][] multiplicationForm= {{1},{9}};
public void Test1() {
	for(int i=multiplicationForm[0][0];i<=multiplicationForm[1][0];i++) {
		for(int j=multiplicationForm[0][0];j<=multiplicationForm[1][0];j++) {
		if(j<=i) {
			System.out.print( i+"*"+j+"="+i*j+" ");
	}
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	Test1 mul=new Test1();
	mul.Test1();
}
}
