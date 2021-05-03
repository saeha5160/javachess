package pa2;

public class King extends gameObject{

	public King(int x, int y, char type, char color, char target) {
		super(x, y, type, color, target);
		// TODO Auto-generated constructor stub
	}
	
	int[][] getMove(){
		
		int [][]movewhere = new int[100][2];
		
		movewhere[0][0]=this.getX()-1;
		movewhere[0][1]=this.getY()-1;
		
		movewhere[1][0]=this.getX();
		movewhere[1][1]=this.getY()-1;
		
		movewhere[2][0]=this.getX()+1;
		movewhere[2][1]=this.getY()-1;
		
		movewhere[3][0]=this.getX()-1;
		movewhere[3][1]=this.getY();
		
		movewhere[4][0]=this.getX()+1;
		movewhere[4][1]=this.getY();
		
		movewhere[5][0]=this.getX()-1;
		movewhere[5][1]=this.getY()+1;
	
		movewhere[6][0]=this.getX();
		movewhere[6][1]=this.getY()+1;
		
		movewhere[7][0]=this.getX()+1;
		movewhere[7][1]=this.getY()+1;
		
		for(int i=0;i<8;i++) {
			if(movewhere[i][0]=='\0') movewhere[i][0]=-1;
		}
		
		return movewhere;
	}
}
