package room;

import camera.Camera;
import geometry.point.Point;
import geometry.surface.Surface;
import obstacle.Obstacle;

public class RoomTest {
	
	public static Camera demoCamera() {
		Point point0 = new Point(0.5,0.5,3);
		Point point1 = new Point(0,0,0);
		Point point2 = new Point(1,0,0);
		Point point3 = new Point(1,1,0);
		Point point4 = new Point(0,1,0);
		Surface newSurface = new Surface(point1,point2,point3,point4);
		
		Camera newCamera = new Camera();
		newCamera.setBottomSurface(newSurface);
		newCamera.setCameraPosition(point0);
		return newCamera;
	}
	
	public static Obstacle demoObstacle() {
		Point point1 = new Point(0.25,0.25,0);
		Point point2 = new Point(0.75,0.25,0);
		Point point3 = new Point(0.75,0.75,0);
		Point point4 = new Point(0.25,0.75,0);
		Point point5 = new Point(0.25,0.25,1);
		Point point6 = new Point(0.75,0.25,1);
		Point point7 = new Point(0.75,0.75,1);
		Point point8 = new Point(0.25,0.75,1);
		Obstacle newObstacle = new Obstacle(point1,point2,point3,point4,point5,point6,point7,point8);
		return newObstacle;
	}
	
	public static void main(String[] args) {
		Room newRoom = new Room();
		
		//Khoi tao phong
		newRoom.addCamera(demoCamera());
		newRoom.addObstacle(demoObstacle());
		
		//Thu voi cac diem
		Point point5 = new Point(1,1,0);
		Point point6 = new Point(0.5,0.5,1.1);
		Point point7 = new Point(0.75,0.75,0.5);
		Point point8 = new Point(0.9,0.9,1);
		
		System.out.println(newRoom.isVisible(point5));
		System.out.println(newRoom.isVisible(point6));
		System.out.println(newRoom.isVisible(point7));
		System.out.println(newRoom.isVisible(point8));
		
	}

}
