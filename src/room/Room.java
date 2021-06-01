package room;

import java.util.ArrayList;
import java.util.Iterator;

import camera.Camera;
import geometry.cuboid.RectangularCuboid;
import geometry.line.LineSegment;
import geometry.point.Point;
import geometry.surface.Surface;
import obstacle.Obstacle;
import pixel.Pixel;
import pixel.PixelMap;

public class Room extends RectangularCuboid {
	public static final int accuracy = 100000000;
	private ArrayList<Camera> cameraList = new ArrayList<Camera>();
	private ArrayList<Obstacle> obstacleList = new ArrayList<Obstacle>();
	private PixelMap mapABCD=null;
	private PixelMap mapABEF=null;
	private PixelMap mapBCGF=null;
	private PixelMap mapCDHG=null;
	private PixelMap mapDAEH=null;
	private PixelMap mapEFGH=null;
	
	
	//Getters and setters
	
	public ArrayList<Camera> getCameraList() {
		return cameraList;
	}

	public void setCameraList(ArrayList<Camera> cameraList) {
		this.cameraList = cameraList;
	}

	public ArrayList<Obstacle> getObstacleList() {
		return obstacleList;
	}

	public void setObstacleList(ArrayList<Obstacle> obstacleList) {
		this.obstacleList = obstacleList;
	}

	// Constructor
	public Room(Point a, Point b, Point c, Point d, Point e, Point f, Point g, Point h) {
		super(a, b, c, d, e, f, g, h);
	}

	

	// Setting up the room
	public void addCamera(Camera newCamera) {
		cameraList.add(newCamera);
	}

	public void addCamera(Point cameraPosition, double vfov, double hfov) {
		Camera newCamera = new Camera();
		newCamera.setCameraPosition(cameraPosition);
		double halfLength = Math.tan(vfov * 0.01745 / 2) * Camera.focalLength;
		double halfWidth = Math.tan(hfov * 0.01745 / 2) * Camera.focalLength;
		if (getABCD().hasPoint(cameraPosition)) {
			Point bottomCenterPoint = new Point(cameraPosition.getX(), cameraPosition.getY(),
					cameraPosition.getZ() + Camera.focalLength);
			Point point1 = new Point(bottomCenterPoint.getX() - halfLength, bottomCenterPoint.getY() - halfWidth,
					bottomCenterPoint.getZ());
			Point point2 = new Point(bottomCenterPoint.getX() + halfLength, bottomCenterPoint.getY() - halfWidth,
					bottomCenterPoint.getZ());
			Point point3 = new Point(bottomCenterPoint.getX() + halfLength, bottomCenterPoint.getY() + halfWidth,
					bottomCenterPoint.getZ());
			Point point4 = new Point(bottomCenterPoint.getX() - halfLength, bottomCenterPoint.getY() + halfWidth,
					bottomCenterPoint.getZ());
			newCamera.setBottomSurface(new Surface(point1, point2, point3, point4));
		}
		if (getEFGH().hasPoint(cameraPosition)) {
			Point bottomCenterPoint = new Point(cameraPosition.getX(), cameraPosition.getY(),
					cameraPosition.getZ() - Camera.focalLength);
			Point point1 = new Point(bottomCenterPoint.getX() - halfLength, bottomCenterPoint.getY() - halfWidth,
					bottomCenterPoint.getZ());
			Point point2 = new Point(bottomCenterPoint.getX() + halfLength, bottomCenterPoint.getY() - halfWidth,
					bottomCenterPoint.getZ());
			Point point3 = new Point(bottomCenterPoint.getX() + halfLength, bottomCenterPoint.getY() + halfWidth,
					bottomCenterPoint.getZ());
			Point point4 = new Point(bottomCenterPoint.getX() - halfLength, bottomCenterPoint.getY() + halfWidth,
					bottomCenterPoint.getZ());
			newCamera.setBottomSurface(new Surface(point1, point2, point3, point4));
		}
		if (getABFE().hasPoint(cameraPosition)) {
			Point bottomCenterPoint = new Point(cameraPosition.getX(), cameraPosition.getY() + Camera.focalLength,
					cameraPosition.getZ());
			Point point1 = new Point(bottomCenterPoint.getX() - halfLength, bottomCenterPoint.getY(),
					bottomCenterPoint.getZ() - halfWidth);
			Point point2 = new Point(bottomCenterPoint.getX() + halfLength, bottomCenterPoint.getY(),
					bottomCenterPoint.getZ() - halfWidth);
			Point point3 = new Point(bottomCenterPoint.getX() + halfLength, bottomCenterPoint.getY(),
					bottomCenterPoint.getZ() + halfWidth);
			Point point4 = new Point(bottomCenterPoint.getX() - halfLength, bottomCenterPoint.getY(),
					bottomCenterPoint.getZ() + halfWidth);
			newCamera.setBottomSurface(new Surface(point1, point2, point3, point4));
		}
		if (getCDHG().hasPoint(cameraPosition)) {
			Point bottomCenterPoint = new Point(cameraPosition.getX(), cameraPosition.getY() - Camera.focalLength,
					cameraPosition.getZ());
			Point point1 = new Point(bottomCenterPoint.getX() - halfLength, bottomCenterPoint.getY(),
					bottomCenterPoint.getZ() - halfWidth);
			Point point2 = new Point(bottomCenterPoint.getX() + halfLength, bottomCenterPoint.getY(),
					bottomCenterPoint.getZ() - halfWidth);
			Point point3 = new Point(bottomCenterPoint.getX() + halfLength, bottomCenterPoint.getY(),
					bottomCenterPoint.getZ() + halfWidth);
			Point point4 = new Point(bottomCenterPoint.getX() - halfLength, bottomCenterPoint.getY(),
					bottomCenterPoint.getZ() + halfWidth);
			newCamera.setBottomSurface(new Surface(point1, point2, point3, point4));
		}
		if (getBCGF().hasPoint(cameraPosition)) {
			Point bottomCenterPoint = new Point(cameraPosition.getX() - Camera.focalLength, cameraPosition.getY(),
					cameraPosition.getZ());
			Point point1 = new Point(bottomCenterPoint.getX(), bottomCenterPoint.getY() - halfLength,
					bottomCenterPoint.getZ() - halfWidth);
			Point point2 = new Point(bottomCenterPoint.getX(), bottomCenterPoint.getY() + halfLength,
					bottomCenterPoint.getZ() - halfWidth);
			Point point3 = new Point(bottomCenterPoint.getX(), bottomCenterPoint.getY() + halfLength,
					bottomCenterPoint.getZ() + halfWidth);
			Point point4 = new Point(bottomCenterPoint.getX(), bottomCenterPoint.getY() - halfLength,
					bottomCenterPoint.getZ() + halfWidth);
			newCamera.setBottomSurface(new Surface(point1, point2, point3, point4));
		}
		if (getDAEH().hasPoint(cameraPosition)) {
			Point bottomCenterPoint = new Point(cameraPosition.getX() + Camera.focalLength, cameraPosition.getY(),
					cameraPosition.getZ());
			Point point1 = new Point(bottomCenterPoint.getX(), bottomCenterPoint.getY() - halfLength,
					bottomCenterPoint.getZ() - halfWidth);
			Point point2 = new Point(bottomCenterPoint.getX(), bottomCenterPoint.getY() + halfLength,
					bottomCenterPoint.getZ() - halfWidth);
			Point point3 = new Point(bottomCenterPoint.getX(), bottomCenterPoint.getY() + halfLength,
					bottomCenterPoint.getZ() + halfWidth);
			Point point4 = new Point(bottomCenterPoint.getX(), bottomCenterPoint.getY() - halfLength,
					bottomCenterPoint.getZ() + halfWidth);
			newCamera.setBottomSurface(new Surface(point1, point2, point3, point4));
		}

		cameraList.add(newCamera);
	}

