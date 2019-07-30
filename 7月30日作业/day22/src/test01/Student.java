package test01;
/*
 * 有类Student，属性sex被protected修饰。
现有子类PostGradute。
证明：
  sex不仅能在本类，同包中的其他类访问。跨包下，其子类 也访问

 */
public class Student {
   
	protected    String  sex;
	
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.sex);
	}
}
