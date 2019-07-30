package test02_mark2;

public class Stest {

	public static void main(String[] args) {
		S s=new S();
//		s.weight=100;  不能因为weight被final
		s.size=100;//可以被修改
	}
	
}
