package test;
/*
 * 3����дһ��Teacher�࣬������name��sex��
��дtoString������Ҫ���ӡTeacher��Ķ���ʱ���ܹ����
������:  name��sex��ֵ����

��дequals������Ҫ��Ƚ�Teacher�����������ʱ��������ͬ���߶���������ֵһ��������true��

���ڴ������ǰд��ע�ͣ�  toString��equals���������ĸ����ࡣ���Ҹ��������ǵĹ�����ʲô����˵����

 */
public class Teacher {

	String sex;
	String name;
	
	public Teacher(String name,String sex) {
	          this.name=name;
	          this.sex=sex;
	}
	
	public String toString() {
		return this.getClass().getSimpleName()+":\t"+name+"\t"+sex;
		
	}
	
	public boolean equals(Teacher t) {
		
		if(t==this||(t.name==this.name&&t.sex==this.sex)) {
			return true;
		}
		return false;
		
	}
	
	/*
	 * toString��equals��������objec���ڸ����ӵĹ����Ǵ�ӡ����ͱȽ��ַ����Ƿ����
	 */
	public static void main(String[] args) {
		
		Teacher t1=new Teacher("�Ӱ���","��");
		Teacher t2=new Teacher("������","��");
		Teacher t3=new Teacher("�Ӱ���","��");
		System.out.println(t1.toString());
		System.out.println(t1.equals(t2));
		System.out.println(t1.equals(t3));
		
	}
	
}
