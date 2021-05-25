package geometry.point;

public class Point {
	private double x=0;
	private double y=0;
	private double z=0;
	
	//Constructors
	public Point() {
		
	}
	public Point(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//Getters and setters
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
	
	//Functions with a point
	public double getDistance(Point newPoint) {
		// To do
		double newX = Math.pow(this.getX()-newPoint.getX(),2);
		double newY = Math.pow(this.getY()-newPoint.getY(),2);
		double newZ = Math.pow(this.getZ()-newPoint.getZ(),2);
		return Math.sqrt(newX+newY+newZ);
	}
	
}
