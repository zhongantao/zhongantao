package Morning;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 9、有一个学生信息管理类StudentsBiz，可以保存30个学生姓名列表。
 * 并有能力增加学生姓名；有能力显示本班的学生姓名列表；
 * 有能力在一定区间查找学生姓名。
测试效果：

 */
public class StudentsBiz {
    String name;
	String names[]=new String[30];
	Scanner input=new Scanner(System.in);

	public void inputName(int i) {
	System.out.println("请输入学生姓名：");
	names[i]=input.next();
}

public void nameForm(int i) {
	System.out.println("本班学生列表：");
	for(int b=0;b<i;b++) {
		System.out.print(names[b]+"\t");
	}
}

public void search() {
	System.out.println("请输入开始查找的位置：");
	int start=input.nextInt();
	System.out.println("请输入开始查找的位置：");
	int end=input.nextInt();
	System.out.println("请输入查找的姓名：");
    String name=input.next();
    int searchNum=Arrays.binarySearch(names, name);
    System.out.println("****查找结果****");
    if(searchNum>=start&&searchNum<=end) {
    	System.out.println("找到了！");
    }else {
    	System.out.println("没找到！");
    }
}

	public static void main(String[] args) {
		StudentsBiz form=new StudentsBiz();	
		
		int i=0;
		for(;i<5;i++) {
		form.inputName(i);
		
		}
		form.nameForm(i);
		
	}

}