	public void addObstacle(Obstacle newObstacle) {
		obstacleList.add(newObstacle);
	}

	// Functions with point

	public boolean isVisible(Point newPoint) {
		if (!isInTheRoom(newPoint))
			return false;
		Iterator<Camera> cameraIterator = cameraList.iterator();
		while (cameraIterator.hasNext()) {
			Camera newCamera = cameraIterator.next();
			if (newCamera.canBeSeen(newPoint)) {
				LineSegment newLineSegment = new LineSegment(newCamera.getCameraPosition(), newPoint);
				if (!isBlocked(newLineSegment))
					return true;
			}
		}
		return false;
	}

	public boolean isInTheRoom(Point newPoint) {
		double x = newPoint.getX();
		if (x < getA().getX() || x > getG().getX())
			return false;

		double y = newPoint.getY();
		if (y < getA().getY() || y > getG().getY())
			return false;

		double z = newPoint.getZ();
		if (z < getA().getZ() || z > getG().getZ())
			return false;

		return true;
	}

	public boolean isBlocked(LineSegment newLineSegment) {
		if (obstacleList.size() == 0) {
			return false;
		}
		Iterator<Obstacle> obstacleIterator = obstacleList.iterator();
		while (obstacleIterator.hasNext()) {
			Obstacle newObstacle = obstacleIterator.next();
			ArrayList<Point> intersetionList = newObstacle.getIntersectionList(newLineSegment);
			if (intersetionList.size() > 0) {
				Iterator<Point> intersectionIterator = intersetionList.iterator();
				while (intersectionIterator.hasNext()) {
					if (newLineSegment.hasPoint(intersectionIterator.next())) {
						return true;
					}
				}
			}
		}

		return false;
	}

