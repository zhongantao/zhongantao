package Afternoon;
/*
 * ��дJava����������ʾ�˵����������䡣 ����һ������Person������Ӧ�����������ԣ�����name������age��
���幹�췽��������ʼ�����ݳ�Ա(�����Զ���)���ٶ�����ʾdisplay�����������������ӡ������ ��main�����д��������ʵ��Ȼ����Ϣ��ʾ��

 */
public class Test3_Person {
       String name;
       int age;
       public Test3_Person(String inputName,int inputAge) {
    	   name=inputName;
    	   age=inputAge;
       }
      
       public void display() {
    	   System.out.println("������"+name+"\n"+"���䣺"+age);
       }
       
       public static void main(String[] args) {
    	   Test3_Person test=new Test3_Person("����",20);
    	   test.display();
    	   
	}
}
