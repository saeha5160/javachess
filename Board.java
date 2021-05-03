package pa2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Board {
	
	gameObject selectOb;
	
	char[][] file_src;
	char[][] file_dst;
	List<Object> file_in = new ArrayList<Object>();

	int file_in_i=0;
	
	char[] selectsq;
	String in;
	String inm;
	char finalturn='b';
	
	Rook bR1 = new Rook(1, 8, 'R', 'b', ' ');
	Rook bR2 = new Rook(8, 8, 'R', 'b', ' ');
	
	Knight bN1 = new Knight(2,8,'N','b',' ');
	Knight bN2 = new Knight(7,8,'N','b',' ');
	
	Bishop bB1=new Bishop(3,8,'B','b',' ');
	Bishop bB2=new Bishop(6,8,'B','b',' ');
	
	Queen bQ = new Queen(4,8,'Q','b',' ');

	King bK = new King(5,8,'K','b',' ');
	
	Phon bP1 = new Phon(1,7,'P','b',' ');
	Phon bP2 = new Phon(2,7,'P','b',' ');
	Phon bP3 = new Phon(3,7,'P','b',' ');
	Phon bP4 = new Phon(4,7,'P','b',' ');
	Phon bP5 = new Phon(5,7,'P','b',' ');
	Phon bP6 = new Phon(6,7,'P','b',' ');
	Phon bP7 = new Phon(7,7,'P','b',' ');
	Phon bP8 = new Phon(8,7,'P','b',' ');
	
	Rook wR1 = new Rook(1, 1, 'R', 'w', ' ');
	Rook wR2 = new Rook(8, 1, 'R', 'w', ' ');
	
	Knight wN1 = new Knight(2,1,'N','w',' ');
	Knight wN2 = new Knight(7,1,'N','w',' ');
	
	Bishop wB1=new Bishop(3,1,'B','w',' ');
	Bishop wB2=new Bishop(6,1,'B','w',' ');
	
	Queen wQ = new Queen(4,1,'Q','w',' ');
	
	King wK = new King(5,1,'K','w',' ');
	
	Phon wP1 = new Phon(1,2,'P','w',' ');
	Phon wP2 = new Phon(2,2,'P','w',' ');
	Phon wP3 = new Phon(3,2,'P','w',' ');
	Phon wP4 = new Phon(4,2,'P','w',' ');
	Phon wP5 = new Phon(5,2,'P','w',' ');
	Phon wP6 = new Phon(6,2,'P','w',' ');
	Phon wP7 = new Phon(7,2,'P','w',' ');
	Phon wP8 = new Phon(8,2,'P','w',' ');
	
	HashMap<String,gameObject> map = new HashMap<>();
	HashMap<String,gameObject> Phonmap = new HashMap<>();
	HashMap<String,gameObject> Rookmap = new HashMap<>();
	HashMap<String,gameObject> Knightmap = new HashMap<>();
	HashMap<String,gameObject> Bishopmap = new HashMap<>();
	HashMap<String,gameObject> Queenmap = new HashMap<>();
	HashMap<String,gameObject> Kingmap = new HashMap<>();
	

	FileWriter w = new FileWriter("output.txt");
	
	char[][][] board= {{{'b','R',' '},{'b','N',' '},{'b','B',' '},{'b','Q',' '},{'b','K',' '},{'b','B',' '},{'b','N',' '},{'b','R',' '}},{{'b','P',' '},{'b','P',' '},{'b','P',' '},{'b','P',' '},{'b','P',' '},{'b','P',' '},{'b','P',' '},{'b','P',' '}},
			{{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}},{{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}},{{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}},{{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}},
			{{'w','P',' '},{'w','P',' '},{'w','P',' '},{'w','P',' '},{'w','P',' '},{'w','P',' '},{'w','P',' '},{'w','P',' '}},{{'w','R',' '},{'w','N',' '},{'w','B',' '},{'w','Q',' '},{'w','K',' '},{'w','B',' '},{'w','N',' '},{'w','R',' '}}};

	Board(boolean withFile) throws IOException {
		String tmp;
		
		tmp="a8";
		Rookmap.put(tmp,bR1);
		
		tmp="b8";
		Knightmap.put(tmp,bN1);
		
		tmp="c8";
		Bishopmap.put(tmp,bB1);
		
		tmp="d8";
		Queenmap.put(tmp,bQ);
		
		tmp="e8";
		Kingmap.put(tmp,bK);
		
		tmp="f8";
		Bishopmap.put(tmp,bB2);
		
		tmp="g8";
		Knightmap.put(tmp,bN2);
		
		tmp="h8";
		Rookmap.put(tmp,bR2);
		
		tmp="a7";
		Phonmap.put(tmp,bP1);
		tmp="b7";
		Phonmap.put(tmp,bP2);
		tmp="c7";
		Phonmap.put(tmp,bP3);
		tmp="d7";
		Phonmap.put(tmp,bP4);
		tmp="e7";
		Phonmap.put(tmp,bP5);
		tmp="f7";
		Phonmap.put(tmp,bP6);
		tmp="g7";
		Phonmap.put(tmp,bP7);
		tmp="h7";
		Phonmap.put(tmp,bP8);
		
		tmp="a1";
		Rookmap.put(tmp,wR1);
		
		tmp="b1";
		Knightmap.put(tmp,wN1);

		tmp="c1";
		Bishopmap.put(tmp,wB1);
		
		tmp="d1";
		Queenmap.put(tmp,wQ);
		
		tmp="e1";
		Kingmap.put(tmp,wK);
		
		tmp="f1";
		Bishopmap.put(tmp,wB2);
		
		tmp="g1";
		Knightmap.put(tmp,wN2);
		
		tmp="h1";
		Rookmap.put(tmp,wR2);
		
		tmp="a2";
		Phonmap.put(tmp,wP1);
		tmp="b2";
		Phonmap.put(tmp,wP2);
		tmp="c2";
		Phonmap.put(tmp,wP3);
		tmp="d2";
		Phonmap.put(tmp,wP4);
		tmp="e2";
		Phonmap.put(tmp,wP5);
		tmp="f2";
		Phonmap.put(tmp,wP6);
		tmp="g2";
		Phonmap.put(tmp,wP7);
		tmp="h2";
		Phonmap.put(tmp,wP8);
		
		if(withFile) {
			File f = new File("input.txt");
			String fileline;
			BufferedReader bf = new BufferedReader(new FileReader(f));
			while((fileline=bf.readLine())!=null)	{
				file_in.add(fileline);
				file_in_i++;
			}
			
			file_in_i=0;
			
		}
	}

	public boolean isFinish(boolean withFile) throws IOException {
		
		if(withFile) {
			if(Kingmap.containsValue(bK)&&Kingmap.containsValue(wK)) return false;
			
			else {
				if(Kingmap.containsValue(bK)) {
					w.write("Black Win");
					w.close();
					return true;
				}
				else {
					w.write("White Win");
					w.close();
					return true;
				}
			}
		}
		
		else {
			if(Kingmap.containsValue(bK)&&Kingmap.containsValue(wK)) return false;
			
			else {
				if(Kingmap.containsValue(bK)) {
					System.out.println("Black Win");
					return true;
				}
				else {
					System.out.println("White Win");
					return true;
				}
			}
		}
	}
	
	public void selectObject(boolean withFile) throws IOException {
		
		int i;
		int direction;
		int[][] movewhere = new int[100][2];
		
		if(withFile) {
			
			int checkInval=0;
			
			while(true) {
				while(true) {
					
					if(file_in_i>=file_in.size()) {
						w.close();
						System.exit(0);
					}
					
					in=((String) file_in.get(file_in_i)).split(", ")[0];
					selectsq=in.toCharArray();
					System.out.print("select piece: ");
					System.out.println(in);
					w.write("Select piece: ");
					w.write(in+"\n");
					
					if(in.equals("F")) {
						w.close();
						System.exit(0);
					}
					
					if(Bishopmap.containsKey(in))	{
						selectOb=(Bishopmap.get(in));
						movewhere=((Bishop)selectOb).getMove(board);
						break;
					}
					else if(Rookmap.containsKey(in))	{
						selectOb=(Rookmap.get(in));
						movewhere=((Rook)selectOb).getMove(board);
						break;
					}		
					else if(Kingmap.containsKey(in))	{
						selectOb=(Kingmap.get(in));
						movewhere=((King)selectOb).getMove();
						break;
					}		
					else if(Queenmap.containsKey(in))	{
						selectOb=(Queenmap.get(in));
						movewhere=((Queen)selectOb).getMove(board);
						break;
					}		
					else if(Phonmap.containsKey(in))	{
						selectOb=(Phonmap.get(in));
						movewhere=((Phon) selectOb).getMove();
						break;
					}		
					else if(Knightmap.containsKey(in))	{
						selectOb=(Knightmap.get(in));
						movewhere=((Knight)selectOb).getMove();
						break;
					}
					else {
						file_in_i++;
					}
				}
				
				if(finalturn==selectOb.getColor()) {
					file_in_i++;
					continue;
				}
				
				for(int j=0;movewhere[j][0]!='\0';j++) {
					if((movewhere[j][0]-1)>=0 &&(8-movewhere[j][1])>=0&&(movewhere[j][0]-1)<=7&&(8-movewhere[j][1])<=7) {
						if(board[8-((int)movewhere[j][1])][(int)movewhere[j][0]-1][0]!=selectOb.getColor())	{
							checkInval=1;
							board[8-((int)movewhere[j][1])][(int)movewhere[j][0]-1][2]='*';
						}
					}
				}
				
				if(checkInval==1) break;
				else {
					file_in_i++;
				}
			}
		}
		
		else {
			Scanner sc= new Scanner(System.in);
			
			int checkInval=0;
			
			while(true) {
				while(true) {
					
					System.out.print("Select piece: ");
					in = sc.nextLine();
					if(in.equals("F")) System.exit(0);
					selectsq = in.toCharArray();
					
					if(Bishopmap.containsKey(in))	{
						selectOb=(Bishopmap.get(in));
						movewhere=((Bishop)selectOb).getMove(board);
						break;
					}
					else if(Rookmap.containsKey(in))	{
						selectOb=(Rookmap.get(in));
						movewhere=((Rook)selectOb).getMove(board);
						break;
					}		
					else if(Kingmap.containsKey(in))	{
						selectOb=(Kingmap.get(in));
						movewhere=((King)selectOb).getMove();
						break;
					}		
					else if(Queenmap.containsKey(in))	{
						selectOb=(Queenmap.get(in));
						movewhere=((Queen)selectOb).getMove(board);
						break;
					}		
					else if(Phonmap.containsKey(in))	{
						selectOb=(Phonmap.get(in));
						movewhere=((Phon) selectOb).getMove();
						break;
					}		
					else if(Knightmap.containsKey(in))	{
						selectOb=(Knightmap.get(in));
						movewhere=((Knight)selectOb).getMove();
						break;
					}
					else {
						System.out.println("Invalid command. No piece");
					}
				}
				
				if(finalturn==selectOb.getColor()) {
					System.out.println("Invalid command. Not turn.");
					continue;
				}
				
				for(int j=0;movewhere[j][0]!='\0';j++) {
					
					if((int)(movewhere[j][0]-1)>=0 &&(int)(8-movewhere[j][1])>=0&&(int)(movewhere[j][0]-1)<=7&&(int)(8-movewhere[j][1])<=7) {
						if(board[8-((int)movewhere[j][1])][(int)movewhere[j][0]-1][0]!=selectOb.getColor()) {
							checkInval=1;
							board[8-((int)movewhere[j][1])][(int)movewhere[j][0]-1][2]='*';
						}
					}
				}
				
				if(checkInval==1) break;
				else System.out.println("Invalid command");
			}
		}
		
		printBoard(withFile);
		
	}
	
	public void moveObject(boolean withFile) throws IOException {
		
		if(withFile) {
			
			String movein;
			char[] movesq;
			
			while(true)	{
				
				while(true) {
					System.out.print("move piece: ");
					w.write("Move piece: ");
					inm=((String) file_in.get(file_in_i)).split(", ")[1];
					w.write(inm+"\n");
					System.out.println(inm);
					if(in.equals(((String) file_in.get(file_in_i)).split(", ")[0])) break;
					file_in_i++;
				}
				
				if(inm.equals("F")) System.exit(0);
				movesq=inm.toCharArray();
				if(board[8-Integer.parseInt(String.valueOf(movesq[1]))][movesq[0]-96-1][2]=='*') break;
				file_in_i++;
				
				
			}
			file_in_i++;
			
			board[8-(selectOb.getY())][selectOb.getX()-1][0]=' ';
			board[8-(selectOb.getY())][selectOb.getX()-1][1]=' ';
			board[8-(selectOb.getY())][selectOb.getX()-1][2]=' ';
			
			selectOb.setX(movesq[0]-96);
			selectOb.setY(Integer.parseInt(String.valueOf(movesq[1])));
			
			if(Bishopmap.containsValue(selectOb))	{
				Bishopmap.remove(inm);
				Rookmap.remove(inm);
				Kingmap.remove(inm);
				Queenmap.remove(inm);
				Phonmap.remove(inm);
				Knightmap.remove(inm);
				
				Bishopmap.remove(in);
				Bishopmap.put(inm,selectOb);
			}
			if(Rookmap.containsValue(selectOb))	{
				Bishopmap.remove(inm);
				Rookmap.remove(inm);
				Kingmap.remove(inm);
				Queenmap.remove(inm);
				Phonmap.remove(inm);
				Knightmap.remove(inm);
				Rookmap.remove(in);
				Rookmap.put(inm,selectOb);
			}		
			if(Kingmap.containsValue(selectOb))	{
				Bishopmap.remove(inm);
				Rookmap.remove(inm);
				Kingmap.remove(inm);
				Queenmap.remove(inm);
				Phonmap.remove(inm);
				Knightmap.remove(inm);
				Kingmap.remove(in);
				Kingmap.put(inm,selectOb);
			}		
			if(Queenmap.containsValue(selectOb))	{
				Bishopmap.remove(inm);
				Rookmap.remove(inm);
				Kingmap.remove(inm);
				Queenmap.remove(inm);
				Phonmap.remove(inm);
				Knightmap.remove(inm);
				Queenmap.remove(in);
				Queenmap.put(inm,selectOb);
			}		
			if(Phonmap.containsValue(selectOb))	{
				Bishopmap.remove(inm);
				Rookmap.remove(inm);
				Kingmap.remove(inm);
				Queenmap.remove(inm);
				Phonmap.remove(inm);
				Knightmap.remove(inm);
				Phonmap.remove(in);
				Phonmap.put(inm,selectOb);
			}		
			if(Knightmap.containsValue(selectOb))	{
				Bishopmap.remove(inm);
				Rookmap.remove(inm);
				Kingmap.remove(inm);
				Queenmap.remove(inm);
				Phonmap.remove(inm);
				Knightmap.remove(inm);
				Knightmap.remove(in);
				Knightmap.put(inm,selectOb);
			}
			
			board[8-(selectOb.getY())][selectOb.getX()-1][0]=selectOb.getColor();
			board[8-(selectOb.getY())][selectOb.getX()-1][1]=selectOb.getType();
			board[8-(selectOb.getY())][selectOb.getX()-1][2]=' ';
			
			for(int a=0;a<8;a++) {
				for(int b=0;b<8;b++) {
					board[a][b][2]=' ';
				}
			}
			
		}
		
		else {
			Scanner sc = new Scanner(System.in);
			String movein;
			char[] movesq;
			
			while(true)	{
				System.out.print("Move piece ");
				inm=sc.nextLine();
				if(inm.equals("F")) System.exit(0);
				movesq = inm.toCharArray();
				if(board[8-Integer.parseInt(String.valueOf(movesq[1]))][movesq[0]-96-1][2]=='*') break;
				System.out.println("Invalid command");
			}
			
			board[8-(selectOb.getY())][selectOb.getX()-1][0]=' ';
			board[8-(selectOb.getY())][selectOb.getX()-1][1]=' ';
			board[8-(selectOb.getY())][selectOb.getX()-1][2]=' ';
			
			selectOb.setX(movesq[0]-96);
			selectOb.setY(Integer.parseInt(String.valueOf(movesq[1])));
			
			if(Bishopmap.containsValue(selectOb))	{
				Bishopmap.remove(inm);
				Rookmap.remove(inm);
				Kingmap.remove(inm);
				Queenmap.remove(inm);
				Phonmap.remove(inm);
				Knightmap.remove(inm);
				Bishopmap.remove(in);
				Bishopmap.put(inm,selectOb);
			}
			if(Rookmap.containsValue(selectOb))	{
				Bishopmap.remove(inm);
				Rookmap.remove(inm);
				Kingmap.remove(inm);
				Queenmap.remove(inm);
				Phonmap.remove(inm);
				Knightmap.remove(inm);
				Rookmap.remove(in);
				Rookmap.put(inm,selectOb);
			}		
			if(Kingmap.containsValue(selectOb))	{
				Bishopmap.remove(inm);
				Rookmap.remove(inm);
				Kingmap.remove(inm);
				Queenmap.remove(inm);
				Phonmap.remove(inm);
				Knightmap.remove(inm);
				Kingmap.remove(in);
				Kingmap.put(inm,selectOb);
			}		
			if(Queenmap.containsValue(selectOb))	{
				Bishopmap.remove(inm);
				Rookmap.remove(inm);
				Kingmap.remove(inm);
				Queenmap.remove(inm);
				Phonmap.remove(inm);
				Knightmap.remove(inm);
				Queenmap.remove(in);
				Queenmap.put(inm,selectOb);
			}		
			if(Phonmap.containsValue(selectOb))	{
				Bishopmap.remove(inm);
				Rookmap.remove(inm);
				Kingmap.remove(inm);
				Queenmap.remove(inm);
				Phonmap.remove(inm);
				Knightmap.remove(inm);
				Phonmap.remove(in);
				Phonmap.put(inm,selectOb);
			}		
			if(Knightmap.containsValue(selectOb))	{
				Bishopmap.remove(inm);
				Rookmap.remove(inm);
				Kingmap.remove(inm);
				Queenmap.remove(inm);
				Phonmap.remove(inm);
				Knightmap.remove(inm);
				Knightmap.remove(in);
				Knightmap.put(inm,selectOb);
			}
			
			board[8-(selectOb.getY())][selectOb.getX()-1][0]=selectOb.getColor();
			board[8-(selectOb.getY())][selectOb.getX()-1][1]=selectOb.getType();
			board[8-(selectOb.getY())][selectOb.getX()-1][2]=' ';
			
			for(int a=0;a<8;a++) {
				for(int b=0;b<8;b++) {
					board[a][b][2]=' ';
				}
			}
		}
		if(selectOb.getColor()=='w') finalturn='w';
		else finalturn='b';
		
	}
	
	public void printBoard(boolean withFile) throws IOException {
		
		
		final String ANSI_RESET = "\033[0m";
		final String ANSI_FG_BLACK = "\033[30m";
		final String ANSI_FG_WHITE = "\033[37m";
		final String ANSI_BG_BLACK = "\033[40m";
		final String ANSI_BG_WHITE = "\033[47m";
		
		if(withFile)	{
			
			w.write("   a  b  c  d  e  f  g  h \n");
			
			for(int i = 0; i < 8; i++) {
				w.write(8-i + " ");
				for (int j = 0; j < 8; j++) {
					if(isBlackSquare(i, j)) {
						// Black background, white character
						
						w.write(ANSI_BG_BLACK + ANSI_FG_WHITE
								+ board[i][j][0]
								+ board[i][j][1]
								+ board[i][j][2]
								+ ANSI_RESET + ANSI_RESET);
					} else {
						/// White background, black character
						w.write(ANSI_BG_WHITE + ANSI_FG_BLACK
								+ board[i][j][0]
								+ board[i][j][1]
								+ board[i][j][2]
								+ ANSI_RESET + ANSI_RESET);
					}
				}
				w.write('\n');
				
				
			}
			System.out.println("   a  b  c  d  e  f  g  h \n");
			for(int i = 0; i < 8; i++) {
				System.out.print(8-i + " ");
				for (int j = 0; j < 8; j++) {
					if(isBlackSquare(i, j)) {
						// Black background, white character
						
						System.out.print(ANSI_BG_BLACK + ANSI_FG_WHITE
								+ board[i][j][0]
								+ board[i][j][1]
								+ board[i][j][2]
								+ ANSI_RESET + ANSI_RESET);
					} else {
						/// White background, black character
						System.out.print(ANSI_BG_WHITE + ANSI_FG_BLACK
								+ board[i][j][0]
								+ board[i][j][1]
								+ board[i][j][2]
								+ ANSI_RESET + ANSI_RESET);
					}
				}
				System.out.print('\n');
			}
		}
		
		else {
			System.out.println("   a  b  c  d  e  f  g  h \n");
			for(int i = 0; i < 8; i++) {
				System.out.print(8-i + " ");
				for (int j = 0; j < 8; j++) {
					if(isBlackSquare(i, j)) {
						// Black background, white character
						
						System.out.print(ANSI_BG_BLACK + ANSI_FG_WHITE
								+ board[i][j][0]
								+ board[i][j][1]
								+ board[i][j][2]
								+ ANSI_RESET + ANSI_RESET);
					} else {
						/// White background, black character
						System.out.print(ANSI_BG_WHITE + ANSI_FG_BLACK
								+ board[i][j][0]
								+ board[i][j][1]
								+ board[i][j][2]
								+ ANSI_RESET + ANSI_RESET);
					}
				}
				System.out.print('\n');
			}
		}
		
	}
	
	Boolean isBlackSquare(int i,int j)	{
		if((i+j)%2==0) return false;
		else return true;
	}
}