	// Utility functions
	public Point getRandomPoint() {
		// Ham tim mot diem ngau nhien trong phong
		double x = Math.random() * (getG().getX() - getA().getX()) + getA().getX();
		double y = Math.random() * (getG().getY() - getA().getY()) + getA().getY();
		double z = Math.random() * (getG().getZ() - getA().getZ()) + getA().getZ();
		Point newPoint = new Point(x, y, z);
		return newPoint;
	}

	public double getVisiblePercentage() {
		int numberOfVisible = 0;
		for (int i = 0; i < accuracy; i++) {
			if (this.isVisible(getRandomPoint()))
				numberOfVisible++;
		}
		double visiblePercentage = 100 * (double) numberOfVisible / (double) accuracy;
		return visiblePercentage;
	}

	// Function for each surface
	public PixelMap displayABCD() {
		if (mapABCD!=null)
			return mapABCD;
		ArrayList<Pixel> pixelList = new ArrayList<Pixel>();
		int row = (int) ((getC().getX() - getA().getX()) / Pixel.pixelSize);
		int column = (int) ((getC().getY() - getA().getY()) / Pixel.pixelSize);
		for (double i = 0; i < row; i++) {
			double baseX = getA().getX() + i * Pixel.pixelSize;
			double baseZ = getA().getZ();
			for (double j = 0; j < column; j++) {
				double baseY = getA().getY() + j * Pixel.pixelSize;
				Point point1 = new Point(baseX, baseY, baseZ);
				Point point2 = new Point(baseX + Pixel.pixelSize, baseY, baseZ);
				Point point3 = new Point(baseX + Pixel.pixelSize, baseY + Pixel.pixelSize, baseZ);
				Point point4 = new Point(baseX, baseY + Pixel.pixelSize, baseZ);
				Pixel newPixel = new Pixel(point1, point2, point3, point4);
				newPixel.setVisible(isVisible(newPixel));
				pixelList.add(newPixel);
				System.out.println(isVisible(newPixel));
			}
		}
		PixelMap newPixelMap = new PixelMap();
		newPixelMap.setColumn(column);
		newPixelMap.setRow(row);
		newPixelMap.setPixelList(pixelList);
		mapABCD=newPixelMap;
		return mapABCD;
	}

	public PixelMap displayEFGH() {
		if (mapEFGH!=null)
			return mapEFGH;
		ArrayList<Pixel> pixelList = new ArrayList<Pixel>();
		int row = (int) ((getG().getX() - getE().getX()) / Pixel.pixelSize);
		int column = (int) ((getG().getY() - getE().getY()) / Pixel.pixelSize);
		for (double i = 0; i < row; i++) {
			double baseX = getE().getX() + i * Pixel.pixelSize;
			double baseZ = getE().getZ();
			for (double j = 0; j < column; j++) {
				double baseY = getE().getY() + j * Pixel.pixelSize;
				Point point1 = new Point(baseX, baseY, baseZ);
				Point point2 = new Point(baseX + Pixel.pixelSize, baseY, baseZ);
				Point point3 = new Point(baseX + Pixel.pixelSize, baseY + Pixel.pixelSize, baseZ);
				Point point4 = new Point(baseX, baseY + Pixel.pixelSize, baseZ);
				Pixel newPixel = new Pixel(point1, point2, point3, point4);
				newPixel.setVisible(isVisible(newPixel));
				pixelList.add(newPixel);
				System.out.println(isVisible(newPixel));
			}
		}
		PixelMap newPixelMap = new PixelMap();
		newPixelMap.setColumn(column);
		newPixelMap.setRow(row);
		newPixelMap.setPixelList(pixelList);
		mapEFGH=newPixelMap;
		return mapEFGH;
	}
	
	public PixelMap displayABEF() {
		if (mapABEF!=null)
			return mapABEF;
		ArrayList<Pixel> pixelList = new ArrayList<Pixel>();
		int row = (int) ((getF().getZ() - getA().getZ()) / Pixel.pixelSize);
		int column = (int) ((getF().getX() - getA().getX()) / Pixel.pixelSize);
		for (double i = 0; i < row; i++) {
			double baseZ = getF().getZ() - i * Pixel.pixelSize;
			double baseY = getA().getY();
			for (double j = 0; j < column; j++) {
				double baseX = getF().getX() - j * Pixel.pixelSize;
				Point point1 = new Point(baseX, baseY, baseZ);
				Point point2 = new Point(baseX, baseY, baseZ-Pixel.pixelSize);
				Point point3 = new Point(baseX-Pixel.pixelSize, baseY, baseZ-Pixel.pixelSize);
				Point point4 = new Point(baseX-Pixel.pixelSize, baseY, baseZ);
				Pixel newPixel = new Pixel(point1, point2, point3, point4);
				newPixel.setVisible(isVisible(newPixel));
				pixelList.add(newPixel);
				System.out.println(isVisible(newPixel));
			}
		}
		PixelMap newPixelMap = new PixelMap();
		newPixelMap.setColumn(column);
		newPixelMap.setRow(row);
		newPixelMap.setPixelList(pixelList);
		mapABEF=newPixelMap;
		return mapABEF;
	}
	
