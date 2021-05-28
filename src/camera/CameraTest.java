package camera;

import geometry.point.Point;
import geometry.surface.Surface;

public class CameraTest {
	
	public static void main(String[] args) {
		Point point1 = new Point(0,0,0);
		Point point2 = new Point(1,0,0);
		Point point3 = new Point(1,1,0);
		Point point4 = new Point(0,1,0);
		
		Point point5 = new Point(3,2,1);
		Point point6 = new Point(0.5,0.5,0);
		
		Surface newSurface = new Surface(point1,point2,point3,point4);
		
		Camera newCamera = new Camera();
		newCamera.setBottomSurface(newSurface);
		newCamera.setCameraPosition(new Point(0.5,0.5,3));
		System.out.println(newCamera.canBeSeen(new Point(1,1,1)));
	}

}
