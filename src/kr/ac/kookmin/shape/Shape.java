package kr.ac.kookmin.shape;

public abstract class Shape {
	
	protected Point center;
	
	public Point getCenter() {
		
		return center;
		
	}
	
	public Rectangle getBounds() {
		return (Rectangle) this;
		
		
	}
	
	public abstract void draw(Graphics g);

}
