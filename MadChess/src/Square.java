import java.util.Scanner;

public class Square {
	
	
	private int row;
	private int column;
	private Piece p = null;
	private Chest c = null;
	
	public Square(int row, int column){
		this.row = row;
		this.column = column;		
		p = null;
		c = null;
	}
	
	public Square(int row, int column, Piece p){
		this.row = row;
		this.column = column;	
		this.p = p;
	}
	
	public Square(int row, int column,Chest c){
		this.row = row;
		this.column = column;	
		this.c = c;
	}
	
	public void printSquare(){
		if(this.p==null && this.c == null){
			System.out.print("X  ");
		}
		else if(p != null && c == null){
			System.out.print(p.getName() + " ");
		}
		
		else if(p == null && c != null){
			System.out.print("\u2709\uFE0E  ");
		}
	}
	
	public void squareInfo(){
		System.out.println("coordinates:");
		System.out.println("row:" + row  + " column:" + column);
		if(this.p==null && this.c == null){
		}
		else if(p != null && c == null){
			System.out.print(p.getName());
		}
		
		else if(p == null && c != null){
			System.out.print(c.getName());
		}
	}

	public void setPiece(Piece p){
		this.p = p;
	}
	
	public int getRow(){
		return this.row;
	}
	
	public int getColumn(){
		return this.column;
	}
	
	public void setColumn(int column){
		this.column = column;
	}
	
	public void setRow(int row){
		this.row = row;
	}
	
	public Piece getPiece() {
		return p;
	}
	
	public Chest getChest() {
		return c;
	}

	public void setChest(Chest chest) {
		c = chest;
	}

	public void removeChest() {
		c = null;
	}

	public void removePiece() {
		p = null;
	}
}
