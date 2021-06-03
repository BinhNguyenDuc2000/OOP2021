package pixel;

import geometry.point.Point;
import math3d.Math3D;

public class Pixel extends Point{
	public static double pixelSize=0.1;

	private boolean isVisible;
	
	//Constructor
	public Pixel(double x, double y, double z) {
		super(x, y, z);
		// TODO Auto-generated constructor stub
	}
	public Pixel(Point point1,Point point2,Point point3,Point point4) {
		Point newPoint = Math3D.getCenterPoint(point1, point2, point3, point4);
		this.setX(newPoint.getX());
		this.setY(newPoint.getY());
		this.setZ(newPoint.getZ());
	}
	
	//Getters and setters
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	

}
