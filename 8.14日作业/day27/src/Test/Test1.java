package Test;
/*
 * 1����һ���ַ��� qwertyy123df    dsgfag����������ж�����ַ����а���123��
 */
public class Test1 {

	public static void main(String[] args) {
		//ԭʼ����
		String str="qwetyy123df";
		//����123�±�
		int index=str.indexOf("123");
		//�ж����
		if(index==-1) {
			System.out.println("�ַ���������123");
		}else {
			System.out.println("�ַ�������123");
		}
		
	}
}
