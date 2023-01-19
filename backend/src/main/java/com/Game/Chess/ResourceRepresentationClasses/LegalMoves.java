package com.Game.Chess.ResourceRepresentationClasses;

import java.util.ArrayList;
import java.util.HashMap;

import com.Game.Chess.Model.piece.Piece;

public class LegalMoves {

    private String[] blackAPawn;
    private String[] blackARook;
    private String[] blackBKnight;
    private String[] blackBPawn;
    private String[] blackCBishop;
    private String[] blackCPawn;
    private String[] blackDPawn;
    private String[] blackEPawn;
    private String[] blackFBishop;
    private String[] blackFPawn;
    private String[] blackGKnight;
    private String[] blackGPawn;
    private String[] blackHPawn;
    private String[] blackHRook;
    private String[] blackKing;
    private String[] blackQueen;
    private String[] promotionBishopA;
    private String[] promotionBishopB;
    private String[] promotionBishopC;
    private String[] promotionBishopD;
    private String[] promotionBishopE;
    private String[] promotionBishopF;
    private String[] promotionBishopG;
    private String[] promotionBishopH;
    private String[] promotionKnightA;
    private String[] promotionKnightB;
    private String[] promotionKnightC;
    private String[] promotionKnightD;
    private String[] promotionKnightE;
    private String[] promotionKnightF;
    private String[] promotionKnightG;
    private String[] promotionKnightH;
    private String[] promotionQueenA;
    private String[] promotionQueenB;
    private String[] promotionQueenC;
    private String[] promotionQueenD;
    private String[] promotionQueenE;
    private String[] promotionQueenF;
    private String[] promotionQueenG;
    private String[] promotionQueenH;
    private String[] promotionRookA;
    private String[] promotionRookB;
    private String[] promotionRookC;
    private String[] promotionRookD;
    private String[] promotionRookE;
    private String[] promotionRookF;
    private String[] promotionRookG;
    private String[] promotionRookH;
    private String[] whiteAPawn;
    private String[] whiteARook;
    private String[] whiteBKnight;
    private String[] whiteBPawn;
    private String[] whiteCBishop;
    private String[] whiteCPawn;
    private String[] whiteDPawn;
    private String[] whiteEPawn;
    private String[] whiteFBishop;
    private String[] whiteFPawn;
    private String[] whiteGKnight;
    private String[] whiteGPawn;
    private String[] whiteHPawn;
    private String[] whiteHRook;
    private String[] whiteKing;
    private String[] whiteQueen;

    private LegalMoves(LegalMovesBuilder builder) {

    }

    public String[] getBlackAPawn() {
        return blackAPawn;
    }

    public String[] getBlackARook() {
        return blackARook;
    }

    public String[] getBlackBKnight() {
        return blackBKnight;
    }

    public String[] getBlackBPawn() {
        return blackBPawn;
    }

    public String[] getBlackCBishop() {
        return blackCBishop;
    }

    public String[] getBlackCPawn() {
        return blackCPawn;
    }

    public String[] getBlackDPawn() {
        return blackDPawn;
    }

    public String[] getBlackEPawn() {
        return blackEPawn;
    }

    public String[] getBlackFBishop() {
        return blackFBishop;
    }

    public String[] getBlackFPawn() {
        return blackFPawn;
    }

    public String[] getBlackGKnight() {
        return blackGKnight;
    }

    public String[] getBlackGPawn() {
        return blackGPawn;
    }

    public String[] getBlackHPawn() {
        return blackHPawn;
    }

    public String[] getBlackHRook() {
        return blackHRook;
    }

    public String[] getBlackKing() {
        return blackKing;
    }

    public String[] getBlackQueen() {
        return blackQueen;
    }

    public String[] getPromotionBishopA() {
        return promotionBishopA;
    }

    public String[] getPromotionBishopB() {
        return promotionBishopB;
    }

    public String[] getPromotionBishopC() {
        return promotionBishopC;
    }

    public String[] getPromotionBishopD() {
        return promotionBishopD;
    }

    public String[] getPromotionBishopE() {
        return promotionBishopE;
    }

    public String[] getPromotionBishopF() {
        return promotionBishopF;
    }

    public String[] getPromotionBishopG() {
        return promotionBishopG;
    }

    public String[] getPromotionBishopH() {
        return promotionBishopH;
    }

    public String[] getPromotionKnightA() {
        return promotionKnightA;
    }

    public String[] getPromotionKnightB() {
        return promotionKnightB;
    }

    public String[] getPromotionKnightC() {
        return promotionKnightC;
    }

    public String[] getPromotionKnightD() {
        return promotionKnightD;
    }

