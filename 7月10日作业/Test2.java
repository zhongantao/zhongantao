package Moring;
/*
 * 2、有一个计算器，能够计算两个数字的和，三个数字的和，四个数字的和。五个数字的和
 */
public class Test2 {
double sum;
	
public double calculater(double a,double b) {
	sum=a+b;
	return sum;
}
public double calculater(double a,double b,double c) {
	sum=a+b+c;
	return sum;
}	
public double calculater(double a,double b,double c,double d) {
	sum=a+b+c+d;
	return sum;
}	
public double calculater(double a,double b,double c,double d,double e) {
	sum=a+b+c+d+e;
	return sum;
}	
}
