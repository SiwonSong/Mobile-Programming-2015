package kr.ac.kookmin.shape;

public class Rectangle extends Shape{
	//Implement here
	int w;
	int h;
	
	
	public Rectangle(Point center, int w, int h) {
		super.center = center;
		this.w = w;
		this.h = h;
		
	}
	
	public int getWidth() {
		return w;
	}
	
	public int getHeight() {
		return h;
	}
	
	public Rectangle getBounds() {
		return this;
	}
	
	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	@Override
	public String toString() {
		return "Rectangle";
	}

}
