package Afternoon;
/*
 * 在控制台输出如下：（依据二维数组提供循环变量）：
1 2 3 4 5 6
6 5 4 3 2 1
6 5 4 3 2 1
1 2 3 4 5 6

 */
public class Test2 {

	int[][] arr= {{1,4},{6}};
	
	public void Test2() {
		for(int i=arr[0][0];i<=arr[0][1];i++) {
			if(i==arr[0][0]||i==arr[0][1]) {
				for(int j=arr[0][0];j<=arr[1][0];j++) {
			        System.out.print(j+" ");
				}
			}else {
					for(int j=arr[0][0];j<=arr[1][0];j++) {
				        System.out.print(arr[1][0]+arr[0][0]-j+" ");	
					}
			}
			System.out.println();
		}
	}
	
public static void main(String[] args) {
	Test2 a=new Test2();
	a.Test2();
}
	
	
}
