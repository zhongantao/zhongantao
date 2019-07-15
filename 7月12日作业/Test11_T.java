package Afternoon;

public class Test11_T {
	
		
		int x;
		int y;
		
		Test11_TCoordinate[] Ts;
		
		public Test11_T(int x1,int y1) {
			Ts=new Test11_TCoordinate[] {
					new Test11_TCoordinate(x1,y1),
					new Test11_TCoordinate(x1+1,y1),
					new Test11_TCoordinate(x1+2,y1),
					new Test11_TCoordinate(x1+1,y1+1)};
		}

		public void left() {
			x--;
		}
		
		public void right() {
				x++;
		}
		
		public void down() {
				y++;
		}
		
		public void down(int n) {
				y+=n;
		}
		
		public void showImag() {
			for(Test11_TCoordinate T:Ts) {
				System.out.println("格子当前坐标：("+T.x+","+T.y+")");
			}
		}
		
		public static void main(String[] args) {
			Test11_T a=new Test11_T(1,1); 
			a.showImag();
		}
}
