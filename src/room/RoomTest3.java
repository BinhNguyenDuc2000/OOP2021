package room;

import geometry.point.Point;
import obstacle.Obstacle;

public class RoomTest3 {

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
		Point point1 = new Point(0.75,0.25,0);
		Point point2 = new Point(1.25,0.25,0);
		Point point3 = new Point(1.25,0.75,0);
		Point point4 = new Point(0.75,0.75,0);
		Point point5 = new Point(0.75,0.25,0.3);
		Point point6 = new Point(1.25,0.25,0.3);
		Point point7 = new Point(1.25,0.75,0.3);
		Point point8 = new Point(0.75,0.75,0.3);
		Obstacle newObstacle = new Obstacle(point1,point2,point3,point4,point5,point6,point7,point8);
		return newObstacle;
	}
	
	public static void main(String[] args) {
		Room newRoom = demoRoom();
		newRoom.addObstacle(demoObstacle());
		newRoom.addCamera(new Point(1,0.5,1), 90, (2*Math.atan(0.5))/0.01745);
		System.out.println(newRoom.getVisiblePercentage());
	}

}
