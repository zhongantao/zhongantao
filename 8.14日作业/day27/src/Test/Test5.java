package Test;
/*
 *5���ַ���"#hh123@",�ж��Ƿ���"#"��ʼ��"@"��β�����ǣ��򽫸��ַ�����"hh123"��ȡ������
Ȼ�����жϴ����ַ����ĳ������Ƿ�Ϊ10��������������ں������0�Զ����䵽10�����ȡ�

 */
public class Test5 {

	public static void main(String[] args) {
		//�����ַ���
		String str="#hh123@";
		//�ж��Ƿ�Ϊ#��ͷ��@��β
		boolean b1=str.startsWith("#");
		boolean b2=str.endsWith("@");
		StringBuilder sb=new StringBuilder(str);
		//��ӡ
		if(b1&&b2) {
			
			sb.delete(str.length()-1, str.length()).delete(0, 1);
			str=sb.toString();
			System.out.println(str);
		}
		//����10����
		if(str.length()<10) {
			for(int i=0;i<(10-str.length());i++){
				sb.append("0") ;
			}
		}
		
		System.out.println(sb.toString());
		
	}
}
