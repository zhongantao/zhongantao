package Test03;

public class Students {
 
	String name;
	int age;
	String sex;
	
	
	public Students(int age) {
		this.age=age;
	}
	
	public void setName(String name) {
		
	}
	
	
	
	public  Students(String name,int age,String sex) {
		this(age);
		this.sex=sex;
		this.setName(name);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
