package thursday;

public class Test01_MobilPhoneTest {
//�𰸣��������ˣ�����һ��ƻ�����ӵ��ֻ��ɣ�
/*
 *
 */

	public static void main(String[] args) {
		Test01_MobilPhone mp=new Test01_MobilPhone();//public���ε��������ͬһ���·���
		mp.brand="ƻ��";//���Է��ʣ���������public���Σ�����ͬһ���з��ʣ���brand��ֵΪ"ƻ��"
		String detail=mp.buy("��������");//buy��string reason��������public���Σ�����ͬһ���У�detail��ֵΪ:"��������"+"����һ��"+brand+"���ӵ��ֻ��ɣ�"
		System.out.println(detail);//���"�������ˣ�����һ��ƻ�����ӵ��ֻ��ɣ�"
		
	}
}
