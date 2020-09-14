package d1p3;

public class ChessPieceDemo {

	public static void main(String args[]) {
		
		ChessPiece piece = new ChessPiece("White", 1);
		ChessPiece rook = new Rook("White", 4, 8, 0); // Polymorphism
		Bishop bishop = new Bishop("Black", 3, 5, 5);
		
		System.out.println(piece);
		System.out.println(rook);
		System.out.println(bishop);
		
	}
	
}
