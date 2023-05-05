package com.Game.Chess;

import java.util.List;
import com.Game.Chess.Model.board.Coordinates;
import com.Game.Chess.Model.game.GenerateLegalMoves;
import com.Game.Chess.Model.piece.*;
import com.Game.Chess.ResourceRepresentationClasses.BoardConfig;
import com.Game.Chess.ResourceRepresentationClasses.LegalMoves;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.Game.Chess.Model.board.Board;

@SpringBootApplication
public class ChessApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChessApplication.class, args);

		Board board1 = new Board();

		Pawn pawn1 = new Pawn(PieceColor.WHITE, "whiteEPawn");
		Pawn pawn2 = new Pawn(PieceColor.WHITE, "whiteAPawn");
		Pawn pawn3 = new Pawn(PieceColor.WHITE, "whiteHPawn");

		Pawn pawnB1 = new Pawn(PieceColor.BLACK, "blackEPawn");
		Pawn pawnB2 = new Pawn(PieceColor.BLACK, "blackAPawn");

		Knight knight = new Knight(PieceColor.WHITE, "whiteBKnight");

		Bishop whiteBishop = new Bishop(PieceColor.WHITE, "whiteCBishop");

		Bishop blackBishop = new Bishop(PieceColor.BLACK, "blackCBishop");

		Rook rook = new Rook(PieceColor.WHITE, "whiteARook");

		Queen queen = new Queen(PieceColor.BLACK, "blackQueen");

		board1.addPiece(pawn1, "e4");
		board1.addPiece(pawn2, "f5");
		board1.addPiece(pawn3, "d5");

		board1.addPiece(pawnB1, "f6");
		board1.addPiece(pawnB2, "d6");

		board1.addPiece(knight, "e5");

		board1.addPiece(whiteBishop, "c4");

		board1.addPiece(blackBishop, "f3");

		board1.addPiece(rook, "g4");

		board1.addPiece(queen, "g6");

		List<Coordinates> pawnList1 = pawn1.getMoves(board1);
		List<Coordinates> pawnList2 = pawn2.getMoves(board1);
		List<Coordinates> pawnList3 = pawn3.getMoves(board1);

		List<Coordinates> knightList = knight.getMoves(board1);

		List<Coordinates> whiteBishopList = whiteBishop.getMoves(board1);

		List<Coordinates> blackBishopList = blackBishop.getMoves(board1);

		List<Coordinates> rookList = rook.getMoves(board1);

		List<Coordinates> queenList = queen.getMoves(board1);
		System.out.println();
		board1.printBoard();

		/*
		 * System.out.println(pawnList1);
		 * System.out.println(pawnList2);
		 * System.out.println(pawnList3);
		 * 
		 * System.out.println(knightList);
		 * 
		 * System.out.println(whiteBishopList);
		 * 
		 * System.out.println(blackBishopList);
		 * 
		 * System.out.println(rookList);
		 * 
		 * System.out.println(queenList);
		 */
	}

}
