package Test;
/*
 * �����ַ���"  baidu  ",������ַ���ƴ�ӳ�www.baidu.com
 */
public class Test3 {

	public static void main(String[] args) {
		//�����ַ���
		String str="baidu";
		//ת��StingBuilder����
		StringBuilder sb=new StringBuilder(str);
		//���.com
		sb.append(".com");
		//����www��
		sb.insert(0, "www.");
		//ת�����ַ���
		str=sb.toString();
		System.out.println(str);
	}
}
