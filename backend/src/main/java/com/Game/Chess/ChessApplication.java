package com.Game.Chess;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Game.Chess.Model.board.Board;
import com.Game.Chess.Model.game.GenerateLegalMoves;
import com.Game.Chess.ResourceRepresentationClasses.BoardConfig;
import com.Game.Chess.ResourceRepresentationClasses.LegalMoves;

@SpringBootApplication
public class ChessApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChessApplication.class, args);

		System.out.println();
		System.out.println();
		BoardConfig bc = new BoardConfig("blackARook", "blackBKnight", "blackCBishop", "blackQueen", "blackKing",
				"blackFBishop", "blackGKnight", "blackHRook", "blackAPawn", "blackBPawn", "blackCPawn", "blackDPawn",
				"blackEPawn", "blackFPawn", "blackGPawn", "blackHPawn", "", "", "", "", "", "", "", "", "", "", "", "",
				"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "whiteAPawn",
				"whiteBPawn", "whiteCPawn", "whiteDPawn", "whiteEPawn", "whiteFPawn", "whiteGPawn", "whiteHPawn",
				"whiteARook", "whiteBKnight", "whiteCBishop", "whiteQueen", "whiteKing", "whiteFBishop", "whiteGKnight",
				"whiteHRook");
		LegalMoves lm = GenerateLegalMoves.generateLegalMoves(bc);
		System.out.println(lm.toString());
		System.out.println();
		System.out.println();
		Board board = new Board(bc);
		board.printBoard();
		System.out.println();
		System.out.println();
		HashMap<String, String> map = BoardConfig.createConfigMap(bc);
		System.out.println(map);

	}

}
