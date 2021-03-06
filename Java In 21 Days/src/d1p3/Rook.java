package d1p3;

public class Rook extends ChessPiece {

	private int forwardMovement;
	private int sideMovement;
	
	Rook(String color, int startingPosition, int forwardMovement, int sideMovement) {
		super(color, startingPosition);
		this.forwardMovement = forwardMovement;
		this.sideMovement = sideMovement;
	}
	
	public String toString() {
		return "[Rook:  " + super.toString() + ", Forward Movement = " + forwardMovement 
				+ ", Side Movement = " + sideMovement + "]";
	}
	
}
