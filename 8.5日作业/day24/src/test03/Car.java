package test03;

public  class Car extends Vehicle{

	String[] brands= {"宝马X6","宝马550i","别克林荫大道","别克GL8"};
	String[] licensePlate= {"京NY28588","京CNY3284","京NT37465","京BT96968"};
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
