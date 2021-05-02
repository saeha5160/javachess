package pa2;

public class Queen extends gameObject{

	public Queen(int x, int y, char type, char color, char target) {
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
		//왼쪽위
		int lu=+1;
		while(true) {
			
			if(this.getY()+lu>8||this.getX()-lu<1) break;
			movewhere[i][0]=this.getX()-lu;
			movewhere[i][1]=this.getY()+lu;
			
			if(board2[8-movewhere[i][1]][movewhere[i][0]-1][0]!=' ') break;			
			i++;
			lu--;
			
		}
		
		//오른쪽위
		int ru=1;
		while(true) {
			if(this.getY()+ru>8||this.getX()+ru>8) break;
			movewhere[i][0]=this.getX()+ru;
			movewhere[i][1]=this.getY()+ru;
			
			if(board2[8-movewhere[i][1]][movewhere[i][0]-1][0]!=' ') break;
			
			i++;
			ru++;
			
		}
		
		//왼쪽아래
		int ld=-1;
		while(true) {
			if(this.getY()+ld<1||this.getX()+ld<1) break;
			movewhere[i][0]=this.getX()+ld;
			movewhere[i][1]=this.getY()+ld;
			
			if(board2[8-movewhere[i][1]][movewhere[i][0]-1][0]!=' ') break;
			
			i++;
			ld--;
			
		}
		
		//오른쪽아래
		int rd=-1;
		while(true) {
			if(this.getY()+rd<1||this.getX()-rd>8) break;
			movewhere[i][0]=this.getX()-rd;
			movewhere[i][1]=this.getY()+rd;
			
			if(board2[8-movewhere[i][1]][movewhere[i][0]-1][0]!=' ') break;
			
			i++;
			rd++;
			
		}
		return movewhere;
	}
}
