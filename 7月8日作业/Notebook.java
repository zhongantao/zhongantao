package Morning;
/*
 * 7、提取笔记本的属性，并使用三种方法，显示笔记本的信息
 */
public class Notebook {
     
 int length;
 int wide;
 int numberOfPages;

public void methord1(Notebook n) {
	System.out.println("长："+n.length+"\t"+"宽："+n.wide+"\t"+"页数："+n.numberOfPages);
}
public  void methord2(int length,int wide,int numberOfPages) {
	System.out.println("长："+length+"\t"+"宽："+wide+"\t"+"页数："+numberOfPages);
}
public  void methord3() {
	System.out.println("长："+length+"\t"+"宽："+wide+"\t"+"页数："+numberOfPages);
}	
	public static void main(String[] args) {
		

	}

}
