package com.Game.Chess.Model.game;

import java.util.ArrayList;
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
        Square[][] boardArr = board.getBoardArray();

        // Create new LegalMoves object
        LegalMoves legalMoves;

        // Loop through boardArray and access square and piece on square
        for (int i = 0; i < boardArr.length; i++) {

            Piece piece;
            String[] pieceMoves;
            ArrayList<String[]> legalMovesArr = new ArrayList<>();

            for (Square square : boardArr[i]) {

                piece = square.getPieceOnSquare();
                pieceMoves = piece.getMoves(board);
                legalMovesArr.add(pieceMoves);

                legalMoves = new LegalMoves.LegalMovesBuilder()
                        .WhiteKing(null)
                        .WhiteQueen(null)
                        .WhiteKsRook(null)
                        .WhiteQsRook(null)
                        .WhiteLsBishop(null)
                        .WhiteDsBishop(null)
                        .WhiteKsKnight(null)
                        .WhiteQsKnight(null)
                        .WhiteAPawn(null)
                        .WhiteBPawn(null)
                        .WhiteCPawn(null)
                        .WhiteDPawn(null)
                        .WhiteEPawn(null)
                        .WhiteFPawn(null)
                        .WhiteGPawn(null)
                        .WhiteHPawn(null)
                        .BlackKing(null)
                        .BlackQueen(null)
                        .BlackKsRook(null)
                        .BlackQsRook(null)
                        .BlackLsBishop(null)
                        .BlackDsBishop(null)
                        .BlackKsKnight(null)
                        .BlackQsKnight(null)
                        .BlackAPawn(null)
                        .BlackBPawn(null)
                        .BlackCPawn(null)
                        .BlackDPawn(null)
                        .BlackEPawn(null)
                        .BlackFPawn(null)
                        .BlackGPawn(null)
                        .BlackHPawn(null)
                        .build();
            }
        }

        // Return LegalMoves object
        return legalMoves;
    }

}
