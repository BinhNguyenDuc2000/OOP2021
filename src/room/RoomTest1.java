package room;

import camera.Camera;
import geometry.point.Point;
import geometry.surface.Surface;

public class RoomTest1 {

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
	
	public static Camera demoCamera() {
		Point point0 = new Point(1, 0.5, 1);
		Point point1 = new Point(0, 0, 0);
		Point point2 = new Point(2, 0, 0);
		Point point3 = new Point(2, 1, 0);
		Point point4 = new Point(0, 1, 0);
		Surface bottomSurface = new Surface(point1, point2, point3, point4);
		return new Camera(point0,bottomSurface);
	}
	
	public static void main(String[] args) {
		Room newRoom = demoRoom();
		newRoom.addCamera(demoCamera());
		System.out.println(newRoom.getVisiblePercentage());
		
	}

}
