package com.Game.Chess.Model.game;

import com.Game.Chess.Model.board.Board;
import com.Game.Chess.Model.board.Square;
import com.Game.Chess.ResourceRepresentationClasses.BoardConfig;
import com.Game.Chess.ResourceRepresentationClasses.LegalMoves;

public class GenerateLegalMoves {

    public static LegalMoves generateLegalMoves(BoardConfig boardConfig) {

        // Create board
        Board board = new Board(boardConfig);

        // Access board's boardArray
        Square[][] boardArr = board.boardArray;

        // Loop through boardArray and access square and piece on square
        for (int i = 0; i < boardArr.length; i++) {
            for (Square square : boardArr[i]) {
                Piece piece;
                ArrayList pieceMoves;

                piece = square.getPieceOnSquare();
                pieceMoves = piece.getMoves(board);

            }
        }

        // Create new LegalMoves object
        LegalMoves legalMoves;

        // Return LegalMoves object
        return legalMoves;
    }

}
