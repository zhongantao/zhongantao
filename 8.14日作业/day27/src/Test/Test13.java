package Test;
/*
 * 12����һ���ַ�����0����ѭ��ʮ�Ρ�(ʹ��stringBuilder�������δ�������)
��һ�Σ���01��
�ڶ���: ��012��
�����Σ���0123��
��������������
��ʮ�Σ���012345678910��

ע��������ս�����ַ���

 */
public class Test13 {

	public static void main(String[] args) {
		//�����ַ���0
		String str="0";
		//ת��ΪStringBuilder����
		StringBuilder sb=new StringBuilder(str);
		//appendѭ���������1����10
		for(int i=1;i<=10;i++) {
			sb.append(i);
		}
		//תΪString���Ͳ���ӡ
		str=sb.toString();
		System.out.println(str);
		
	}
	
	
}
