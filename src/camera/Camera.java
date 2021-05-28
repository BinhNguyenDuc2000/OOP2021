package camera;

import geometry.line.Line;
import geometry.point.Point;
import geometry.surface.Surface;

public class Camera {
	private Point cameraPosition;
	private Surface bottomSurface;
	public static final double height=999;
	
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
		return bottomSurface.hasIntersection(newLine);
	}
	

}