	public PixelMap displayCDHG() {
		if (mapCDHG!=null)
			return mapCDHG;
		ArrayList<Pixel> pixelList = new ArrayList<Pixel>();
		int row = (int) ((getG().getZ() - getD().getZ()) / Pixel.pixelSize);
		int column = (int) ((getG().getX() - getD().getX()) / Pixel.pixelSize);
		for (double i = 0; i < row; i++) {
			double baseZ = getH().getZ() - i * Pixel.pixelSize;
			double baseY = getD().getY();
			for (double j = 0; j < column; j++) {
				double baseX = getH().getX() + j * Pixel.pixelSize;
				Point point1 = new Point(baseX, baseY, baseZ);
				Point point2 = new Point(baseX, baseY, baseZ-Pixel.pixelSize);
				Point point3 = new Point(baseX+Pixel.pixelSize, baseY, baseZ-Pixel.pixelSize);
				Point point4 = new Point(baseX+Pixel.pixelSize, baseY, baseZ);
				Pixel newPixel = new Pixel(point1, point2, point3, point4);
				newPixel.setVisible(isVisible(newPixel));
				pixelList.add(newPixel);
				System.out.println(isVisible(newPixel));
			}
		}
		PixelMap newPixelMap = new PixelMap();
		newPixelMap.setColumn(column);
		newPixelMap.setRow(row);
		newPixelMap.setPixelList(pixelList);
		mapCDHG=newPixelMap;
		return mapCDHG;
	}
	
	public PixelMap displayBCGF() {
		if (mapBCGF!=null)
			return mapBCGF;
		ArrayList<Pixel> pixelList = new ArrayList<Pixel>();
		int row = (int) ((getG().getZ() - getB().getZ()) / Pixel.pixelSize);
		int column = (int) ((getG().getY() - getB().getY()) / Pixel.pixelSize);
		for (double i = 0; i < row; i++) {
			double baseZ = getG().getZ() - i * Pixel.pixelSize;
			double baseX = getB().getX();
			for (double j = 0; j < column; j++) {
				double baseY = getG().getY() - j * Pixel.pixelSize;
				Point point1 = new Point(baseX, baseY, baseZ);
				Point point2 = new Point(baseX, baseY, baseZ-Pixel.pixelSize);
				Point point3 = new Point(baseX, baseY-Pixel.pixelSize, baseZ-Pixel.pixelSize);
				Point point4 = new Point(baseX, baseY-Pixel.pixelSize, baseZ);
				Pixel newPixel = new Pixel(point1, point2, point3, point4);
				newPixel.setVisible(isVisible(newPixel));
				pixelList.add(newPixel);
				System.out.println(isVisible(newPixel));
			}
		}
		PixelMap newPixelMap = new PixelMap();
		newPixelMap.setColumn(column);
		newPixelMap.setRow(row);
		newPixelMap.setPixelList(pixelList);
		mapBCGF=newPixelMap;
		return mapBCGF;
	}
	
	public PixelMap displayDAEH() {
		if (mapDAEH!=null)
			return mapDAEH;
		ArrayList<Pixel> pixelList = new ArrayList<Pixel>();
		int row = (int) ((getH().getZ() - getA().getZ()) / Pixel.pixelSize);
		int column = (int) ((getH().getY() - getA().getY()) / Pixel.pixelSize);
		for (double i = 0; i < row; i++) {
			double baseZ = getE().getZ() - i * Pixel.pixelSize;
			double baseX = getA().getX();
			for (double j = 0; j < column; j++) {
				double baseY = getE().getY() + j * Pixel.pixelSize;
				Point point1 = new Point(baseX, baseY, baseZ);
				Point point2 = new Point(baseX, baseY, baseZ-Pixel.pixelSize);
				Point point3 = new Point(baseX, baseY+Pixel.pixelSize, baseZ-Pixel.pixelSize);
				Point point4 = new Point(baseX, baseY+Pixel.pixelSize, baseZ);
				Pixel newPixel = new Pixel(point1, point2, point3, point4);
				newPixel.setVisible(isVisible(newPixel));
				pixelList.add(newPixel);
				System.out.println(isVisible(newPixel));
			}
		}
		PixelMap newPixelMap = new PixelMap();
		newPixelMap.setColumn(column);
		newPixelMap.setRow(row);
		newPixelMap.setPixelList(pixelList);
		mapDAEH=newPixelMap;
		return mapDAEH;
	}
}