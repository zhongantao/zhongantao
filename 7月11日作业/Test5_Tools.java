package Afternoon;
/*
 * 8������һ�������࣬�Ժ����ʹ����������࣬�ṩһ�¹��ܣ�
1��ͨ����������x,�������1��x���������[1,x]
2����ȡ��ǰϵͳʱ�䡣 �����Ĵ���System.currentTimeMillis()��
3��1������x����͡�
4������x�Ľ׳�

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
