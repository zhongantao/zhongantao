package Test02;

public class Test {
    
	
	
	public static void main(String[] args) {
    	com.baidu.payment2.marketDepartment.One   test02=new com.baidu.payment2.marketDepartment.One();
    	test02.setName("刘明");
    	System.out.println(test02.getName());
	}   
	/*
	 *引用类One，在栈中开辟一个栈帧，存放test02；
	 *通过test02.setName("刘明")的地址指向堆中的成员变量
	 *然后调用共享的drop（）方法。它会在栈中开辟一个栈帧，里面存放drop的局部变量和参数
	 * drop（）结束，该方法的栈帧消失
	 * 之后main方法结束，类one的栈帧消失
	 *
	 *
	 */
}
