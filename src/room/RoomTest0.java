package room;

import geometry.point.Point;
import obstacle.Obstacle;

public class RoomTest0 {
	
	public static Room demoRoom() {
		Point a = new Point(0,0,0);
		Point b = new Point(2,0,0);
		Point c = new Point(2,1,0);
		Point d = new Point(0,1,0);
		Point e = new Point(0,0,1);
		Point f = new Point(2,0,1);
		Point g = new Point(2,1,1);
		Point h = new Point(0,1,1);
		return new Room(a, b, c, d, e, f, g, h);
	}
	
	public static Obstacle demoObstacle() {
		Point point1 = new Point(0.5,0.25,0);
		Point point2 = new Point(1.5,0.25,0);
		Point point3 = new Point(1.5,0.75,0);
		Point point4 = new Point(0.5,0.75,0);
		Point point5 = new Point(0.5,0.25,1);
		Point point6 = new Point(1.5,0.25,1);
		Point point7 = new Point(1.5,0.75,1);
		Point point8 = new Point(0.5,0.75,1);
		Obstacle newObstacle = new Obstacle(point1,point2,point3,point4,point5,point6,point7,point8);
		return newObstacle;
	}
	
	
	
	public static void main(String[] args) {
		Room newRoom = demoRoom();
		
		//Khoi tao phong
		Point cameraPosition1 = new Point(0,0.5,0.5);
		double vfov1 = 90;
		double hfov1 = 90;
		newRoom.addCamera(cameraPosition1,vfov1,hfov1);
		
		Point cameraPosition2 = new Point(1,1,0.5);
		double vfov2 = 90;
		double hfov2 = 90;
		newRoom.addCamera(cameraPosition2,vfov2,hfov2);
		
		//newRoom.addObstacle(demoObstacle());
		
		//Thu voi cac diem
		Point point5 = new Point(0.1,0.5,0.6);
		Point point6 = new Point(0.7,0.5,0.5);
		Point point7 = new Point(0.95,0,0.5);
		Point point8 = new Point(1,0,0.5);
		Point point9 = new Point(-1,0,1);
		Point point10 = new Point(1,1,-1);
		
		System.out.println(newRoom.isVisible(point5));
		System.out.println(newRoom.isVisible(point6));
		System.out.println(newRoom.isVisible(point7));
		System.out.println(newRoom.isVisible(point8));
		System.out.println(newRoom.isVisible(point9));
		System.out.println(newRoom.isVisible(point10));
		System.out.println(newRoom.getVisiblePercentage());
		
	}

}
