package test01;

import java.util.Arrays;

public class Test02_test {

	public static void main(String[] args) {
		double[] arr=new double[3]; 
		Test01_Shape test=new Test01_Circular();
		arr[0]=test.area();
		test=new Test01_Square();
		arr[1]=test.area();
		test=new Test01_dengyaozhijiao();
		arr[2]=test.area();
	    Arrays.sort(arr);
	    System.out.println("图形面积由大到小的顺序是："+Arrays.toString(arr));
	}
}
