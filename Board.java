package pa2;

import java.util.HashMap;
import java.util.Scanner;

public class Board {
	
	gameObject selectOb;
	
	Rook wR1 = new Rook(1, 8, 'R', 'w', ' ');
	Rook wR2 = new Rook(8, 8, 'R', 'w', ' ');
	
	Knight wN1 = new Knight(2,8,'N','w',' ');
	Knight wN2 = new Knight(7,8,'N','w',' ');
	
	Bishop wB1=new Bishop(3,8,'B','w',' ');
	Bishop wB2=new Bishop(6,8,'B','w',' ');
	
	Queen wQ = new Queen(4,8,'Q','w',' ');

	King wK = new King(5,8,'K','w',' ');
	
	Phon wP1 = new Phon(1,7,'P','w',' ');
	Phon wP2 = new Phon(2,7,'P','w',' ');
	Phon wP3 = new Phon(3,7,'P','w',' ');
	Phon wP4 = new Phon(4,7,'P','w',' ');
	Phon wP5 = new Phon(5,7,'P','w',' ');
	Phon wP6 = new Phon(6,7,'P','w',' ');
	Phon wP7 = new Phon(7,7,'P','w',' ');
	Phon wP8 = new Phon(8,7,'P','w',' ');
	
	Rook bR1 = new Rook(1, 0, 'R', 'b', ' ');
	Rook bR2 = new Rook(8, 0, 'R', 'b', ' ');
	
	Knight bN1 = new Knight(2,0,'N','b',' ');
	Knight bN2 = new Knight(7,0,'N','b',' ');
	
	Bishop bB1=new Bishop(3,0,'B','b',' ');
	Bishop bB2=new Bishop(6,0,'B','b',' ');
	
	Queen bQ = new Queen(4,0,'Q','b',' ');
	
	King bK = new King(5,0,'K','b',' ');
	
	Phon bP1 = new Phon(1,1,'P','b',' ');
	Phon bP2 = new Phon(2,1,'P','b',' ');
	Phon bP3 = new Phon(3,1,'P','b',' ');
	Phon bP4 = new Phon(4,1,'P','b',' ');
	Phon bP5 = new Phon(5,1,'P','b',' ');
	Phon bP6 = new Phon(6,1,'P','b',' ');
	Phon bP7 = new Phon(7,1,'P','b',' ');
	Phon bP8 = new Phon(8,1,'P','b',' ');
	
	HashMap<char[],gameObject > map = new HashMap<>();
	
	char[][][] board1= {{{'b','R',' '},{'b','N',' '},{'b','B',' '},{'b','Q',' '},{'b','K',' '},{'b','B',' '},{'b','N',' '},{'b','R',' '}},{{'b','P',' '},{'b','P',' '},{'b','P',' '},{'b','P',' '},{'b','P',' '},{'b','P',' '},{'b','P',' '},{'b','P',' '}},
			{{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}},{{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}},{{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}},{{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}},
			{{'w','P',' '},{'w','P',' '},{'w','P',' '},{'w','P',' '},{'w','P',' '},{'w','P',' '},{'w','P',' '},{'w','P',' '}},{{'w','R',' '},{'w','N',' '},{'w','B',' '},{'w','Q',' '},{'w','K',' '},{'w','B',' '},{'w','N',' '},{'w','R',' '}}};

	char[][][] board2= {{{'b','R',' '},{'b','N',' '},{'b','B',' '},{'b','Q',' '},{'b','K',' '},{'b','B',' '},{'b','N',' '},{'b','R',' '}},{{'b','P',' '},{'b','P',' '},{'b','P',' '},{'b','P',' '},{'b','P',' '},{'b','P',' '},{'b','P',' '},{'b','P',' '}},
			{{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}},{{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}},{{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}},{{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}},
			{{'w','P',' '},{'w','P',' '},{'w','P',' '},{'w','P',' '},{'w','P',' '},{'w','P',' '},{'w','P',' '},{'w','P',' '}},{{'w','R',' '},{'w','N',' '},{'w','B',' '},{'w','Q',' '},{'w','K',' '},{'w','B',' '},{'w','N',' '},{'w','R',' '}}};

	Board(boolean withFile) {
		
	}

	public boolean isFinish(boolean withFile) {
		/* Your code */
	}
	
