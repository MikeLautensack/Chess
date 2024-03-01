package com.Game.Chess.Model.Game;

import org.junit.jupiter.api.Test;

import com.Game.Chess.Model.game.GenerateLegalMoves;
import com.Game.Chess.ResourceRepresentationClasses.BoardConfig;
import com.Game.Chess.ResourceRepresentationClasses.LegalMoves;

public class GenerateLegalMovesTest {
    @Test
    void testGenerateLegalMoves() {
        BoardConfig bc = new BoardConfig("blackARook", "blackBKnight", "blackCBishop", "blackQueen", "blackKing",
                "blackFBishop", "blackGKnight", "blackHRook", "blackAPawn", "blackBPawn", "blackCPawn", "blackDPawn",
                "blackEPawn", "blackFPawn", "blackGPawn", "blackHPawn", "", "", "", "", "", "", "", "", "", "", "", "",
                "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "whiteAPawn",
                "whiteBPawn", "whiteCPawn", "whiteDPawn", "whiteEPawn", "whiteFPawn", "whiteGPawn", "whiteHPawn",
                "whiteARook", "whiteBKnight", "whiteCBishop", "whiteQueen", "whiteKing", "whiteFBishop", "whiteGKnight",
                "whiteHRook");
        LegalMoves lm = GenerateLegalMoves.generateLegalMoves(bc);
        System.out.println(lm.toString());
    }
}
