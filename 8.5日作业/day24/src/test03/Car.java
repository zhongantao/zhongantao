package test03;

public  class Car extends Vehicle{

	String[] brands= {"����X6","����550i","���������","���GL8"};
	String[] licensePlate= {"��NY28588","��CNY3284","��NT37465","��BT96968"};
	int[] dayRents= {800,600,300,600};
	@Override
	public double discount(int day) {
		if(day<=7) {
			return 1;
		}else if(day>7&&day<=30) {
			return 0.9;
		}else if(day>30&&day<=150){
			return 0.8;
		}else {
			return 0.7;
		}
		
	}
	
	
	
}
