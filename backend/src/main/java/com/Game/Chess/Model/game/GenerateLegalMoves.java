package com.Game.Chess.Model.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     
     // Loop through pieces and run getMoves() on each piece
     // then add the list returned from getMoves() to a map with piece id as its
     key
     Map<String, List<String>> map = new HashMap<>();
     for (int i = 0; i < pieces.length; i++) {
     Piece piece = pieces.get(i);
     List<Square> pieceMoves = piece.getMoves(board);
     List<String> stringMoves = new ArrayList<>();
     for (int j = 0; j < pieceMoves.length; j++) {
     Square square = pieceMoves.get(j);
     String squareID = square.getSquareCoordinate().getCoordinate();
     stringMoves.add(squareID);
     }
     map.put(piece.getId(), stringMoves);
     }
     
     // Build LegalMoves object
     LegalMoves legalMoves = new LegalMoves.LegalMovesBuilder()
     .BlackAPawn(map.get("blackAPawn"))
     .BlackARook(map.get("blackARook"))
     .BlackBKnight(map.get("blackBKnight"))
     .BlackBPawn(map.get("blackBPawn"))
     .BlackCBishop(map.get("blackCBishop"))
     .BlackCPawn(map.get("blackCPawn"))
     .BlackDPawn(map.get("blackDPawn"))
     .BlackEPawn(map.get("blackEPawn"))
     .BlackFBishop(map.get("blackFBishop"))
     .BlackFPawn(map.get("blackFPawn"))
     .BlackGKnight(map.get("blackGKnight"))
     .BlackGPawn(map.get("blackGPawn"))
     .BlackHPawn(map.get("blackHPawn"))
     .BlackHRook(map.get("blackHRook"))
     .BlackKing(map.get("blackKing"))
     .BlackQueen(map.get("blackQueen"))
     .PromotionBishopA(map.get("promotionBishopA"))
     .PromotionBishopB(map.get("promotionBishopB"))
     .PromotionBishopC(map.get("promotionBishopC"))
     .PromotionBishopD(map.get("promotionBishopD"))
     .PromotionBishopE(map.get("promotionBishopE"))
     .PromotionBishopF(map.get("promotionBishopF"))
     .PromotionBishopG(map.get("promotionBishopG"))
     .PromotionBishopH(map.get("promotionBishopH"))
     .PromotionKnightA(map.get("promotionKnightA"))
     .PromotionKnightB(map.get("promotionKnightB"))
     .PromotionKnightC(map.get("promotionKnightC"))
     .PromotionKnightD(map.get("promotionKnightD"))
     .PromotionKnightE(map.get("promotionKnightE"))
     .PromotionKnightF(map.get("promotionKnightF"))
     .PromotionKnightG(map.get("promotionKnightG"))
     .PromotionKnightH(map.get("promotionKnightH"))
     .PromotionQueenA(map.get("promotionQueenA"))
     .PromotionQueenB(map.get("promotionQueenB"))
     .PromotionQueenC(map.get("promotionQueenC"))
     .PromotionQueenD(map.get("promotionQueenD"))
     .PromotionQueenE(map.get("promotionQueenE"))
     .PromotionQueenF(map.get("promotionQueenF"))
     .PromotionQueenG(map.get("promotionQueenG"))
     .PromotionQueenH(map.get("promotionQueenH"))
     .PromotionRookA(map.get("promotionRookA"))
     .PromotionRookB(map.get("promotionRookB"))
     .PromotionRookC(map.get("promotionRookC"))
     .PromotionRookD(map.get("promotionRookD"))
     .PromotionRookE(map.get("promotionRookE"))
     .PromotionRookF(map.get("promotionRookF"))
     .PromotionRookG(map.get("promotionRookG"))
     .PromotionRookH(map.get("promotionRookH"))
     .whiteAPawn(map.get("whiteAPawn"))
     .whiteARook(map.get("whiteARook"))
     .whiteBKnight(map.get("whiteBKnight"))
     .whiteBPawn(map.get("whiteBPawn"))
     .whiteCBishop(map.get("whiteCBishop"))
     .whiteCPawn(map.get("whiteCPawn"))
     .whiteDPawn(map.get("whiteDPawn"))
     .whiteEPawn(map.get("whiteEPawn"))
     .whiteFBishop(map.get("whiteFBishop"))
     .whiteFPawn(map.get("whiteFPawn"))
     .whiteGKnight(map.get("whiteGKnight"))
     .whiteGPawn(map.get("whiteGPawn"))
     .whiteHPawn(map.get("whiteHPawn"))
     .whiteHRook(map.get("whiteHRook"))
     .whiteKing(map.get("whiteKing"))
     .whiteQueen(map.get("whiteQueen"))
     .build();
     
     // Return LegalMoves object
     return legalMoves;
    }

}
