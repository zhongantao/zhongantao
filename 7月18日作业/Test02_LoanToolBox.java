package thursday;

import java.util.Scanner;

public class Test02_LoanToolBox {

	double loanMoney;
	double interest;
	int loanTerm;
	double interestRate;
	double monthlyPayment;
	
	
	public void loan() {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入贷款金额：");
		 loanMoney=input.nextDouble();
		if(loanMoney<=0) {
			System.out.println("您的输入有误");
		}else {
			System.out.println("请选择贷款年限：1、3年（36个月） 2、5年（60个月）  3、20年（240个月）");
			int x=input.nextInt();
			if(x==1){
				loanTerm=3;
				 interestRate=0.0603;
				}else if(x==2) {
					loanTerm=4;
					 interestRate=0.0612;	
				}else if(x==3) {
					loanTerm=20;
					 interestRate=0.0639;
				}else {
					System.out.println("您的输入有误");
				}
		
			interest=loanMoney*loanTerm*interestRate;
			monthlyPayment=(loanMoney+interest)/loanTerm/12;
					
		}
	}
	
	public void print() {
		System.out.println("***月供为："+monthlyPayment);
	}
	
	public static void main(String[] args) {
		Test02_LoanToolBox lo=new Test02_LoanToolBox();
		do {
			lo.loan();
		}while(lo.loanMoney==0||lo.loanTerm==0);
		lo.print();
	}
	
}