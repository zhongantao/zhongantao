package test02_mark1;
/*
 * ���ڰ�mark1�´�����F�����а����˳�Ա����:
sex����  Ȩ��Ϊpublic�����ã�
age,height,name Ȩ��Ϊprivate��˽�У�

��Ա������
setAge()    
getName()

�ڰ�mark2�´�����S���ܹ��̳���F��
�ڸ����ж����Ա������
isSex ��ֵΪ����ĳ���sex��
weight ��Ա������final���Ρ�
size��Ա������static���Ρ� 
�ڸ����ж���static�飬�������ʱ���������S������ˣ���


�ڰ�mark2�д�����Stest��main�����в��ԡ�
��ʵ����S��ǰ����static�鱻����һ�Ρ�
����S���е�weight ���ܷ��޸�????
����S���е�size���ܷ��޸�????

 */
public class F {

	public static final String SEX="��";
	private int age;
	private int height;
	private String name;
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
