package test.java.com.Game.Chess.Model.ResourceRepTests;

import java.util.ArrayList;
import java.util.List;

public class LegalMovesTest {

    public static void main(String[] args) {

        List<String> test = new ArrayList<>();
        test.add("whiteKing");
        test.add("whiteQueen");
        test.add("whiteHRook");
        test.add("whiteARook");
        test.add("whiteFBishop");
        test.add("whiteCBishop");
        test.add("whiteGKnight");
        test.add("whiteBKnight");
        test.add("whiteAPawn");
        test.add("whiteBPawn");
        test.add("whiteCPawn");
        test.add("whiteDPawn");
        test.add("whiteEPawn");
        test.add("whiteFPawn");
        test.add("whiteGPawn");
        test.add("whiteHPawn");
        test.add("blackAPawn");
        test.add("blackBPawn");
        test.add("blackCPawn");
        test.add("blackDPawn");
        test.add("blackEPawn");
        test.add("blackFPawn");
        test.add("blackGPawn");
        test.add("blackHPawn");
        test.add("blackKing");
        test.add("blackQueen");
        test.add("blackHRook");
        test.add("blackARook");
        test.add("blackFBishop");
        test.add("blackCBishop");
        test.add("blackGKnight");
        test.add("blackBKnight");
        test.add("promotionQueenA");
        test.add("promotionQueenB");
        test.add("promotionQueenC");
        test.add("promotionQueenD");
        test.add("promotionQueenE");
        test.add("promotionQueenF");
        test.add("promotionQueenG");
        test.add("promotionQueenH");
        test.add("promotionRookA");
        test.add("promotionRookB");
        test.add("promotionRookC");
        test.add("promotionRookD");
        test.add("promotionRookE");
        test.add("promotionRookF");
        test.add("promotionRookG");
        test.add("promotionRookH");
        test.add("promotionBishopA");
        test.add("promotionBishopB");
        test.add("promotionBishopC");
        test.add("promotionBishopD");
        test.add("promotionBishopE");
        test.add("promotionBishopF");
        test.add("promotionBishopG");
        test.add("promotionBishopH");
        test.add("promotionKnightA");
        test.add("promotionKnightB");
        test.add("promotionKnightC");
        test.add("promotionKnightD");
        test.add("promotionKnightE");
        test.add("promotionKnightF");
        test.add("promotionKnightG");
        test.add("promotionKnightH");

        List<String> sortedTest = test.sort();
        System.out.println(sortedTest);

    }

}
