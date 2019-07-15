package Afternoon;

public class Test11_L {
	
		int x;
		int y;
		
		Test11_LCoordinate[] Ls;
		
		public Test11_L(int x1,int y1) {
			Ls=new Test11_LCoordinate[] {
					new Test11_LCoordinate(x1,y1),
					new Test11_LCoordinate(x1,y1+1),
					new Test11_LCoordinate(x1,y1+2),
					new Test11_LCoordinate(x1+1,y1+2)};
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
			for(Test11_LCoordinate L:Ls) {
				System.out.println("格子当前坐标：("+L.x+","+L.y+")");
			}
		}
		
		public static void main(String[] args) {
			Test11_L a=new Test11_L(1,1); 
			a.showImag();
		}
		}



