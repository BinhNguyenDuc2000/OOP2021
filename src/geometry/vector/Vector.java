package geometry.vector;

import geometry.point.Point;

public class Vector {
	private double x=0;
	private double y=0;
	private double z=0;
	
	//Constructors
	public Vector() {
	}
	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Vector(Point a,Point b) {
		//To do
		this.x = a.getX()-b.getX();
		this.y = a.getY()-b.getY();
		this.z = a.getZ()-b.getZ();
	}
	
	
	//Getter and Setter
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public double getLength() {
		return Math.sqrt(x*x+y*y+z*z);
	}
	
	//Functions with a vector
	public boolean isZero() {
		if (x==0 && y==0 && z==0) {
			return true;
		}
		return false;
	}
	public boolean isParallel(Vector newVector) {
		if (this.getX()==newVector.getX()&&this.getY()==newVector.getY()&&this.getZ()==newVector.getZ())
			return true;
		return false;
	}
	
}