	public void selectObject(boolean withFile) {
		
		int i;
		int direction;
		char[][] movewhere = null;
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Select piece");
		String in = sc.nextLine();
		
		char[] selectsq = in.toCharArray();
		
		selectOb=(map.get(selectsq));
		
		if (selectOb.getColor()=='b')	direction = -1;
		else	direction = 1;
		
		switch(selectOb.getType()) {
		case 'P':
			movewhere[0][0]=selectsq[0];
			movewhere[0][1]=(char) (selectsq[1]+direction);
			break;
			
		case 'R':
			i=0;
			while(true) {
				if(selectsq[1]+i>8) break;
				
				movewhere[i][0]=selectsq[0];
				movewhere[i][1]=(char) (selectsq[1]+i);
				
				if(board2[selectsq[1]+i][selectsq[0]][0]!=' ') break;
				
				i++;
			}
			
			while(true) {
				if(selectsq[1]-i<0) break;
				
				movewhere[i][0]=selectsq[0];
				movewhere[i][1]=(char) (selectsq[1]-i);
				
				if(board2[selectsq[1]-i][selectsq[0]][0]!=' ') break;
				
				i++;
			}
			
			while(true) {
				if((int)selectsq[0]+i-97>8) break;
				
				movewhere[i][0]=(char) ((int)selectsq[0]+i);
				movewhere[i][1]=selectsq[1];
				
				if(board2[selectsq[1]][(int)selectsq[0]+i-97][0]!=' ') break;
				
				i++;
			}
			
			while(true) {
				if((int)selectsq[0]-i-97<0) break;
				
				movewhere[i][0]=(char) ((int)selectsq[0]-i);
				movewhere[i][1]=selectsq[1];
				
				if(board2[selectsq[1]][(int)selectsq[0]-i-97][0]!=' ') break;
				
				i++;
			}
			break;
		
		case 'N':
			 
			movewhere[0][0]=(char)((int)selectsq[0]+1);
			movewhere[0][1]=(char)((int)selectsq[0]+direction*2);
			
			movewhere[1][0]=(char)((int)selectsq[0]-1);
			movewhere[1][1]=(char)((int)selectsq[0]+direction*2);
			
			break;
			
		case 'B':
			
			i=0;
			
			while(true) {
				if(selectsq[1]-i<0) break;
				if((int)selectsq[0]-i-97<0) break;
				
				movewhere[i][0]=(char) ((int)selectsq[0]-i);
				movewhere[i][1]=(char) ((int)selectsq[1]-i);
				
				if(board2[(int)selectsq[1]-i][(int)selectsq[0]-i][0]!=' ') break;
				
				i++;
			}
			
			while(true) {
				if(selectsq[1]-i<0) break;
				if((int)selectsq[0]+i-97>8) break;
				
				movewhere[i][0]=(char) ((int)selectsq[0]+i);
				movewhere[i][1]=(char) ((int)selectsq[1]-i);
				
				if(board2[(int)selectsq[1]-i][(int)selectsq[0]+i][0]!=' ') break;
				
				i++;
			}
			
			while(true) {
				if(selectsq[1]+i>8) break;
				if((int)selectsq[0]+i-97>8) break;
				
				movewhere[i][0]=(char) ((int)selectsq[0]+i);
				movewhere[i][1]=(char) ((int)selectsq[1]+i);
				
				if(board2[(int)selectsq[1]+i][(int)selectsq[0]+i][0]!=' ') break;
				
				i++;
			}
			
			while(true) {
				if(selectsq[1]+i>8) break;
				if((int)selectsq[0]-i-97<0) break;
				
				movewhere[i][0]=(char) ((int)selectsq[0]-i);
				movewhere[i][1]=(char) ((int)selectsq[1]+i);
				
				if(board2[(int)selectsq[1]+i][(int)selectsq[0]-i][0]!=' ') break;
				
				i++;
			}
			
			break;
			
		case 'Q':
			
			i=0;
			while(true) {
				if(selectsq[1]+i>8) break;
				
				movewhere[i][0]=selectsq[0];
				movewhere[i][1]=(char) (selectsq[1]+i);
				
				if(board2[selectsq[1]+i][selectsq[0]][0]!=' ') break;
				
				i++;
			}
			
			while(true) {
				if(selectsq[1]-i<0) break;
				
				movewhere[i][0]=selectsq[0];
				movewhere[i][1]=(char) (selectsq[1]-i);
				
				if(board2[selectsq[1]-i][selectsq[0]][0]!=' ') break;
				
				i++;
			}
			
			while(true) {
				if((int)selectsq[0]+i-97>8) break;
				
				movewhere[i][0]=(char) ((int)selectsq[0]+i);
				movewhere[i][1]=selectsq[1];
				
				if(board2[selectsq[1]][(int)selectsq[0]+i-97][0]!=' ') break;
				
				i++;
			}
			
			while(true) {
				if((int)selectsq[0]-i-97<0) break;
				
				movewhere[i][0]=(char) ((int)selectsq[0]-i);
				movewhere[i][1]=selectsq[1];
				
				if(board2[selectsq[1]][(int)selectsq[0]-i-97][0]!=' ') break;
				
				i++;
			}
			
			while(true) {
				if(selectsq[1]-i<0) break;
				if((int)selectsq[0]-i-97<0) break;
				
				movewhere[i][0]=(char) ((int)selectsq[0]-i);
				movewhere[i][1]=(char) ((int)selectsq[1]-i);
				
				if(board2[(int)selectsq[1]-i][(int)selectsq[0]-i][0]!=' ') break;
				
				i++;
			}
			
			while(true) {
				if(selectsq[1]-i<0) break;
				if((int)selectsq[0]+i-97>8) break;
				
				movewhere[i][0]=(char) ((int)selectsq[0]+i);
				movewhere[i][1]=(char) ((int)selectsq[1]-i);
				
				if(board2[(int)selectsq[1]-i][(int)selectsq[0]+i][0]!=' ') break;
				
				i++;
			}
			
			while(true) {
				if(selectsq[1]+i>8) break;
				if((int)selectsq[0]+i-97>8) break;
				
				movewhere[i][0]=(char) ((int)selectsq[0]+i);
				movewhere[i][1]=(char) ((int)selectsq[1]+i);
				
				if(board2[(int)selectsq[1]+i][(int)selectsq[0]+i][0]!=' ') break;
				
				i++;
			}
			
			while(true) {
				if(selectsq[1]+i>8) break;
				if((int)selectsq[0]-i-97<0) break;
				
				movewhere[i][0]=(char) ((int)selectsq[0]-i);
				movewhere[i][1]=(char) ((int)selectsq[1]+i);
				
				if(board2[(int)selectsq[1]+i][(int)selectsq[0]-i][0]!=' ') break;
				
				i++;
			}
			
			break;
			
		case 'K':
			movewhere[0][0]=(char) (selectsq[0]-1);
			movewhere[0][1]=(char) (selectsq[1]-1);
			
			movewhere[1][0]=(char) (selectsq[0]);
			movewhere[1][1]=(char) (selectsq[1]-1);
			
			movewhere[2][0]=(char) (selectsq[0]+1);
			movewhere[2][1]=(char) (selectsq[1]-1);
			
			movewhere[3][0]=(char) (selectsq[0]-1);
			movewhere[3][1]=(char) (selectsq[1]);
			
			movewhere[4][0]=(char) (selectsq[0]+1);
			movewhere[4][1]=(char) (selectsq[1]);
			
			movewhere[5][0]=(char) (selectsq[0]-1);
			movewhere[5][1]=(char) (selectsq[1]+1);
			
			movewhere[6][0]=(char) (selectsq[0]);
			movewhere[6][1]=(char) (selectsq[1]+1);
			
			movewhere[7][0]=(char) (selectsq[0]+1);
			movewhere[7][1]=(char) (selectsq[1]+1);
			
			break;	
		}
		
		for(int j=0;j<movewhere.length;j++) {
			if(board2[movewhere[j][1]][movewhere[j][0]][0]!=selectOb.getColor())
				board2[movewhere[j][1]][movewhere[j][0]][2]='*';
		}
		
		printBoard(withFile);
		
	}
	
