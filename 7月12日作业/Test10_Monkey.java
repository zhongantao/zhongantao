package Afternoon;

public class Test10_Monkey {
	
		public static int peachs(int x) {
			if(x==1) {
				return 1;
			}else {
				return 1+2*peachs(x-1);
			}
		}
		
		public static void main(String[] args) {
			System.out.println(peachs(3));
		}
	}


