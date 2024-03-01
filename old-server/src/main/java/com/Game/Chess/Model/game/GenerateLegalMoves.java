package com.Game.Chess.Model.game;

import java.util.*;

import com.Game.Chess.Model.board.Board;
import com.Game.Chess.Model.board.Coordinates;
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
            for (Square square : boardArr[i]) {
                Piece piece = square.getPieceOnSquare();
                if (piece != null) {
                    pieces.add(piece);
                }
            }
        }

        // Loop through pieces and run getMoves() on each piece
        // then add the list returned from getMoves() to a map with piece id as its key
        Map<String, String[]> map = new HashMap<>();
        for (int i = 0; i < pieces.size(); i++) {
            Piece piece = pieces.get(i);
            List<Coordinates> pieceMoves = piece.getMoves(board);
            List<String> stringMoves = new ArrayList<>();
            for (int j = 0; j < pieceMoves.size(); j++) {
                Coordinates coordinate = pieceMoves.get(j);
                String coordinateString = coordinate.getID();
                stringMoves.add(coordinateString);
            }
            String[] arr = stringMoves.toArray(new String[0]);
            map.put(piece.getId(), arr);
        }

        // Build LegalMoves object
        LegalMoves lm = new LegalMoves(map.get("blackAPawn"), map.get("blackARook"), map.get("blackBKnight"),
                map.get("blackBPawn"), map.get("blackCBishop"),
                map.get("blackCPawn"), map.get("blackDPawn"), map.get("blackEPawn"), map.get("blackFBishop"),
                map.get("blackFPawn"), map.get("blackGKnight"),
                map.get("blackGPawn"), map.get("blackHPawn"), map.get("blackHRook"), map.get("blackKing"),
                map.get("blackQueen"), map.get("promotionBishopA"),
                map.get("promotionBishopB"), map.get("promotionBishopC"), map.get("promotionBishopD"),
                map.get("promotionBishopE"), map.get("promotionBishopF"),
                map.get("promotionBishopG"), map.get("promotionBishopH"), map.get("promotionKnightA"),
                map.get("promotionKnightB"), map.get("promotionKnightC"),
                map.get("promotionKnightD"), map.get("promotionKnightE"), map.get("promotionKnightF"),
                map.get("promotionKnightG"), map.get("promotionKnightH"), map.get("promotionQueenA"),
                map.get("promotionQueenB"), map.get("promotionQueenC"), map.get("promotionQueenD"),
                map.get("promotionQueenE"),
                map.get("promotionQueenF"), map.get("promotionQueenG"), map.get("promotionQueenH"),
                map.get("promotionRookA"), map.get("promotionRookB"), map.get("promotionRookC"),
                map.get("promotionRookD"), map.get("promotionRookE"), map.get("promotionRookF"),
                map.get("promotionRookG"), map.get("promotionRookH"), map.get("whiteAPawn"),
                map.get("whiteARook"), map.get("whiteBKnight"), map.get("whiteBPawn"), map.get("whiteCBishop"),
                map.get("whiteCPawn"), map.get("whiteDPawn"), map.get("whiteEPawn"), map.get("whiteFBishop"),
                map.get("whiteFPawn"), map.get("whiteGKnight"), map.get("whiteGPawn"), map.get("whiteHPawn"),
                map.get("whiteHRook"), map.get("whiteKing"), map.get("whiteQueen"));

        // Return LegalMoves object
        return lm;
    }

}