	public void moveObject(boolean withFile) {
		
		Scanner sc = new Scanner(System.in);
		String movein;
		char[] movesq;
		
		System.out.print("Move piece");
		movesq = sc.nextLine().toCharArray();
		
		board1[selectOb.getY()-1][selectOb.getX()-1][0]=' ';
		board1[selectOb.getY()-1][selectOb.getX()-1][1]=' ';
		board1[selectOb.getY()-1][selectOb.getX()-1][2]=' ';
		
		selectOb.setX(movesq[0]-96);
		selectOb.setY(movesq[1]);
		
		map.put(movesq,selectOb);
		
		board1[selectOb.getY()-1][selectOb.getX()-1][0]=selectOb.getColor();
		board1[selectOb.getY()-1][selectOb.getX()-1][1]=selectOb.getType();
		board1[selectOb.getY()-1][selectOb.getX()-1][2]=' ';
		
		board2=board1;
		
	}
	
	public void printBoard(boolean withFile) {
		
		
		final String ANSI_RESET = "\033[0m";
		final String ANSI_FG_BLACK = "\033[30m";
		final String ANSI_FG_WHITE = "\033[37m";
		final String ANSI_BG_BLACK = "\033[40m";
		final String ANSI_BG_WHITE = "\033[47m";


		System.out.println("   a  b  c  d  e  f  g  h \n");
		for(int i = 0; i < 8; i++) {
			System.out.println(8-i + " ");
			
			for (int j = 0; j < 8; j++) {
				if(isBlackSquare(i, j)) {
					// Black background, white character
					System.out.print(ANSI_BG_BLACK + ANSI_FG_WHITE
							+ board2[i][j][0]
							+ board2[i][j][1]
							+ board2[i][j][2]
							+ ANSI_RESET + ANSI_RESET);
				} else {
					/// White background, black character
					System.out.print(ANSI_BG_WHITE + ANSI_FG_BLACK
							+ board2[i][j][0]
							+ board2[i][j][1]
							+ board2[i][j][2]
							+ ANSI_RESET + ANSI_RESET);
				}
			}
			System.out.print('\n');
		}
		
	}
	
	Boolean isBlackSquare(int i,int j)	{
		if((i+j)%2==0) return true;
		else return false;
	}
}
