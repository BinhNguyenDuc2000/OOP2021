package camera;

import geometry.line.Line;
import geometry.plane.Plane;
import geometry.point.Point;
import geometry.surface.Surface;
import geometry.vector.Vector2D;

public class Camera {
	private Point cameraPosition;
	private Surface bottomSurface;
	public static final double focalLength=999;
	
	//Constructor
	public Camera() {
		
	}
	
	public Camera(Point cameraPosition, Surface bottomSurface) {
		super();
		this.cameraPosition = cameraPosition;
		this.bottomSurface = bottomSurface;
	}
	
	
	//Getters and setters
	public Point getCameraPosition() {
		return cameraPosition;
	}
	public void setCameraPosition(Point cameraPosition) {
		this.cameraPosition = cameraPosition;
	}
	public Surface getBottomSurface() {
		return bottomSurface;
	}
	public void setBottomSurface(Surface bottomSurface) {
		this.bottomSurface = bottomSurface;
	}
	
	//Functions with point
	public boolean canBeSeen(Point newPoint) {
		Line newLine = new Line(cameraPosition,newPoint);
		if (bottomSurface==null)
			return false;
		if (bottomSurface.getPosition(newLine)!=Plane.hasIntersection)
			return false;
		Point intersection = bottomSurface.getIntersection(newLine);
		Vector2D newVector = new Vector2D(cameraPosition,intersection);
		if ((newLine.getVector().getX()*newVector.getX())<0)
			return false;
		if ((newLine.getVector().getY()*newVector.getY())<0)
			return false;
		if ((newLine.getVector().getZ()*newVector.getZ())<0)
			return false;
		if (!bottomSurface.hasPoint(intersection))
			return false;
		return true;
				
	}
	

}