    public String[] getPromotionKnightE() {
        return promotionKnightE;
    }

    public String[] getPromotionKnightF() {
        return promotionKnightF;
    }

    public String[] getPromotionKnightG() {
        return promotionKnightG;
    }

    public String[] getPromotionKnightH() {
        return promotionKnightH;
    }

    public String[] getPromotionQueenA() {
        return promotionQueenA;
    }

    public String[] getPromotionQueenB() {
        return promotionQueenB;
    }

    public String[] getPromotionQueenC() {
        return promotionQueenC;
    }

    public String[] getPromotionQueenD() {
        return promotionQueenD;
    }

    public String[] getPromotionQueenE() {
        return promotionQueenE;
    }

    public String[] getPromotionQueenF() {
        return promotionQueenF;
    }

    public String[] getPromotionQueenG() {
        return promotionQueenG;
    }

    public String[] getPromotionQueenH() {
        return promotionQueenH;
    }

    public String[] getPromotionRookA() {
        return promotionRookA;
    }

    public String[] getPromotionRookB() {
        return promotionRookB;
    }

    public String[] getPromotionRookC() {
        return promotionRookC;
    }

    public String[] getPromotionRookD() {
        return promotionRookD;
    }

    public String[] getPromotionRookE() {
        return promotionRookE;
    }

    public String[] getPromotionRookF() {
        return promotionRookF;
    }

    public String[] getPromotionRookG() {
        return promotionRookG;
    }

    public String[] getPromotionRookH() {
        return promotionRookH;
    }

    public String[] getWhiteAPawn() {
        return whiteAPawn;
    }

    public String[] getWhiteARook() {
        return whiteARook;
    }

    public String[] getWhiteBKnight() {
        return whiteBKnight;
    }

    public String[] getWhiteBPawn() {
        return whiteBPawn;
    }

    public String[] getWhiteCBishop() {
        return whiteCBishop;
    }

    public String[] getWhiteCPawn() {
        return whiteCPawn;
    }

    public String[] getWhiteDPawn() {
        return whiteDPawn;
    }

    public String[] getWhiteEPawn() {
        return whiteEPawn;
    }

    public String[] getWhiteFBishop() {
        return whiteFBishop;
    }

    public String[] getWhiteFPawn() {
        return whiteFPawn;
    }

    public String[] getWhiteGKnight() {
        return whiteGKnight;
    }

    public String[] getWhiteGPawn() {
        return whiteGPawn;
    }

    public String[] getWhiteHPawn() {
        return whiteHPawn;
    }

    public String[] getWhiteHRook() {
        return whiteHRook;
    }

    public String[] getWhiteKing() {
        return whiteKing;
    }

    public String[] getWhiteQueen() {
        return whiteQueen;
    }

    public static class LegalMovesBuilder {

        String[] blackAPawn;
        String[] blackARook;
        String[] blackBKnight;
        String[] blackBPawn;
        String[] blackCBishop;
        String[] blackCPawn;
        String[] blackDPawn;
        String[] blackEPawn;
        String[] blackFBishop;
        String[] blackFPawn;
        String[] blackGKnight;
        String[] blackGPawn;
        String[] blackHPawn;
        String[] blackHRook;
        String[] blackKing;
        String[] blackQueen;
        String[] promotionBishopA;
        String[] promotionBishopB;
        String[] promotionBishopC;
        String[] promotionBishopD;
        String[] promotionBishopE;
        String[] promotionBishopF;
        String[] promotionBishopG;
        String[] promotionBishopH;
        String[] promotionKnightA;
        String[] promotionKnightB;
        String[] promotionKnightC;
        String[] promotionKnightD;
        String[] promotionKnightE;
        String[] promotionKnightF;
        String[] promotionKnightG;
        String[] promotionKnightH;
        String[] promotionQueenA;
        String[] promotionQueenB;
        String[] promotionQueenC;
        String[] promotionQueenD;
        String[] promotionQueenE;
        String[] promotionQueenF;
        String[] promotionQueenG;
        String[] promotionQueenH;
        String[] promotionRookA;
        String[] promotionRookB;
        String[] promotionRookC;
        String[] promotionRookD;
        String[] promotionRookE;
        String[] promotionRookF;
        String[] promotionRookG;
        String[] promotionRookH;
        String[] whiteAPawn;
        String[] whiteARook;
        String[] whiteBKnight;
        String[] whiteBPawn;
        String[] whiteCBishop;
        String[] whiteCPawn;
        String[] whiteDPawn;
        String[] whiteEPawn;
        String[] whiteFBishop;
        String[] whiteFPawn;
        String[] whiteGKnight;
        String[] whiteGPawn;
        String[] whiteHPawn;
        String[] whiteHRook;
        String[] whiteKing;
        String[] whiteQueen;

