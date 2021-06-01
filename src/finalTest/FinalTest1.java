package finalTest;

import java.io.File;
import java.io.FileWriter;

import App.Input;
import geometry.point.Point;

public class FinalTest1 {
	public static void main(String[] args) {
		Input newInput = new Input();
		
		File fos = new File("F:\\Study\\2020-2\\OOP\\FinalProject\\FinalProjectTNA\\test.txt");

		try {
			FileWriter dos = new FileWriter(fos);
			
			dos.write(Point.getPointString(newInput.getNewRoom().getA()));
			dos.write("\n");
			
			dos.write(Point.getPointString(newInput.getNewRoom().getB()));
			dos.write("\n");
			
			dos.write(Point.getPointString(newInput.getNewRoom().getC()));
			dos.write("\n");
			
			dos.write(Point.getPointString(newInput.getNewRoom().getD()));
			dos.write("\n");
			
			dos.write(Point.getPointString(newInput.getNewRoom().getE()));
			dos.write("\n");
			
			dos.write(Point.getPointString(newInput.getNewRoom().getF()));
			dos.write("\n");
			
			dos.write(Point.getPointString(newInput.getNewRoom().getG()));
			dos.write("\n");
			
			dos.write(Point.getPointString(newInput.getNewRoom().getH()));	
			dos.write("\n\n");
			
			
			dos.write(Integer.toString(newInput.getNewRoom().getCameraList().size()));
			dos.write("\n\n");
			
			
			dos.write(Integer.toString(newInput.getNewRoom().getObstacleList().size()));

			dos.write("\n\n");
			
			dos.write(Double.toString(newInput.getNewRoom().getVisiblePercentage()));
			dos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
