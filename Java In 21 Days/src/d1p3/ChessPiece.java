package d1p3;

public class ChessPiece {

	private String color;
	private int startingPostion;
	
	ChessPiece(String color, int startingPosition) {
		this.color = color;
		this.startingPostion = startingPosition;
	}
	
	public String toString() {
		return "[Color = " + color + ", Starting Position = " + startingPostion + "]";
	}
	
}
