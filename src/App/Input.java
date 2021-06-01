package App;

import javax.swing.*;


import geometry.cuboid.RectangularCuboid;
import geometry.point.Point;
import obstacle.Obstacle;
import room.Room;


import java.io.*;
import java.util.Scanner;


public class Input extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fileURL;

	public String getFileURL() {
		return fileURL;
	}

	public void setFileURL(String fileURL) {
		this.fileURL = fileURL;
	}

	private Room newRoom;

	public Room getNewRoom() {
		return newRoom;
	}

	public void setNewRoom(Room newRoom) {
		this.newRoom = newRoom;
	}

	public Point getPointFromString(String coordinate) {
		coordinate = coordinate.replaceAll("\\s+", "");
		String[] test = coordinate.split(",");
		double a, b, c;
		a = Double.parseDouble(test[0]);

		b = Double.parseDouble(test[1]);

		c = Double.parseDouble(test[2]);

		Point newPoint = new Point(a, b, c);

		return newPoint;
	}

	public RectangularCuboid getRectangularCuboid(String currentLineOfRectangular) {
		Point a, b, c, d, e, f, g, h;

//      Read first point
		int pos1 = currentLineOfRectangular.indexOf('(');
		int pos2 = currentLineOfRectangular.indexOf(')');

		String coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		a = getPointFromString(coordinate);

//        Read second point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		b = getPointFromString(coordinate);

//      Read third point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		c = getPointFromString(coordinate);

//    Read fourth point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		d = getPointFromString(coordinate);

//  Read fifth point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		e = getPointFromString(coordinate);

		// Read sixth point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		f = getPointFromString(coordinate);

		// Read seventh point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		g = getPointFromString(coordinate);

		// Read eighth point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		h = getPointFromString(coordinate);

		return new RectangularCuboid(a, b, c, d, e, f, g, h);
	}

	public Room getRoom(String currentLineOfRectangular) {
		Point a, b, c, d, e, f, g, h;

//      Read first point
		int pos1 = currentLineOfRectangular.indexOf('(');
		int pos2 = currentLineOfRectangular.indexOf(')');

		String coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		a = getPointFromString(coordinate);

//        Read second point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		b = getPointFromString(coordinate);

//      Read third point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		c = getPointFromString(coordinate);

//    Read fourth point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		d = getPointFromString(coordinate);

//  Read fifth point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		e = getPointFromString(coordinate);

		// Read sixth point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		f = getPointFromString(coordinate);

		// Read seventh point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		g = getPointFromString(coordinate);

		// Read eighth point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		h = getPointFromString(coordinate);

		return new Room(a, b, c, d, e, f, g, h);
	}

	public Obstacle getObstacles(String currentLineOfRectangular) {
		Point a, b, c, d, e, f, g, h;

//      Read first point
		int pos1 = currentLineOfRectangular.indexOf('(');
		int pos2 = currentLineOfRectangular.indexOf(')');

		String coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		a = getPointFromString(coordinate);

//        Read second point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		b = getPointFromString(coordinate);

//      Read third point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		c = getPointFromString(coordinate);

//    Read fourth point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		d = getPointFromString(coordinate);

//  Read fifth point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		e = getPointFromString(coordinate);

		// Read sixth point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		f = getPointFromString(coordinate);

		// Read seventh point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		g = getPointFromString(coordinate);

		// Read eighth point
		pos1 = currentLineOfRectangular.indexOf('(', pos1 + 1);
		pos2 = currentLineOfRectangular.indexOf(')', pos2 + 1);
		coordinate = currentLineOfRectangular.substring(pos1 + 1, pos2);

		h = getPointFromString(coordinate);

		return new Obstacle(a, b, c, d, e, f, g, h);
	}


	public Input() {
		JFrame parentFrame = new JFrame();
		JFileChooser fileChooser = new JFileChooser();

		try {

			fileChooser.setDialogTitle("Specify a file to save");

			int userSelection = fileChooser.showSaveDialog(parentFrame);

			if (userSelection == JFileChooser.APPROVE_OPTION) {
				File fileToSave = fileChooser.getSelectedFile();
				System.out.println("Save as file: " + fileToSave.getAbsolutePath());
				this.setFileURL(fileToSave.getAbsolutePath());
			}
			System.out.println(this.getFileURL());
			String url = this.getFileURL();
			FileInputStream fileInputStream = new FileInputStream(url);
			String currentLine;
//       Read file

			Scanner scanner = new Scanner(fileInputStream);
//            Create room

			if (scanner.hasNextLine()) {
				currentLine = scanner.nextLine();
				newRoom = getRoom(currentLine);
			}

//			Create obstacle and insert to the room
			if (scanner.hasNextLine()) {
				currentLine = scanner.nextLine();
				int numberOfObstacle = Integer.parseInt(currentLine);
				for (int i = 0; i < numberOfObstacle; i++) {
					if (scanner.hasNextLine()) {
						currentLine = scanner.nextLine();
						newRoom.addObstacle(getObstacles(currentLine));
					}
				}
			}

//			Create and add camera
			if (scanner.hasNextLine()) {
				currentLine = scanner.nextLine();
				int numberOfCamera = Integer.parseInt(currentLine);
				for (int i = 0; i < numberOfCamera; i++) {
					if (scanner.hasNextLine()) {
						currentLine = scanner.nextLine();
						Point a;

						int pos1 = currentLine.indexOf('(');
						int pos2 = currentLine.indexOf(')');

						String coordinate = currentLine.substring(pos1 + 1, pos2);

						a = getPointFromString(coordinate);

						String heightAndWidthOfCamera = currentLine.substring(pos2+2, currentLine.length());
						
						String[] heightAndWidth = heightAndWidthOfCamera.split(" ");
						double width= Double.parseDouble(heightAndWidth[0]);
						double height = Double.parseDouble(heightAndWidth[1]);

						newRoom.addCamera(a, width, height);
						
					}
				}
			}
			scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
