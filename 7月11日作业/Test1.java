package Afternoon;
/*
 * 4���ڿ���̨����žų˷������ݶ�ά�����ṩѭ����������
 */
public class Test1 {
int[][] multiplicationForm= {{1},{9}};
public void Test1() {
	for(int i=multiplicationForm[0][0];i<=multiplicationForm[1][0];i++) {
		for(int j=multiplicationForm[0][0];j<=multiplicationForm[1][0];j++) {
		if(j<=i) {
			System.out.print( i+"*"+j+"="+i*j+" ");
	}
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	Test1 mul=new Test1();
	mul.Test1();
}
}
