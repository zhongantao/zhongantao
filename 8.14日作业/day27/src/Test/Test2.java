package Test;
/*
 * 2����һ���ַ���www.baidu.com �����ȡ�������ַ������ֱ�Ϊ baidu     com
 */
public class Test2 {

	public static void main(String[] args) {
		//�����ַ���
		String str="www.baidu.com";
		//��ȡbaidu
		String sub1=str.substring(4,9);
		//��ȡcom
		String sub2=str.substring(10,13);
		System.out.println(sub1.toString()+"\t"+sub2.toString());
	}
	
}