        public LegalMoves BlackAPawn(String[] blackAPawn) {
            this.blackAPawn = blackAPawn;
            return this;
        }

        public LegalMoves BlackARook(String[] blackARook) {
            this.blackARook = blackARook;
            return this;
        }

        public LegalMoves BlackBKnight(String[] blackBKnight) {
            this.blackBKnight = blackBKnight;
            return this;
        }

        public LegalMoves BlackBPawn(String[] blackBPawn) {
            this.blackBPawn = blackBPawn;
            return this;
        }

        public LegalMoves BlackCBishop(String[] blackCBishop) {
            this.blackCBishop = blackCBishop;
            return this;
        }

        public LegalMoves BlackCPawn(String[] blackCPawn) {
            this.blackCPawn = blackCPawn;
            return this;
        }

        public LegalMoves BlackDPawn(String[] blackDPawn) {
            this.blackDPawn = blackDPawn;
            return this;
        }

        public LegalMoves BlackEPawn(String[] blackEPawn) {
            this.blackEPawn = blackEPawn;
            return this;
        }

        public LegalMoves BlackFBishop(String[] blackFBishop) {
            this.blackFBishop = blackFBishop;
            return this;
        }

        public LegalMoves BlackFPawn(String[] blackFPawn) {
            this.blackFPawn = blackFPawn;
            return this;
        }

        public LegalMoves BlackGKnight(String[] blackGKnight) {
            this.blackGKnight = blackGKnight;
            return this;
        }

        public LegalMoves BlackGPawn(String[] blackGPawn) {
            this.blackGPawn = blackGPawn;
            return this;
        }

        public LegalMoves BlackHPawn(String[] blackHPawn) {
            this.blackHPawn = blackHPawn;
            return this;
        }

        public LegalMoves BlackHRook(String[] blackHRook) {
            this.blackHRook = blackHRook;
            return this;
        }

        public LegalMoves BlackKing(String[] blackKing) {
            this.blackKing = blackKing;
            return this;
        }

        public LegalMoves BlackQueen(String[] blackQueen) {
            this.blackQueen = blackQueen;
            return this;
        }

        public LegalMoves PromotionBishopA(String[] promotionBishopA) {
            this.promotionBishopA = promotionBishopA;
            return this;
        }

        public LegalMoves PromotionBishopB(String[] promotionBishopB) {
            this.promotionBishopB = promotionBishopB;
            return this;
        }

        public LegalMoves PromotionBishopC(String[] promotionBishopC) {
            this.promotionBishopC = promotionBishopC;
            return this;
        }

        public LegalMoves PromotionBishopD(String[] promotionBishopD) {
            this.promotionBishopD = promotionBishopD;
            return this;
        }

        public LegalMoves PromotionBishopE(String[] promotionBishopE) {
            this.promotionBishopE = promotionBishopE;
            return this;
        }

        public LegalMoves PromotionBishopF(String[] promotionBishopF) {
            this.promotionBishopF = promotionBishopF;
            return this;
        }

        public LegalMoves PromotionBishopG(String[] promotionBishopG) {
            this.promotionBishopG = promotionBishopG;
            return this;
        }

        public LegalMoves PromotionBishopH(String[] promotionBishopH) {
            this.promotionBishopH = promotionBishopH;
            return this;
        }

        public LegalMoves PromotionKnightA(String[] promotionKnightA) {
            this.promotionKnightA = promotionKnightA;
            return this;
        }

        public LegalMoves PromotionKnightB(String[] promotionKnightB) {
            this.promotionKnightB = promotionKnightB;
            return this;
        }

        public LegalMoves PromotionKnightC(String[] promotionKnightC) {
            this.promotionKnightC = promotionKnightC;
            return this;
        }

        public LegalMoves PromotionKnightD(String[] promotionKnightD) {
            this.promotionKnightD = promotionKnightD;
            return this;
        }

        public LegalMoves PromotionKnightE(String[] promotionKnightE) {
            this.promotionKnightE = promotionKnightE;
            return this;
        }

        public LegalMoves PromotionKnightF(String[] promotionKnightF) {
            this.promotionKnightF = promotionKnightF;
            return this;
        }

        public LegalMoves PromotionKnightG(String[] promotionKnightG) {
            this.promotionKnightG = promotionKnightG;
            return this;
        }

        public LegalMoves PromotionKnightH(String[] promotionKnightH) {
            this.promotionKnightH = promotionKnightH;
            return this;
        }

