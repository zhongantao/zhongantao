package test05;

public class PlainRect extends Rect{

	double StaticX;
	double StaticY;
	
	
	public PlainRect(double StaticX,double StaticY,double height,double width) {
		this.StaticX=StaticX;
		this.StaticY=StaticY;
		super.width=width;
		super.height=height;
	}
	
	public PlainRect() {
		this(0,0,0,0);
	}
	
	public boolean isInside(double x,double y) {
		if(x>=StaticX&&x<=StaticX+width&&y<=StaticY&&y>=(StaticY-height)) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
}
