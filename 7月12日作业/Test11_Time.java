package Afternoon;

public class Test11_Time {

	public void StatisticsTime() {
		long time1= System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			
			int[] arr=new int[i];
		}
		long time2= System.currentTimeMillis();
		long time=(time2-time1);
		System.out.println("ϵͳ����10000�����黨����"+time+"����");
	}
	
	public static void main(String[] args) {
		Test11_Time s=new Test11_Time();
	    s.StatisticsTime();
		
	}
	
}