        public LegalMoves PromotionQueenA(String[] promotionQueenA) {
            this.promotionQueenA = promotionQueenA;
            return this;
        }

        public LegalMoves PromotionQueenB(String[] promotionQueenB) {
            this.promotionQueenB = promotionQueenB;
            return this;
        }

        public LegalMoves PromotionQueenC(String[] promotionQueenC) {
            this.promotionQueenC = promotionQueenC;
            return this;
        }

        public LegalMoves PromotionQueenD(String[] promotionQueenD) {
            this.promotionQueenD = promotionQueenD;
            return this;
        }

        public LegalMoves PromotionQueenE(String[] promotionQueenE) {
            this.promotionQueenE = promotionQueenE;
            return this;
        }

        public LegalMoves PromotionQueenF(String[] promotionQueenF) {
            this.promotionQueenF = promotionQueenF;
            return this;
        }

        public LegalMoves PromotionQueenG(String[] promotionQueenG) {
            this.promotionQueenG = promotionQueenG;
            return this;
        }

        public LegalMoves PromotionQueenH(String[] promotionQueenH) {
            this.promotionQueenH = promotionQueenH;
            return this;
        }

        public LegalMoves PromotionRookA(String[] promotionRookA) {
            this.promotionRookA = promotionRookA;
            return this;
        }

        public LegalMoves PromotionRookB(String[] promotionRookB) {
            this.promotionRookB = promotionRookB;
            return this;
        }

        public LegalMoves PromotionRookC(String[] promotionRookC) {
            this.promotionRookC = promotionRookC;
            return this;
        }

        public LegalMoves PromotionRookD(String[] promotionRookD) {
            this.promotionRookD = promotionRookD;
            return this;
        }

        public LegalMoves PromotionRookE(String[] promotionRookE) {
            this.promotionRookE = promotionRookE;
            return this;
        }

        public LegalMoves PromotionRookF(String[] promotionRookF) {
            this.promotionRookF = promotionRookF;
            return this;
        }

        public LegalMoves PromotionRookG(String[] promotionRookG) {
            this.promotionRookG = promotionRookG;
            return this;
        }

        public LegalMoves PromotionRookH(String[] promotionRookH) {
            this.promotionRookH = promotionRookH;
            return this;
        }

        public LegalMoves WhiteAPawn(String[] whiteAPawn) {
            this.whiteAPawn = whiteAPawn;
            return this;
        }

        public LegalMoves WhiteARook(String[] whiteARook) {
            this.whiteARook = whiteARook;
            return this;
        }

        public LegalMoves WhiteBKnight(String[] whiteBKnight) {
            this.whiteBKnight = whiteBKnight;
            return this;
        }

        public LegalMoves WhiteBPawn(String[] whiteBPawn) {
            this.whiteBPawn = whiteBPawn;
            return this;
        }

        public LegalMoves WhiteCBishop(String[] whiteCBishop) {
            this.whiteCBishop = whiteCBishop;
            return this;
        }

        public LegalMoves WhiteCPawn(String[] whiteCPawn) {
            this.whiteCPawn = whiteCPawn;
            return this;
        }

        public LegalMoves WhiteDPawn(String[] whiteDPawn) {
            this.whiteDPawn = whiteDPawn;
            return this;
        }

        public LegalMoves WhiteEPawn(String[] whiteEPawn) {
            this.whiteEPawn = whiteEPawn;
            return this;
        }

        public LegalMoves WhiteFBishop(String[] whiteFBishop) {
            this.whiteFBishop = whiteFBishop;
            return this;
        }

        public LegalMoves WhiteFPawn(String[] whiteFPawn) {
            this.whiteFPawn = whiteFPawn;
            return this;
        }

        public LegalMoves WhiteGKnight(String[] whiteGKnight) {
            this.whiteGKnight = whiteGKnight;
            return this;
        }

        public LegalMoves WhiteGPawn(String[] whiteGPawn) {
            this.whiteGPawn = whiteGPawn;
            return this;
        }

        public LegalMoves WhiteHPawn(String[] whiteHPawn) {
            this.whiteHPawn = whiteHPawn;
            return this;
        }

        public LegalMoves WhiteHRook(String[] whiteHRook) {
            this.whiteHRook = whiteHRook;
            return this;
        }

        public LegalMoves WhiteKing(String[] whiteKing) {
            this.whiteKing = whiteKing;
            return this;
        }

        public LegalMoves WhiteQueen(String[] whiteQueen) {
            this.whiteQueen = whiteQueen;
            return this;
        }

        public LegalMoves build() {
            return new LegalMoves(this);
        }

    }

}