package data;

import util.Position;

public class Case {
	private final Position position;
	private Piece piece;
	private String affichage;
	
	
	public Case(Position position) {
		this.position = position;
	}
	
	public void positionne(Piece p)
	{
		this.piece=p;
	}
	
	
	public Position getPosition() {
		return position;
	}
	public void vider() {
		piece=null;
	}
	 public Piece getPiece()
	 {
		 return piece;
	 }

	@Override
	public String toString() {
		return ("Case"+ position + piece);
	}
	 
	 
}
