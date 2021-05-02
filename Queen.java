package pa2;

public class Queen extends gameObject{

	public Queen(int x, int y, char type, char color, char target) {
		super(x, y, type, color, target);
		// TODO Auto-generated constructor stub
	}
	
	int[][] getMove(){
		
		int [][]movepos = new int[1][2];
		int direction;
		
		if(this.getColor()=='b') direction=-1;
		else direction=1;
		
		movepos[0][0]= super.getX();
		movepos[0][1]=super.getY()+direction;
		
		return movepos;
	}
}
