package com.Game.Chess.Model.game;

import java.util.HashMap;

import com.Game.Chess.Model.board.Board;
import com.Game.Chess.Model.board.Square;
import com.Game.Chess.Model.piece.Piece;
import com.Game.Chess.ResourceRepresentationClasses.BoardConfig;
import com.Game.Chess.ResourceRepresentationClasses.LegalMoves;

public class GenerateLegalMoves {

    public static LegalMoves generateLegalMoves(BoardConfig boardConfig) {

        // Create board
        Board board = new Board(boardConfig);

        // Access board's boardArray
        Square[][] boardArr = board.boardArray;

        // Create new LegalMoves object
        LegalMoves legalMoves;

        // Loop through boardArray and access square and piece on square
        for (int i = 0; i < boardArr.length; i++) {
            for (Square square : boardArr[i]) {
                Piece piece;
                String pieceID;
                ArrayList pieceMoves;
                HashMap<String, String[]> legalMovesMap;

                piece = square.getPieceOnSquare();
                pieceMoves = piece.getMoves(board);
                pieceID = piece.getId();
                legalMovesMap.put(pieceID, pieceMoves);
                legalMoves = createLegalMoves(legalMovesMap);
            }
        }

        // Return LegalMoves object
        return legalMoves;
    }

}
