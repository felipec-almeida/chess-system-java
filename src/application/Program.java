package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
	
		ChessMatch match = new ChessMatch();
		UI.PrintBoard(match.getPieces());
		
	}

}
