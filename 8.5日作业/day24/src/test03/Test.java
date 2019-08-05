package test03;

public class Test {

	public static void main(String[] args) {
		LeaseManagement a=new LeaseManagement();
		Car car=new Car();
		Bus bus=new Bus();
		a.service(car, bus);
	}

}
