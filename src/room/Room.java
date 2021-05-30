package room;

import java.util.ArrayList;
import java.util.Iterator;


import camera.Camera;
import geometry.cuboid.RectangularCuboid;
import geometry.line.LineSegment;
import geometry.point.Point;
import geometry.surface.Surface;
import obstacle.Obstacle;

public class Room extends RectangularCuboid {
	public static final int accuracy = 100000000;
	private ArrayList<Camera> cameraList = new ArrayList<Camera>();
	private ArrayList<Obstacle> obstacleList = new ArrayList<Obstacle>();
	
	//Constructor
	public Room(Point a, Point b, Point c, Point d, Point e, Point f, Point g, Point h) {
		super(a, b, c, d, e, f, g, h);
	}
	
	
	//Setting up the room
	public void addCamera(Camera newCamera) {
		cameraList.add(newCamera);
	}
	public void addCamera(Point cameraPosition,double vfov,double hfov) {
		Camera newCamera = new Camera();
		newCamera.setCameraPosition(cameraPosition);
		double halfLength = Math.tan(vfov*0.01745/2)*Camera.focalLength;
		double halfWidth = Math.tan(hfov*0.01745/2)*Camera.focalLength;
		if (getABCD().hasPoint(cameraPosition)) {
			Point bottomCenterPoint = new Point(cameraPosition.getX(),cameraPosition.getY(),cameraPosition.getZ()+Camera.focalLength);
			Point point1 = new Point(bottomCenterPoint.getX()-halfLength,bottomCenterPoint.getY()-halfWidth,bottomCenterPoint.getZ());
			Point point2 = new Point(bottomCenterPoint.getX()+halfLength,bottomCenterPoint.getY()-halfWidth,bottomCenterPoint.getZ());
			Point point3 = new Point(bottomCenterPoint.getX()+halfLength,bottomCenterPoint.getY()+halfWidth,bottomCenterPoint.getZ());
			Point point4 = new Point(bottomCenterPoint.getX()-halfLength,bottomCenterPoint.getY()+halfWidth,bottomCenterPoint.getZ());
			newCamera.setBottomSurface(new Surface(point1, point2, point3, point4));
		}
		if (getEFGH().hasPoint(cameraPosition)) {
			Point bottomCenterPoint = new Point(cameraPosition.getX(),cameraPosition.getY(),cameraPosition.getZ()-Camera.focalLength);
			Point point1 = new Point(bottomCenterPoint.getX()-halfLength,bottomCenterPoint.getY()-halfWidth,bottomCenterPoint.getZ());
			Point point2 = new Point(bottomCenterPoint.getX()+halfLength,bottomCenterPoint.getY()-halfWidth,bottomCenterPoint.getZ());
			Point point3 = new Point(bottomCenterPoint.getX()+halfLength,bottomCenterPoint.getY()+halfWidth,bottomCenterPoint.getZ());
			Point point4 = new Point(bottomCenterPoint.getX()-halfLength,bottomCenterPoint.getY()+halfWidth,bottomCenterPoint.getZ());
			newCamera.setBottomSurface(new Surface(point1, point2, point3, point4));
		}
		if (getABFE().hasPoint(cameraPosition)) {
			Point bottomCenterPoint = new Point(cameraPosition.getX(),cameraPosition.getY()+Camera.focalLength,cameraPosition.getZ());
			Point point1 = new Point(bottomCenterPoint.getX()-halfLength,bottomCenterPoint.getY(),bottomCenterPoint.getZ()-halfWidth);
			Point point2 = new Point(bottomCenterPoint.getX()+halfLength,bottomCenterPoint.getY(),bottomCenterPoint.getZ()-halfWidth);
			Point point3 = new Point(bottomCenterPoint.getX()+halfLength,bottomCenterPoint.getY(),bottomCenterPoint.getZ()+halfWidth);
			Point point4 = new Point(bottomCenterPoint.getX()-halfLength,bottomCenterPoint.getY(),bottomCenterPoint.getZ()+halfWidth);
			newCamera.setBottomSurface(new Surface(point1, point2, point3, point4));
		}
		if (getCDHG().hasPoint(cameraPosition)) {
			Point bottomCenterPoint = new Point(cameraPosition.getX(),cameraPosition.getY()-Camera.focalLength,cameraPosition.getZ());
			Point point1 = new Point(bottomCenterPoint.getX()-halfLength,bottomCenterPoint.getY(),bottomCenterPoint.getZ()-halfWidth);
			Point point2 = new Point(bottomCenterPoint.getX()+halfLength,bottomCenterPoint.getY(),bottomCenterPoint.getZ()-halfWidth);
			Point point3 = new Point(bottomCenterPoint.getX()+halfLength,bottomCenterPoint.getY(),bottomCenterPoint.getZ()+halfWidth);
			Point point4 = new Point(bottomCenterPoint.getX()-halfLength,bottomCenterPoint.getY(),bottomCenterPoint.getZ()+halfWidth);
			newCamera.setBottomSurface(new Surface(point1, point2, point3, point4));
		}
		if (getBCGF().hasPoint(cameraPosition)) {
			Point bottomCenterPoint = new Point(cameraPosition.getX()-Camera.focalLength,cameraPosition.getY(),cameraPosition.getZ());
			Point point1 = new Point(bottomCenterPoint.getX(),bottomCenterPoint.getY()-halfLength,bottomCenterPoint.getZ()-halfWidth);
			Point point2 = new Point(bottomCenterPoint.getX(),bottomCenterPoint.getY()+halfLength,bottomCenterPoint.getZ()-halfWidth);
			Point point3 = new Point(bottomCenterPoint.getX(),bottomCenterPoint.getY()+halfLength,bottomCenterPoint.getZ()+halfWidth);
			Point point4 = new Point(bottomCenterPoint.getX(),bottomCenterPoint.getY()-halfLength,bottomCenterPoint.getZ()+halfWidth);
			newCamera.setBottomSurface(new Surface(point1, point2, point3, point4));
		}
		if (getDAEH().hasPoint(cameraPosition)) {
			Point bottomCenterPoint = new Point(cameraPosition.getX()+Camera.focalLength,cameraPosition.getY(),cameraPosition.getZ());
			Point point1 = new Point(bottomCenterPoint.getX(),bottomCenterPoint.getY()-halfLength,bottomCenterPoint.getZ()-halfWidth);
			Point point2 = new Point(bottomCenterPoint.getX(),bottomCenterPoint.getY()+halfLength,bottomCenterPoint.getZ()-halfWidth);
			Point point3 = new Point(bottomCenterPoint.getX(),bottomCenterPoint.getY()+halfLength,bottomCenterPoint.getZ()+halfWidth);
			Point point4 = new Point(bottomCenterPoint.getX(),bottomCenterPoint.getY()-halfLength,bottomCenterPoint.getZ()+halfWidth);
			newCamera.setBottomSurface(new Surface(point1, point2, point3, point4));
		}
		
		cameraList.add(newCamera);
	}
	
	
	public void addObstacle(Obstacle newObstacle) {
		obstacleList.add(newObstacle);
	}
	
