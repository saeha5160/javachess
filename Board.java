public class Board {

	Board(boolean withFile) {
		/* Your code */
	}

	public boolean isFinish(boolean withFile) {
		/* Your code */
	}
	
	public void selectObject(boolean withFile) {
		/* Your code */
	}
	
	public void moveObject(boolean withFile) {
		/* Your code */
	}
	
	public void printBoard(boolean withFile) {
		/* Your code */

		/* Sample print sudo code */
		/*
		ANSI_RESET = "\033[0m";
		ANSI_FG_BLACK = "\033[30m";
		String ANSI_FG_WHITE = "\033[37m";
		String ANSI_BG_BLACK = "\033[40m";
		ANSI_BG_WHITE = "\033[47m";

		Print("   a  b  c  d  e  f  g  h \n");
		for(i = 0; i < 8; i++) {
			Print(8-i + " ");
			for (int j = 0; j < 8; j++) {
				if(isBlackSquare(i, j)) {
					// Black background, white character
					Print(ANSI_BG_BLACK + ANSI_FG_WHITE
							+ Piece Color
							+ Piece Type
							+ Possible Move Position
							+ ANSI_RESET + ANSI_RESET);
				} else {
					/// White background, black character
					Print(ANSI_BG_WHITE + ANSI_FG_BLACK
							+ Piece Color
							+ Piece Type
							+ Possible Move Position
							+ ANSI_RESET + ANSI_RESET);
				}
			}
			Print("\n");
		}
		*/
	}
}
