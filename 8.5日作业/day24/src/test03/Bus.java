package test03;

public class Bus {

	String[] brands= {"金杯16座","金龙16座","金杯34座","金龙34座"};
	String[] licensePlate= {"京6566754","京8696997","京9696996","京8696998"};
	int[] dayRents= {800,800,1500,1500};

	public double discount(int day) {
		if(day<3) {
			return 1;
		}else if(day>=3&&day<7) {
			return 0.9;
		}
		else if(day>7&&day<=30) {
			return 0.8;
		}else if(day>30&&day<=150){
			return 0.7;
		}else {
			return 0.6;
		}
		
	}
}
