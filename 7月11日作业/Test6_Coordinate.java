package Afternoon;



/*
 * �ڸ�����Ϸ�Ļ����ϣ���ӡ��ڡ�,��L��,��T����ͼ��(ÿ��ͼ�ζ���4���������)��
ͼ����й��ܣ�
1��������һ����λ��
2�������� һ����λ��
3��������һ����λ
4��������n����λ��
��ǽֽ���ܴ�ӡͼ���磺
- - - - - - - - - - - - - - - - - - 
- - - - # # - - - - - - - - - - -
- - - - # # - - - - - - - - - - -
- - - - - - - - - - - - - - - - - -


 */
public class Test6_Coordinate {
      int x;
      int y;
      int xLength;
      int yLength;
	

      public void printBlock(Test6_ImageBlock block) {
    	 
    	    	 for(int i=0;i<y+yLength;i++) {
    	    		 
    	    		 for(int j=0;j<x+xLength;j++) {
    	    			 if(j<x) {
    	    				 System.out.print(" ");
    	    			 }
    	    			 else if(j>=x&&i>=y) {
    	    			
    	    				 
    	    				 if(j==block.x&&i==block.y) {
    	    				 System.out.print("#");
    	    			 }else if(j==(block.x+1)&&i==block.y) {
    	    				 System.out.print("#");
    	    			 }else if(j==block.x&&i==(block.y+1)) {
    	    				 System.out.print("#");
    	    			 }else if(j==(block.x+1)&&i==(block.y+1)) {
    	    				 System.out.print("#");
    	    			 }
    	    				 else {
    	    				 System.out.print("-");
    	    			 }
    	    			 }
    	    		 }
    	    		 System.out.println();
    	    	 }
    	     }
      
      public void printL(Test6_ImageBlock L) {
     	 
	    	 for(int i=0;i<y+yLength;i++) {
	    		 
	    		 for(int j=0;j<x+xLength;j++) {
	    			 if(j<x) {
	    				 System.out.print(" ");
	    			 }
	    			 else if(j>=x&&i>=y) {
	    			
	    				 
	    				 if(j==L.x&&i==L.y) {
	    				 System.out.print("#");
	    			 }else if(j==L.x&&i==(L.y+1)) {
	    				 System.out.print("#");
	    			 }else if(j==(L.x+1)&&i==(L.y+1)) {
	    				 System.out.print("#");
	    			
	    				 }
	    				 else {
	    				 System.out.print("-");
	    			 }
	    			 }
	    		 }
	    		 System.out.println();
	    	 }
	     }
      
      public void printT(Test6_ImageBlock T) {
      	 
	    	 for(int i=0;i<y+yLength;i++) {
	    		 
	    		 for(int j=0;j<x+xLength;j++) {
	    			 if(j<x) {
	    				 System.out.print(" ");
	    			 }
	    			 else if(j>=x&&i>=y) {
	    			
	    				 
	    				 if(j==T.x&&i==T.y) {
	    				 System.out.print("#");
	    			 }else if(j==(T.x+1)&&i==(T.y)) {
	    				 System.out.print("#");
	    			 }else if(j==(T.x+2)&&i==(T.y)) {
	    				 System.out.print("#");
	    			 }else if(j==(T.x+1)&&i==(T.y+1)) {
	    				 System.out.print("#");
	    		     
		    	     }else {
	    				 System.out.print("-");
	    			 }
	    			 }
	    		 }
	    		 System.out.println();
	    	 }
	     }
      
}











