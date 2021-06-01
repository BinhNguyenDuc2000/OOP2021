package room;

import camera.Camera;
import geometry.point.Point;
import geometry.surface.Surface;
import obstacle.Obstacle;

public class RoomTest2 {
	
	public static Room demoRoom() {
		Point a = new Point(0,0,0);
		Point b = new Point(3,0,0);
		Point c = new Point(3,3,0);
		Point d = new Point(0,3,0);
		Point e = new Point(0,0,2);
		Point f = new Point(3,0,2);
		Point g = new Point(3,3,2);
		Point h = new Point(0,3,2);
		return new Room(a, b, c, d, e, f, g, h);
	}
	
	public static Obstacle demoObstacle() {
		Point point1 = new Point(1,1,0);
		Point point2 = new Point(2,1,0);
		Point point3 = new Point(2,2,0);
		Point point4 = new Point(1,2,0);
		Point point5 = new Point(1,1,0.3);
		Point point6 = new Point(2,1,0.3);
		Point point7 = new Point(2,2,0.3);
		Point point8 = new Point(1,2,0.3);
		Obstacle newObstacle = new Obstacle(point1,point2,point3,point4,point5,point6,point7,point8);
		return newObstacle;
	}
	
	public static Obstacle demObstacle2() {
		Point point1 = new Point(0,2.9,0);
		Point point2 = new Point(1,2.9,0);
		Point point3 = new Point(1,3,0);
		Point point4 = new Point(0,3,0);
		Point point5 = new Point(0,2.9,1);
		Point point6 = new Point(1,2.9,1);
		Point point7 = new Point(1,3,1);
		Point point8 = new Point(0,3,1);
		Obstacle newObstacle = new Obstacle(point1,point2,point3,point4,point5,point6,point7,point8);
		return newObstacle;
	}
	
	public static Obstacle demObstacle3() {
		Point point1 = new Point(0,0,0);
		Point point2 = new Point(1,0,0);
		Point point3 = new Point(1,0.1,0);
		Point point4 = new Point(0,0.1,0);
		Point point5 = new Point(0,0,1);
		Point point6 = new Point(1,0,1);
		Point point7 = new Point(1,0.1,1);
		Point point8 = new Point(0,0.1,1);
		Obstacle newObstacle = new Obstacle(point1,point2,point3,point4,point5,point6,point7,point8);
		return newObstacle;
	}
	
	public static Obstacle demObstacle4() {
		Point point1 = new Point(2.9,0,0);
		Point point2 = new Point(3,0,0);
		Point point3 = new Point(3,1,0);
		Point point4 = new Point(2.9,1,0);
		Point point5 = new Point(2.9,0,1);
		Point point6 = new Point(3,0,1);
		Point point7 = new Point(3,1,1);
		Point point8 = new Point(2.9,1,1);
		Obstacle newObstacle = new Obstacle(point1,point2,point3,point4,point5,point6,point7,point8);
		return newObstacle;
	}
	
	public static Obstacle demObstacle5() {
		Point point1 = new Point(0,0,0);
		Point point2 = new Point(0.1,0,0);
		Point point3 = new Point(0.1,1,0);
		Point point4 = new Point(0,1,0);
		Point point5 = new Point(0,0,1);
		Point point6 = new Point(0.1,0,1);
		Point point7 = new Point(0.1,1,1);
		Point point8 = new Point(0,1,1);
		Obstacle newObstacle = new Obstacle(point1,point2,point3,point4,point5,point6,point7,point8);
		return newObstacle;
	}
	
	
	
	
	
	public static Camera demoCamera() {
		Point point0 = new Point(1.5, 1.5, 2);
		Point point1 = new Point(0, 0, 1);
		Point point2 = new Point(3, 0, 1);
		Point point3 = new Point(3, 3, 1);
		Point point4 = new Point(0, 3, 1);
		Surface bottomSurface = new Surface(point1, point2, point3, point4);
		return new Camera(point0,bottomSurface);
	}
	
	public static void main(String[] args) {
		Room newRoom = demoRoom();
		newRoom.addCamera(demoCamera());
		newRoom.addObstacle(demoObstacle());
		newRoom.addObstacle(demObstacle2());
		newRoom.addObstacle(demObstacle3());
		newRoom.addObstacle(demObstacle4());
		newRoom.addObstacle(demObstacle5());
		System.out.println("----------------");
		System.out.println("ABCD");
		newRoom.displayABCD();
		System.out.println("----------------");
		System.out.println("EFGH");
		newRoom.displayEFGH();
		System.out.println("----------------");
		System.out.println("ABEF");
		newRoom.displayABEF();
		System.out.println("----------------");
		System.out.println("CDHG");
		newRoom.displayCDHG();
		System.out.println("----------------");
		System.out.println("BCGF");
		newRoom.displayBCFG();
		System.out.println("----------------");
		System.out.println("DAEH");
		newRoom.displayDAEH();
		
		
	}
	
	

}
