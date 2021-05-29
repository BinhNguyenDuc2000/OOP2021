package room;

import java.util.ArrayList;
import java.util.Iterator;

import camera.Camera;
import geometry.cuboid.RectangularCuboid;
import geometry.line.LineSegment;
import geometry.point.Point;
import obstacle.Obstacle;

public class Room extends RectangularCuboid {
	private ArrayList<Camera> cameraList = new ArrayList<Camera>();
	private ArrayList<Obstacle> obstacleList = new ArrayList<Obstacle>();
	
	//Setting up the room
	public void addCamera(Camera newCamera) {
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
			if (!newCamera.canBeSeen(newPoint))
				return false;
			LineSegment newLineSegment = new LineSegment(newCamera.getCameraPosition(),newPoint);
			Iterator<Obstacle> obstacleIterator = obstacleList.iterator();
			while(obstacleIterator.hasNext()) {
				Obstacle newObstacle = obstacleIterator.next();
				Iterator<Point> intersectionIterator = newObstacle.getIntersection(newLineSegment).iterator();
				while(intersectionIterator.hasNext()) {
					if (newLineSegment.hasPoint(intersectionIterator.next()))
						return false;
				}
			}
		}
		return true;
	}
}
