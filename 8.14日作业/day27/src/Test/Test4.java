package Test;
/*
 * 4���ж�"123456789"�Ƿ��ǻ��ģ�����charAt������
 */
public class Test4 {

	public static void main(String[] args) {
		//�����ַ���
		String str="123456789";
		//ѭ���ж�
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				System.out.println("���ǻ���");
				return;
			}
		}
		System.out.println("����");
	}
}
