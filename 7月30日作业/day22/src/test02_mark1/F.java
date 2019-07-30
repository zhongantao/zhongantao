package test02_mark1;
/*
 * 、在包mark1下创建类F，其中包含了成员变量:
sex常量  权限为public（公用）
age,height,name 权限为private（私有）

成员方法：
setAge()    
getName()

在包mark2下创建类S，能够继承类F。
在该类中定义成员变量：
isSex 赋值为父类的常量sex。
weight 成员变量被final修饰。
size成员变量被static修饰。 
在该类中定义static块，在类加载时能输出；“S类加载了！”


在包mark2中创建类Stest的main方法中测试。
在实例化S类前，其static块被调用一次。
调用S类中的weight ，能否被修改????
调用S类中的size，能否被修改????

 */
public class F {

	public static final String SEX="男";
	private int age;
	private int height;
	private String name;
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
