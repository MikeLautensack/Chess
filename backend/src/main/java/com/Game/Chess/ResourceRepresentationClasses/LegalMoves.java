package com.Game.Chess.ResourceRepresentationClasses;

import java.util.Arrays;

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

    @Override
    public String toString() {
        return "LegalMoves [blackAPawn=" + Arrays.toString(blackAPawn) + ", blackARook=" + Arrays.toString(blackARook)
                + ", blackBKnight=" + Arrays.toString(blackBKnight) + ", blackBPawn=" + Arrays.toString(blackBPawn)
                + ", blackCBishop=" + Arrays.toString(blackCBishop) + ", blackCPawn=" + Arrays.toString(blackCPawn)
                + ", blackDPawn=" + Arrays.toString(blackDPawn) + ", blackEPawn=" + Arrays.toString(blackEPawn)
                + ", blackFBishop=" + Arrays.toString(blackFBishop) + ", blackFPawn=" + Arrays.toString(blackFPawn)
                + ", blackGKnight=" + Arrays.toString(blackGKnight) + ", blackGPawn=" + Arrays.toString(blackGPawn)
                + ", blackHPawn=" + Arrays.toString(blackHPawn) + ", blackHRook=" + Arrays.toString(blackHRook)
                + ", blackKing=" + Arrays.toString(blackKing) + ", blackQueen=" + Arrays.toString(blackQueen)
                + ", promotionBishopA=" + Arrays.toString(promotionBishopA) + ", promotionBishopB="
                + Arrays.toString(promotionBishopB) + ", promotionBishopC=" + Arrays.toString(promotionBishopC)
                + ", promotionBishopD=" + Arrays.toString(promotionBishopD) + ", promotionBishopE="
                + Arrays.toString(promotionBishopE) + ", promotionBishopF=" + Arrays.toString(promotionBishopF)
                + ", promotionBishopG=" + Arrays.toString(promotionBishopG) + ", promotionBishopH="
                + Arrays.toString(promotionBishopH) + ", promotionKnightA=" + Arrays.toString(promotionKnightA)
                + ", promotionKnightB=" + Arrays.toString(promotionKnightB) + ", promotionKnightC="
                + Arrays.toString(promotionKnightC) + ", promotionKnightD=" + Arrays.toString(promotionKnightD)
                + ", promotionKnightE=" + Arrays.toString(promotionKnightE) + ", promotionKnightF="
                + Arrays.toString(promotionKnightF) + ", promotionKnightG=" + Arrays.toString(promotionKnightG)
                + ", promotionKnightH=" + Arrays.toString(promotionKnightH) + ", promotionQueenA="
                + Arrays.toString(promotionQueenA) + ", promotionQueenB=" + Arrays.toString(promotionQueenB)
                + ", promotionQueenC=" + Arrays.toString(promotionQueenC) + ", promotionQueenD="
                + Arrays.toString(promotionQueenD) + ", promotionQueenE=" + Arrays.toString(promotionQueenE)
                + ", promotionQueenF=" + Arrays.toString(promotionQueenF) + ", promotionQueenG="
                + Arrays.toString(promotionQueenG) + ", promotionQueenH=" + Arrays.toString(promotionQueenH)
                + ", promotionRookA=" + Arrays.toString(promotionRookA) + ", promotionRookB="
                + Arrays.toString(promotionRookB) + ", promotionRookC=" + Arrays.toString(promotionRookC)
                + ", promotionRookD=" + Arrays.toString(promotionRookD) + ", promotionRookE="
                + Arrays.toString(promotionRookE) + ", promotionRookF=" + Arrays.toString(promotionRookF)
                + ", promotionRookG=" + Arrays.toString(promotionRookG) + ", promotionRookH="
                + Arrays.toString(promotionRookH) + ", whiteAPawn=" + Arrays.toString(whiteAPawn) + ", whiteARook="
                + Arrays.toString(whiteARook) + ", whiteBKnight=" + Arrays.toString(whiteBKnight) + ", whiteBPawn="
                + Arrays.toString(whiteBPawn) + ", whiteCBishop=" + Arrays.toString(whiteCBishop) + ", whiteCPawn="
                + Arrays.toString(whiteCPawn) + ", whiteDPawn=" + Arrays.toString(whiteDPawn) + ", whiteEPawn="
                + Arrays.toString(whiteEPawn) + ", whiteFBishop=" + Arrays.toString(whiteFBishop) + ", whiteFPawn="
                + Arrays.toString(whiteFPawn) + ", whiteGKnight=" + Arrays.toString(whiteGKnight) + ", whiteGPawn="
                + Arrays.toString(whiteGPawn) + ", whiteHPawn=" + Arrays.toString(whiteHPawn) + ", whiteHRook="
                + Arrays.toString(whiteHRook) + ", whiteKing=" + Arrays.toString(whiteKing) + ", whiteQueen="
                + Arrays.toString(whiteQueen) + "]";
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

        public LegalMovesBuilder BlackAPawn(String[] blackAPawn) {
            this.blackAPawn = blackAPawn;
            return this;
        }

        public LegalMovesBuilder BlackARook(String[] blackARook) {
            this.blackARook = blackARook;
            return this;
        }

        public LegalMovesBuilder BlackBKnight(String[] blackBKnight) {
            this.blackBKnight = blackBKnight;
            return this;
        }

        public LegalMovesBuilder BlackBPawn(String[] blackBPawn) {
            this.blackBPawn = blackBPawn;
            return this;
        }

        public LegalMovesBuilder BlackCBishop(String[] blackCBishop) {
            this.blackCBishop = blackCBishop;
            return this;
        }

        public LegalMovesBuilder BlackCPawn(String[] blackCPawn) {
            this.blackCPawn = blackCPawn;
            return this;
        }

        public LegalMovesBuilder BlackDPawn(String[] blackDPawn) {
            this.blackDPawn = blackDPawn;
            return this;
        }

        public LegalMovesBuilder BlackEPawn(String[] blackEPawn) {
            this.blackEPawn = blackEPawn;
            return this;
        }

        public LegalMovesBuilder BlackFBishop(String[] blackFBishop) {
            this.blackFBishop = blackFBishop;
            return this;
        }

        public LegalMovesBuilder BlackFPawn(String[] blackFPawn) {
            this.blackFPawn = blackFPawn;
            return this;
        }

        public LegalMovesBuilder BlackGKnight(String[] blackGKnight) {
            this.blackGKnight = blackGKnight;
            return this;
        }

        public LegalMovesBuilder BlackGPawn(String[] blackGPawn) {
            this.blackGPawn = blackGPawn;
            return this;
        }

        public LegalMovesBuilder BlackHPawn(String[] blackHPawn) {
            this.blackHPawn = blackHPawn;
            return this;
        }

        public LegalMovesBuilder BlackHRook(String[] blackHRook) {
            this.blackHRook = blackHRook;
            return this;
        }

        public LegalMovesBuilder BlackKing(String[] blackKing) {
            this.blackKing = blackKing;
            return this;
        }

        public LegalMovesBuilder BlackQueen(String[] blackQueen) {
            this.blackQueen = blackQueen;
            return this;
        }

        public LegalMovesBuilder PromotionBishopA(String[] promotionBishopA) {
            this.promotionBishopA = promotionBishopA;
            return this;
        }

        public LegalMovesBuilder PromotionBishopB(String[] promotionBishopB) {
            this.promotionBishopB = promotionBishopB;
            return this;
        }

        public LegalMovesBuilder PromotionBishopC(String[] promotionBishopC) {
            this.promotionBishopC = promotionBishopC;
            return this;
        }

        public LegalMovesBuilder PromotionBishopD(String[] promotionBishopD) {
            this.promotionBishopD = promotionBishopD;
            return this;
        }

        public LegalMovesBuilder PromotionBishopE(String[] promotionBishopE) {
            this.promotionBishopE = promotionBishopE;
            return this;
        }

        public LegalMovesBuilder PromotionBishopF(String[] promotionBishopF) {
            this.promotionBishopF = promotionBishopF;
            return this;
        }

        public LegalMovesBuilder PromotionBishopG(String[] promotionBishopG) {
            this.promotionBishopG = promotionBishopG;
            return this;
        }

        public LegalMovesBuilder PromotionBishopH(String[] promotionBishopH) {
            this.promotionBishopH = promotionBishopH;
            return this;
        }

        public LegalMovesBuilder PromotionKnightA(String[] promotionKnightA) {
            this.promotionKnightA = promotionKnightA;
            return this;
        }

        public LegalMovesBuilder PromotionKnightB(String[] promotionKnightB) {
            this.promotionKnightB = promotionKnightB;
            return this;
        }

        public LegalMovesBuilder PromotionKnightC(String[] promotionKnightC) {
            this.promotionKnightC = promotionKnightC;
            return this;
        }

        public LegalMovesBuilder PromotionKnightD(String[] promotionKnightD) {
            this.promotionKnightD = promotionKnightD;
            return this;
        }

        public LegalMovesBuilder PromotionKnightE(String[] promotionKnightE) {
            this.promotionKnightE = promotionKnightE;
            return this;
        }

        public LegalMovesBuilder PromotionKnightF(String[] promotionKnightF) {
            this.promotionKnightF = promotionKnightF;
            return this;
        }

        public LegalMovesBuilder PromotionKnightG(String[] promotionKnightG) {
            this.promotionKnightG = promotionKnightG;
            return this;
        }

        public LegalMovesBuilder PromotionKnightH(String[] promotionKnightH) {
            this.promotionKnightH = promotionKnightH;
            return this;
        }

        public LegalMovesBuilder PromotionQueenA(String[] promotionQueenA) {
            this.promotionQueenA = promotionQueenA;
            return this;
        }

        public LegalMovesBuilder PromotionQueenB(String[] promotionQueenB) {
            this.promotionQueenB = promotionQueenB;
            return this;
        }

        public LegalMovesBuilder PromotionQueenC(String[] promotionQueenC) {
            this.promotionQueenC = promotionQueenC;
            return this;
        }

        public LegalMovesBuilder PromotionQueenD(String[] promotionQueenD) {
            this.promotionQueenD = promotionQueenD;
            return this;
        }

        public LegalMovesBuilder PromotionQueenE(String[] promotionQueenE) {
            this.promotionQueenE = promotionQueenE;
            return this;
        }

        public LegalMovesBuilder PromotionQueenF(String[] promotionQueenF) {
            this.promotionQueenF = promotionQueenF;
            return this;
        }

        public LegalMovesBuilder PromotionQueenG(String[] promotionQueenG) {
            this.promotionQueenG = promotionQueenG;
            return this;
        }

        public LegalMovesBuilder PromotionQueenH(String[] promotionQueenH) {
            this.promotionQueenH = promotionQueenH;
            return this;
        }

        public LegalMovesBuilder PromotionRookA(String[] promotionRookA) {
            this.promotionRookA = promotionRookA;
            return this;
        }

        public LegalMovesBuilder PromotionRookB(String[] promotionRookB) {
            this.promotionRookB = promotionRookB;
            return this;
        }

        public LegalMovesBuilder PromotionRookC(String[] promotionRookC) {
            this.promotionRookC = promotionRookC;
            return this;
        }

        public LegalMovesBuilder PromotionRookD(String[] promotionRookD) {
            this.promotionRookD = promotionRookD;
            return this;
        }

        public LegalMovesBuilder PromotionRookE(String[] promotionRookE) {
            this.promotionRookE = promotionRookE;
            return this;
        }

        public LegalMovesBuilder PromotionRookF(String[] promotionRookF) {
            this.promotionRookF = promotionRookF;
            return this;
        }

        public LegalMovesBuilder PromotionRookG(String[] promotionRookG) {
            this.promotionRookG = promotionRookG;
            return this;
        }

        public LegalMovesBuilder PromotionRookH(String[] promotionRookH) {
            this.promotionRookH = promotionRookH;
            return this;
        }

        public LegalMovesBuilder WhiteAPawn(String[] whiteAPawn) {
            this.whiteAPawn = whiteAPawn;
            return this;
        }

        public LegalMovesBuilder WhiteARook(String[] whiteARook) {
            this.whiteARook = whiteARook;
            return this;
        }

        public LegalMovesBuilder WhiteBKnight(String[] whiteBKnight) {
            this.whiteBKnight = whiteBKnight;
            return this;
        }

        public LegalMovesBuilder WhiteBPawn(String[] whiteBPawn) {
            this.whiteBPawn = whiteBPawn;
            return this;
        }

        public LegalMovesBuilder WhiteCBishop(String[] whiteCBishop) {
            this.whiteCBishop = whiteCBishop;
            return this;
        }

        public LegalMovesBuilder WhiteCPawn(String[] whiteCPawn) {
            this.whiteCPawn = whiteCPawn;
            return this;
        }

        public LegalMovesBuilder WhiteDPawn(String[] whiteDPawn) {
            this.whiteDPawn = whiteDPawn;
            return this;
        }

        public LegalMovesBuilder WhiteEPawn(String[] whiteEPawn) {
            this.whiteEPawn = whiteEPawn;
            return this;
        }

        public LegalMovesBuilder WhiteFBishop(String[] whiteFBishop) {
            this.whiteFBishop = whiteFBishop;
            return this;
        }

        public LegalMovesBuilder WhiteFPawn(String[] whiteFPawn) {
            this.whiteFPawn = whiteFPawn;
            return this;
        }

        public LegalMovesBuilder WhiteGKnight(String[] whiteGKnight) {
            this.whiteGKnight = whiteGKnight;
            return this;
        }

        public LegalMovesBuilder WhiteGPawn(String[] whiteGPawn) {
            this.whiteGPawn = whiteGPawn;
            return this;
        }

        public LegalMovesBuilder WhiteHPawn(String[] whiteHPawn) {
            this.whiteHPawn = whiteHPawn;
            return this;
        }

        public LegalMovesBuilder WhiteHRook(String[] whiteHRook) {
            this.whiteHRook = whiteHRook;
            return this;
        }

        public LegalMovesBuilder WhiteKing(String[] whiteKing) {
            this.whiteKing = whiteKing;
            return this;
        }

        public LegalMovesBuilder WhiteQueen(String[] whiteQueen) {
            this.whiteQueen = whiteQueen;
            return this;
        }

        public LegalMoves build() {
            return new LegalMoves(this);
        }

    }

}