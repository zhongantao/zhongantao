package test05;

public class PlainRect_Test {

	public static void main(String[] args) {
		PlainRect p=new PlainRect(10,10,20,10);
		System.out.println(p.area());
		System.out.println(p.perimeteter());
		boolean i=p.isInside(25.5, 13);
		if(i==true) {
			System.out.println("点在矩形内");
		}else {
			System.out.println("点在矩形外");
		}
		

	}

}
