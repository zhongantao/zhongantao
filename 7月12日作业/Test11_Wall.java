package Afternoon;

public class Test11_Wall {
		
	int x;
    int y;
    int xLength;
    int yLength;
    public  Test11_Wall (int x1,int y1,int xLength1,
		      int yLength1 ){
		    	  x=x1;
		    	  y=y1;
		    	  xLength=xLength1;
		    	  yLength=yLength1;
		      }

		      public void printL(Test11_L A) {
		      
		    	 Test11_LCoordinate[] a= A.Ls;
		    	 for(int i=0;i<y+yLength;i++) {
		    		 
		    		 for(int j=0;j<x+xLength;j++) {
		    			 if(j<x) {
		    				 System.out.print(" ");
		    			 }
		    			 else if(j>=x&&i>=y) {
		    			
		    				 
		    				 if(j==a[0].x&&i==a[0].y||
		    						 j==a[1].x&&i==a[1].y||
		    						 j==a[2].x&&i==a[2].y||
		    						 j==a[3].x&&i==a[3].y) {
		    				 System.out.print("#");
		    			 }else if(j>=x) {
		    				 System.out.print("-");
		    			 }
		    			 }
		    		 }
		    		 System.out.println();
		    	 }
		     
		      }
		      
		      public void printT(Test11_T A) {
			      //获取格子数组
			    	 Test11_TCoordinate[] a= A.Ts;
			    	 for(int i=0;i<y+yLength;i++) {
			    		 
			    		 for(int j=0;j<x+xLength;j++) {
			    			 if(j<x) {
			    				 System.out.print(" ");
			    			 }
			    			 else if(j>=x&&i>=y) {
			    			
			    				 
			    				 if(j==a[0].x&&i==a[0].y||
			    						 j==a[1].x&&i==a[1].y||
			    						 j==a[2].x&&i==a[2].y||
			    						 j==a[3].x&&i==a[3].y) {
			    				 System.out.print("#");
			    			 }else if(j>=x) {
			    				 System.out.print("-");
			    			 }
			    			 }
			    		 }
			    		 System.out.println();
			    	 }
			     
			      }
			      
		      public static void main(String[] args) {
				Test11_Wall wall=new Test11_Wall(0,0,20,20);
				Test11_L L=new Test11_L(2,2);
				L.left();
				wall.printL(L);
				
				Test11_T T=new Test11_T(3,5);
				T.left();
				wall.printT(T);
			}
		      
		    	    	
	}

	


