package test;
/*
 * 3、编写一个Teacher类，有属性name，sex。
重写toString方法。要求打印Teacher类的对象时，能够输出
”类名:  name，sex的值”。

重写equals方法，要求比较Teacher类的两个对象时，对象相同或者对象中属性值一样，返回true。

（在代码的类前写好注释：  toString和equals方法来自哪个父类。并且父类中它们的功能是什么，请说明）

 */
public class Teacher {

	String sex;
	String name;
	
	public Teacher(String name,String sex) {
	          this.name=name;
	          this.sex=sex;
	}
	
	public String toString() {
		return this.getClass().getSimpleName()+":\t"+name+"\t"+sex;
		
	}
	
	public boolean equals(Teacher t) {
		
		if(t==this||(t.name==this.name&&t.sex==this.sex)) {
			return true;
		}
		return false;
		
	}
	
	/*
	 * toString和equals方法来自objec类在父类钟的功能是打印数组和比较字符串是否相等
	 */
	public static void main(String[] args) {
		
		Teacher t1=new Teacher("钟安涛","男");
		Teacher t2=new Teacher("熊彦锡","男");
		Teacher t3=new Teacher("钟安涛","男");
		System.out.println(t1.toString());
		System.out.println(t1.equals(t2));
		System.out.println(t1.equals(t3));
		
	}
	
}
