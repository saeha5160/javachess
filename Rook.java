package pa2;

public class Rook extends gameObject{

	public Rook(int x, int y, char type, char color, char target) {
		super(x, y, type, color, target);
		// TODO Auto-generated constructor stub
	}
	
	int[][] getMove(char[][][] board2){
		
		int [][]movewhere = new int[100][2];
		
		int i=0;
		
		//아래로
		int bi=-1;
		while(true) {
			if(this.getY()+bi<1) break;
			movewhere[i][0]=this.getX();
			movewhere[i][1]=this.getY()+bi;
			
			if(board2[8-movewhere[i][1]][movewhere[i][0]-1][0]!=' ') break;			
			i++;
			bi--;
			
		}
		
		//위로
		int ui=1;
		while(true) {
			if(this.getY()+ui>8) break;
			movewhere[i][0]=this.getX();
			movewhere[i][1]=this.getY()+ui;
			
			if(board2[8-movewhere[i][1]][movewhere[i][0]-1][0]!=' ') break;
			
			i++;
			ui++;
			
		}
		
		//왼쪽
		int li=-1;
		while(true) {
			if(this.getY()+li<1) break;
			movewhere[i][0]=this.getX();
			movewhere[i][1]=this.getY()+li;
			
			if(board2[8-movewhere[i][1]][movewhere[i][0]-1][0]!=' ') break;
			
			i++;
			li--;
			
		}
		
		//오른쪽
		int ri=1;
		while(true) {
			if(this.getY()+ri>8) break;
			movewhere[i][0]=this.getX();
			movewhere[i][1]=this.getY()+ri;
			
			if(board2[8-movewhere[i][1]][movewhere[i][0]-1][0]!=' ') break;
			
			i++;
			ri++;
			
		}
		return movewhere;
	}
}
