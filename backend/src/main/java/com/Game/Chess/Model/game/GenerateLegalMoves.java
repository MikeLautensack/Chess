package com.Game.Chess.Model.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.Game.Chess.Model.board.Board;
import com.Game.Chess.Model.board.Square;
import com.Game.Chess.Model.piece.Piece;
import com.Game.Chess.ResourceRepresentationClasses.BoardConfig;
import com.Game.Chess.ResourceRepresentationClasses.LegalMoves;

public class GenerateLegalMoves {

    public static LegalMoves generateLegalMoves(BoardConfig boardConfig) {

        // Build board
        Board board = new Board(boardConfig);

        // Access board's boardArray
        Square[][] boardArr = board.getBoardArray();

        // Loop through boardArray and access square and piece
        // Add pieces to list
        List<Piece> pieces = new ArrayList<>();
        for (int i = 0; i < boardArr.length; i++) {
            Piece piece;
            for (Square square : boardArr[i]) {
                piece = square.getPieceOnSquare();
                pieces.add(piece);
            }
        }

        // Reorder pieces in pieces<> into orderedPieces<>
        List<Piece> orderedPieces = new ArrayList<>();
        orderedPieces = orderPieces(pieces);

        // Loop through orderedPieces and run getMoves() on each piece
        // then add the list returned from getMoves() to the legalSquaresList
        List<List<Square>> legalSquaresList = new ArrayList();
        for (int i = 0; i < orderedPieces.length; i++) {
            Piece piece = orderedPieces.get(i);
            List<Square> pieceMoves = piece.getMoves(board);
            legalSquaresList.add(pieceMoves);
        }

        // Build List<List<String>> from List<List<Square>>
        List<List<String>> legalStringList = new ArrayList<>();
        for (int i = 0; i < legalSquaresList.length; i++) {
            List<Square> squareList = legalSquaresList.get(i);
            List<String> stringList = new ArrayList<>();
            for (int j = 0; j < legalSquaresList.get(i).length; j++) {
                Square listSquare = squareList.get(j);
                String listSquareID = listSquare.getSquareCoordinate().getCoordinate();
                stringList.add(listSquareID);
            }
            legalStringList.add(stringList);
        }

        // Build LegalMoves object
        LegalMoves legalMoves = new LegalMoves.LegalMovesBuilder()
                .WhiteKing(legalStringList.get(0))
                .WhiteQueen(legalStringList.get(1))
                .WhiteKsRook(legalStringList.get(2))
                .WhiteQsRook(legalStringList.get(3))
                .WhiteLsBishop(legalStringList.get(4))
                .WhiteDsBishop(legalStringList.get(5))
                .WhiteKsKnight(legalStringList.get(6))
                .WhiteQsKnight(legalStringList.get(7))
                .WhiteAPawn(legalStringList.get(8))
                .WhiteBPawn(legalStringList.get(9))
                .WhiteCPawn(legalStringList.get(10))
                .WhiteDPawn(legalStringList.get(11))
                .WhiteEPawn(legalStringList.get(12))
                .WhiteFPawn(legalStringList.get(13))
                .WhiteGPawn(legalStringList.get(14))
                .WhiteHPawn(legalStringList.get(15))
                .BlackKing(legalStringList.get(16))
                .BlackQueen(legalStringList.get(17))
                .BlackKsRook(legalStringList.get(18))
                .BlackQsRook(legalStringList.get(19))
                .BlackLsBishop(legalStringList.get(20))
                .BlackDsBishop(legalStringList.get(21))
                .BlackKsKnight(legalStringList.get(22))
                .BlackQsKnight(legalStringList.get(23))
                .BlackAPawn(legalStringList.get(24))
                .BlackBPawn(legalStringList.get(25))
                .BlackCPawn(legalStringList.get(26))
                .BlackDPawn(legalStringList.get(27))
                .BlackEPawn(legalStringList.get(28))
                .BlackFPawn(legalStringList.get(29))
                .BlackGPawn(legalStringList.get(30))
                .BlackHPawn(legalStringList.get(31))
                .build();

        // Return LegalMoves object
        return legalMoves;
    }

    /*
     * 
     */

}
