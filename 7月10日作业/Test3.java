package Moring;

import java.util.Scanner;

public class Test3 {
    static int latticeX;
    static int latticeY;
	static int x=9;
	static int y=19;
    static Scanner input=new Scanner(System.in);

    public static  void customLattice() {
	System.out.println("请输入格子的位置");
	System.out.println("x=");
	x=input.nextInt();
	System.out.println("y=");
	y=input.nextInt();
}

public static  void customWallpaper() {
	System.out.println("请输入坐标纸大小");
	System.out.println("x=");
	latticeX=input.nextInt();
	System.out.println("y=");
	latticeY=input.nextInt();
}	
public static  void LatticeFunction() {
	System.out.println("向左移动一格请输入left，向右移动一格输入right，向下一格输入down，自定义向下移动格数输入downY:");
    String fuction=input.next();
    if("left".equals(fuction)) {
    	latticeX-=1;
    }
 if("right".equals(fuction)) {
	 latticeX+=1;
    }
 if("down".equals(fuction)) {
	 latticeY-=1;
 }
 if("downY".equals(fuction)) {
 	 System.out.println("输入向下移动格数：");
 	 int move=input.nextInt();
 	latticeY-=move;
 }
}
public static void print() {
	for(int i=0;i<latticeX;i++) {
		for(int j = 0;j<latticeY;j++) {
			if(x==i&&y==j) {
				System.out.print("#");
			}else {
				System.out.print("-");
			}
		}
		System.out.println();
	}
}



public static void main(String[] args) {
	customLattice();
	customWallpaper();
	LatticeFunction();
	print();
}
 
}

	

