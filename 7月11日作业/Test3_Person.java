package Afternoon;
/*
 * 编写Java程序用于显示人的姓名和年龄。 定义一个人类Person该类中应该有两个属性：姓名name和年龄age。
定义构造方法用来初始化数据成员(数据自定义)。再定义显示display方法将姓名和年龄打印出来。 在main方法中创建人类的实例然后将信息显示。

 */
public class Test3_Person {
       String name;
       int age;
       public Test3_Person(String inputName,int inputAge) {
    	   name=inputName;
    	   age=inputAge;
       }
      
       public void display() {
    	   System.out.println("姓名："+name+"\n"+"年龄："+age);
       }
       
       public static void main(String[] args) {
    	   Test3_Person test=new Test3_Person("张三",20);
    	   test.display();
    	   
	}
}
