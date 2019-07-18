package thursday;

public class Test01_MobilPhoneTest {
//答案：发工资了，快买一个苹果牌子的手机吧！
/*
 *
 */

	public static void main(String[] args) {
		Test01_MobilPhone mp=new Test01_MobilPhone();//public修饰的类可以在同一包下访问
		mp.brand="苹果";//可以访问；该属性由public修饰，可在同一包中访问，将brand赋值为"苹果"
		String detail=mp.buy("发工资了");//buy（string reason）方法由public修饰，可在同一包中；detail赋值为:"发工资了"+"，买一个"+brand+"牌子的手机吧！"
		System.out.println(detail);//输出"发工资了，快买一个苹果牌子的手机吧！"
		
	}
}
