package d1p3;

public class Bishop extends ChessPiece {

	private int forwardMovement;
	private int sideMovement;
	
	Bishop(String color, int startingPosition, int forwardMovement, int sideMovement) {
		super(color, startingPosition);
		this.forwardMovement = forwardMovement;
		this.sideMovement = sideMovement;
	}
	
	public String toString() {
		return "[Bishop:  " + super.toString() + ", Forward Movement = " + forwardMovement 
				+ ", Side Movement = " + sideMovement + "]";
	}
	
}
