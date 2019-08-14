package Test;
/*
 *5、字符串"#hh123@",判断是否以"#"开始，"@"结尾。如是，则将该字符串的"hh123"截取出来。
然后在判断此子字符串的长度是是否为10，如果不够，则在后面添加0自动补充到10个长度。

 */
public class Test5 {

	public static void main(String[] args) {
		//创建字符串
		String str="#hh123@";
		//判断是否为#开头，@结尾
		boolean b1=str.startsWith("#");
		boolean b2=str.endsWith("@");
		StringBuilder sb=new StringBuilder(str);
		//打印
		if(b1&&b2) {
			
			sb.delete(str.length()-1, str.length()).delete(0, 1);
			str=sb.toString();
			System.out.println(str);
		}
		//不足10补足
		if(str.length()<10) {
			for(int i=0;i<(10-str.length());i++){
				sb.append("0") ;
			}
		}
		
		System.out.println(sb.toString());
		
	}
}