	//Functions with point
	public boolean isVisible(Point newPoint) {
		Iterator<Camera> cameraIterator = cameraList.iterator();
		while(cameraIterator.hasNext()) {
			Camera newCamera = cameraIterator.next();
			if (newCamera.canBeSeen(newPoint)) {
				LineSegment newLineSegment = new LineSegment(newCamera.getCameraPosition(),newPoint);
				if(!isBlocked(newLineSegment))
					return true;
			}
		}
		return false;
	}
	
	public boolean isBlocked(LineSegment newLineSegment) {
		if (obstacleList.size()==0){
			return false;
		}
		Iterator<Obstacle> obstacleIterator = obstacleList.iterator();
		while(obstacleIterator.hasNext()) {
			Obstacle newObstacle = obstacleIterator.next();
			ArrayList<Point> intersetionList = newObstacle.getIntersectionList(newLineSegment);
			if (intersetionList.size()>0) {
				Iterator<Point> intersectionIterator = intersetionList.iterator();
				while(intersectionIterator.hasNext()) {
					if (newLineSegment.hasPoint(intersectionIterator.next())) {
						return true;
					}
				}
			}
			else
				return false;
		}
		
		return false;
	}
	
	
	//Utility functions
	public Point getRandomPoint() {
		//Ham tim mot diem ngau nhien trong phong
		double x = Math.random()*(getG().getX()-getA().getX())+getA().getX();
		double y = Math.random()*(getG().getY()-getA().getY())+getA().getY();
		double z = Math.random()*(getG().getZ()-getA().getZ())+getA().getZ();
		Point newPoint = new Point(x,y,z);
		return newPoint;
	}
	
	public double getVisiblePercentage() {
		int numberOfVisible = 0;
		for (int i=0;i<accuracy;i++) {
			if (this.isVisible(getRandomPoint()))
				numberOfVisible++;
		}
		double visiblePercentage=100*(double)numberOfVisible/(double)accuracy;
		return visiblePercentage;
	}
}
