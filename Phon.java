package pa2;

public class Phon extends gameObject{

	public Phon(int x, int y, char type, char color, char target) {
		super(x, y, type, color, target);
		// TODO Auto-generated constructor stub
	}
	
	int[][] getMove(){
		
		int [][]movepos = new int[100][2];
		int direction;
		
		if(this.getColor()=='b') direction=-1;
		else direction=1;
		
		movepos[0][0]= super.getX();
		movepos[0][1]=super.getY()+direction;
		
		movepos[1][0]=super.getX()-1;
		movepos[1][1]=super.getY()+direction;
		
		movepos[2][0]=super.getX()+1;
		movepos[2][1]=super.getY()+direction;
		
		return movepos;
	}

}
