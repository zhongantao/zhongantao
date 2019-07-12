package Afternoon;



/*
 * 在格子游戏的基础上，添加”口”,”L”,”T”字图像(每个图形都是4个格子组成)。
图像具有功能：
1、向左移一个单位。
2、向右移 一个单位。
3、向下移一个单位
4、向下移n个单位。
在墙纸上能打印图像，如：
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











