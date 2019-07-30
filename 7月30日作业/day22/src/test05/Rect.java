package test05;

public class Rect {

	double width;
	double height;
	
	public Rect() {
		width=10;
		height=10;
	}
	
	public Rect(int with,int height) {
		this.width=with;
		this.height=height;
	}
	
	public double area() {
		return width*height;
	}
	
	public double perimeteter() {
		return width*2+height*2;
	}
	
}
