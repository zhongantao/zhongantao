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
		System.out.println("����������");
		 loanMoney=input.nextDouble();
		if(loanMoney<=0) {
			System.out.println("������������");
		}else {
			System.out.println("��ѡ��������ޣ�1��3�꣨36���£� 2��5�꣨60���£�  3��20�꣨240���£�");
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
					System.out.println("������������");
				}
		
			interest=loanMoney*loanTerm*interestRate;
			monthlyPayment=(loanMoney+interest)/loanTerm/12;
					
		}
	}
	
	public void print() {
		System.out.println("***�¹�Ϊ��"+monthlyPayment);
	}
	
	public static void main(String[] args) {
		Test02_LoanToolBox lo=new Test02_LoanToolBox();
		do {
			lo.loan();
		}while(lo.loanMoney==0||lo.loanTerm==0);
		lo.print();
	}
	
}