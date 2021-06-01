package pixel;

import java.util.ArrayList;

public class PixelMap {
	private int row;
	private int column;
	private ArrayList<Pixel> pixelList;
	
	//Constructors
	public PixelMap() {
		
	}
	
	//Getters and Setters
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}

	public ArrayList<Pixel> getPixelList() {
		return pixelList;
	}

	public void setPixelList(ArrayList<Pixel> pixelList) {
		this.pixelList = pixelList;
	}
	
	
	
}
