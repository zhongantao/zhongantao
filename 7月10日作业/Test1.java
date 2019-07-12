package Moring;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1、键盘录入学员姓名与学分。
录入完毕后，管理系统能自动修改学员成绩，少于60的提高2分。也能输出所以的学员成绩。

 */
public class Test1 {
   
	static String[] names=new String[100000];
	static int[] scores=new int[100000];
	static Scanner input=new Scanner(System.in);
public static void inScore() {	
	for(int i=0;i<1000;i++) {
	
	
		if(names[i]==null) {
	System.out.println("请输入姓名：");
	names[i]=input.next();
    System.out.println("请输入学生成绩：");
    scores[i]=input.nextInt();
	if(scores[i]<60) {
		scores[i]+=2;
	}
	
	System.out.println("是否继续y/n：");
	String choose=input.next();
    
	if("y".equals(choose)) {
		continue;
	}else {
		break;
	}
		}
	}
}

public static void outScore() {
	for(int i=0;i<1000;i++) {
		if(names[i]!=null) {
			System.out.println("学生姓名"+names[i]+"\t"+"学生成绩"+scores[i]);
		}else {
			break;
		}
	}
}

public static void main(String[] args) {
	inScore();
	outScore();
	
	
}
	
}
