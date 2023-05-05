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

    public LegalMoves(String[] blackAPawn, String[] blackARook, String[] blackBKnight, String[] blackBPawn,
            String[] blackCBishop, String[] blackCPawn, String[] blackDPawn, String[] blackEPawn, String[] blackFBishop,
            String[] blackFPawn, String[] blackGKnight, String[] blackGPawn, String[] blackHPawn, String[] blackHRook,
            String[] blackKing, String[] blackQueen, String[] promotionBishopA, String[] promotionBishopB,
            String[] promotionBishopC, String[] promotionBishopD, String[] promotionBishopE, String[] promotionBishopF,
            String[] promotionBishopG, String[] promotionBishopH, String[] promotionKnightA, String[] promotionKnightB,
            String[] promotionKnightC, String[] promotionKnightD, String[] promotionKnightE, String[] promotionKnightF,
            String[] promotionKnightG, String[] promotionKnightH, String[] promotionQueenA, String[] promotionQueenB,
            String[] promotionQueenC, String[] promotionQueenD, String[] promotionQueenE, String[] promotionQueenF,
            String[] promotionQueenG, String[] promotionQueenH, String[] promotionRookA, String[] promotionRookB,
            String[] promotionRookC, String[] promotionRookD, String[] promotionRookE, String[] promotionRookF,
            String[] promotionRookG, String[] promotionRookH, String[] whiteAPawn, String[] whiteARook,
            String[] whiteBKnight, String[] whiteBPawn, String[] whiteCBishop, String[] whiteCPawn, String[] whiteDPawn,
            String[] whiteEPawn, String[] whiteFBishop, String[] whiteFPawn, String[] whiteGKnight, String[] whiteGPawn,
            String[] whiteHPawn, String[] whiteHRook, String[] whiteKing, String[] whiteQueen) {
        this.blackAPawn = blackAPawn;
        this.blackARook = blackARook;
        this.blackBKnight = blackBKnight;
        this.blackBPawn = blackBPawn;
        this.blackCBishop = blackCBishop;
        this.blackCPawn = blackCPawn;
        this.blackDPawn = blackDPawn;
        this.blackEPawn = blackEPawn;
        this.blackFBishop = blackFBishop;
        this.blackFPawn = blackFPawn;
        this.blackGKnight = blackGKnight;
        this.blackGPawn = blackGPawn;
        this.blackHPawn = blackHPawn;
        this.blackHRook = blackHRook;
        this.blackKing = blackKing;
        this.blackQueen = blackQueen;
        this.promotionBishopA = promotionBishopA;
        this.promotionBishopB = promotionBishopB;
        this.promotionBishopC = promotionBishopC;
        this.promotionBishopD = promotionBishopD;
        this.promotionBishopE = promotionBishopE;
        this.promotionBishopF = promotionBishopF;
        this.promotionBishopG = promotionBishopG;
        this.promotionBishopH = promotionBishopH;
        this.promotionKnightA = promotionKnightA;
        this.promotionKnightB = promotionKnightB;
        this.promotionKnightC = promotionKnightC;
        this.promotionKnightD = promotionKnightD;
        this.promotionKnightE = promotionKnightE;
        this.promotionKnightF = promotionKnightF;
        this.promotionKnightG = promotionKnightG;
        this.promotionKnightH = promotionKnightH;
        this.promotionQueenA = promotionQueenA;
        this.promotionQueenB = promotionQueenB;
        this.promotionQueenC = promotionQueenC;
        this.promotionQueenD = promotionQueenD;
        this.promotionQueenE = promotionQueenE;
        this.promotionQueenF = promotionQueenF;
        this.promotionQueenG = promotionQueenG;
        this.promotionQueenH = promotionQueenH;
        this.promotionRookA = promotionRookA;
        this.promotionRookB = promotionRookB;
        this.promotionRookC = promotionRookC;
        this.promotionRookD = promotionRookD;
        this.promotionRookE = promotionRookE;
        this.promotionRookF = promotionRookF;
        this.promotionRookG = promotionRookG;
        this.promotionRookH = promotionRookH;
        this.whiteAPawn = whiteAPawn;
        this.whiteARook = whiteARook;
        this.whiteBKnight = whiteBKnight;
        this.whiteBPawn = whiteBPawn;
        this.whiteCBishop = whiteCBishop;
        this.whiteCPawn = whiteCPawn;
        this.whiteDPawn = whiteDPawn;
        this.whiteEPawn = whiteEPawn;
        this.whiteFBishop = whiteFBishop;
        this.whiteFPawn = whiteFPawn;
        this.whiteGKnight = whiteGKnight;
        this.whiteGPawn = whiteGPawn;
        this.whiteHPawn = whiteHPawn;
        this.whiteHRook = whiteHRook;
        this.whiteKing = whiteKing;
        this.whiteQueen = whiteQueen;
    }

    public String[] getBlackAPawn() {
        return blackAPawn;
    }

    public void setBlackAPawn(String[] blackAPawn) {
        this.blackAPawn = blackAPawn;
    }

    public String[] getBlackARook() {
        return blackARook;
    }

    public void setBlackARook(String[] blackARook) {
        this.blackARook = blackARook;
    }

    public String[] getBlackBKnight() {
        return blackBKnight;
    }

    public void setBlackBKnight(String[] blackBKnight) {
        this.blackBKnight = blackBKnight;
    }

    public String[] getBlackBPawn() {
        return blackBPawn;
    }

    public void setBlackBPawn(String[] blackBPawn) {
        this.blackBPawn = blackBPawn;
    }

    public String[] getBlackCBishop() {
        return blackCBishop;
    }

    public void setBlackCBishop(String[] blackCBishop) {
        this.blackCBishop = blackCBishop;
    }

    public String[] getBlackCPawn() {
        return blackCPawn;
    }

    public void setBlackCPawn(String[] blackCPawn) {
        this.blackCPawn = blackCPawn;
    }

    public String[] getBlackDPawn() {
        return blackDPawn;
    }

    public void setBlackDPawn(String[] blackDPawn) {
        this.blackDPawn = blackDPawn;
    }

    public String[] getBlackEPawn() {
        return blackEPawn;
    }

    public void setBlackEPawn(String[] blackEPawn) {
        this.blackEPawn = blackEPawn;
    }

    public String[] getBlackFBishop() {
        return blackFBishop;
    }

    public void setBlackFBishop(String[] blackFBishop) {
        this.blackFBishop = blackFBishop;
    }

    public String[] getBlackFPawn() {
        return blackFPawn;
    }

    public void setBlackFPawn(String[] blackFPawn) {
        this.blackFPawn = blackFPawn;
    }

    public String[] getBlackGKnight() {
        return blackGKnight;
    }

    public void setBlackGKnight(String[] blackGKnight) {
        this.blackGKnight = blackGKnight;
    }

    public String[] getBlackGPawn() {
        return blackGPawn;
    }

    public void setBlackGPawn(String[] blackGPawn) {
        this.blackGPawn = blackGPawn;
    }

    public String[] getBlackHPawn() {
        return blackHPawn;
    }

    public void setBlackHPawn(String[] blackHPawn) {
        this.blackHPawn = blackHPawn;
    }

    public String[] getBlackHRook() {
        return blackHRook;
    }

    public void setBlackHRook(String[] blackHRook) {
        this.blackHRook = blackHRook;
    }

    public String[] getBlackKing() {
        return blackKing;
    }

    public void setBlackKing(String[] blackKing) {
        this.blackKing = blackKing;
    }

    public String[] getBlackQueen() {
        return blackQueen;
    }

    public void setBlackQueen(String[] blackQueen) {
        this.blackQueen = blackQueen;
    }

    public String[] getPromotionBishopA() {
        return promotionBishopA;
    }

    public void setPromotionBishopA(String[] promotionBishopA) {
        this.promotionBishopA = promotionBishopA;
    }

    public String[] getPromotionBishopB() {
        return promotionBishopB;
    }

    public void setPromotionBishopB(String[] promotionBishopB) {
        this.promotionBishopB = promotionBishopB;
    }

    public String[] getPromotionBishopC() {
        return promotionBishopC;
    }

    public void setPromotionBishopC(String[] promotionBishopC) {
        this.promotionBishopC = promotionBishopC;
    }

    public String[] getPromotionBishopD() {
        return promotionBishopD;
    }

    public void setPromotionBishopD(String[] promotionBishopD) {
        this.promotionBishopD = promotionBishopD;
    }

    public String[] getPromotionBishopE() {
        return promotionBishopE;
    }

    public void setPromotionBishopE(String[] promotionBishopE) {
        this.promotionBishopE = promotionBishopE;
    }

    public String[] getPromotionBishopF() {
        return promotionBishopF;
    }

    public void setPromotionBishopF(String[] promotionBishopF) {
        this.promotionBishopF = promotionBishopF;
    }

    public String[] getPromotionBishopG() {
        return promotionBishopG;
    }

    public void setPromotionBishopG(String[] promotionBishopG) {
        this.promotionBishopG = promotionBishopG;
    }

    public String[] getPromotionBishopH() {
        return promotionBishopH;
    }

    public void setPromotionBishopH(String[] promotionBishopH) {
        this.promotionBishopH = promotionBishopH;
    }

    public String[] getPromotionKnightA() {
        return promotionKnightA;
    }

    public void setPromotionKnightA(String[] promotionKnightA) {
        this.promotionKnightA = promotionKnightA;
    }

    public String[] getPromotionKnightB() {
        return promotionKnightB;
    }

    public void setPromotionKnightB(String[] promotionKnightB) {
        this.promotionKnightB = promotionKnightB;
    }

    public String[] getPromotionKnightC() {
        return promotionKnightC;
    }

    public void setPromotionKnightC(String[] promotionKnightC) {
        this.promotionKnightC = promotionKnightC;
    }

    public String[] getPromotionKnightD() {
        return promotionKnightD;
    }

    public void setPromotionKnightD(String[] promotionKnightD) {
        this.promotionKnightD = promotionKnightD;
    }

    public String[] getPromotionKnightE() {
        return promotionKnightE;
    }

    public void setPromotionKnightE(String[] promotionKnightE) {
        this.promotionKnightE = promotionKnightE;
    }

    public String[] getPromotionKnightF() {
        return promotionKnightF;
    }

    public void setPromotionKnightF(String[] promotionKnightF) {
        this.promotionKnightF = promotionKnightF;
    }

    public String[] getPromotionKnightG() {
        return promotionKnightG;
    }

    public void setPromotionKnightG(String[] promotionKnightG) {
        this.promotionKnightG = promotionKnightG;
    }

    public String[] getPromotionKnightH() {
        return promotionKnightH;
    }

    public void setPromotionKnightH(String[] promotionKnightH) {
        this.promotionKnightH = promotionKnightH;
    }

    public String[] getPromotionQueenA() {
        return promotionQueenA;
    }

    public void setPromotionQueenA(String[] promotionQueenA) {
        this.promotionQueenA = promotionQueenA;
    }

    public String[] getPromotionQueenB() {
        return promotionQueenB;
    }

    public void setPromotionQueenB(String[] promotionQueenB) {
        this.promotionQueenB = promotionQueenB;
    }

    public String[] getPromotionQueenC() {
        return promotionQueenC;
    }

    public void setPromotionQueenC(String[] promotionQueenC) {
        this.promotionQueenC = promotionQueenC;
    }

    public String[] getPromotionQueenD() {
        return promotionQueenD;
    }

    public void setPromotionQueenD(String[] promotionQueenD) {
        this.promotionQueenD = promotionQueenD;
    }

    public String[] getPromotionQueenE() {
        return promotionQueenE;
    }

    public void setPromotionQueenE(String[] promotionQueenE) {
        this.promotionQueenE = promotionQueenE;
    }

    public String[] getPromotionQueenF() {
        return promotionQueenF;
    }

    public void setPromotionQueenF(String[] promotionQueenF) {
        this.promotionQueenF = promotionQueenF;
    }

    public String[] getPromotionQueenG() {
        return promotionQueenG;
    }

    public void setPromotionQueenG(String[] promotionQueenG) {
        this.promotionQueenG = promotionQueenG;
    }

    public String[] getPromotionQueenH() {
        return promotionQueenH;
    }

    public void setPromotionQueenH(String[] promotionQueenH) {
        this.promotionQueenH = promotionQueenH;
    }

    public String[] getPromotionRookA() {
        return promotionRookA;
    }

    public void setPromotionRookA(String[] promotionRookA) {
        this.promotionRookA = promotionRookA;
    }

    public String[] getPromotionRookB() {
        return promotionRookB;
    }

    public void setPromotionRookB(String[] promotionRookB) {
        this.promotionRookB = promotionRookB;
    }

    public String[] getPromotionRookC() {
        return promotionRookC;
    }

    public void setPromotionRookC(String[] promotionRookC) {
        this.promotionRookC = promotionRookC;
    }

    public String[] getPromotionRookD() {
        return promotionRookD;
    }

    public void setPromotionRookD(String[] promotionRookD) {
        this.promotionRookD = promotionRookD;
    }

    public String[] getPromotionRookE() {
        return promotionRookE;
    }

    public void setPromotionRookE(String[] promotionRookE) {
        this.promotionRookE = promotionRookE;
    }

    public String[] getPromotionRookF() {
        return promotionRookF;
    }

    public void setPromotionRookF(String[] promotionRookF) {
        this.promotionRookF = promotionRookF;
    }

    public String[] getPromotionRookG() {
        return promotionRookG;
    }

    public void setPromotionRookG(String[] promotionRookG) {
        this.promotionRookG = promotionRookG;
    }

    public String[] getPromotionRookH() {
        return promotionRookH;
    }

    public void setPromotionRookH(String[] promotionRookH) {
        this.promotionRookH = promotionRookH;
    }

    public String[] getWhiteAPawn() {
        return whiteAPawn;
    }

    public void setWhiteAPawn(String[] whiteAPawn) {
        this.whiteAPawn = whiteAPawn;
    }

    public String[] getWhiteARook() {
        return whiteARook;
    }

    public void setWhiteARook(String[] whiteARook) {
        this.whiteARook = whiteARook;
    }

    public String[] getWhiteBKnight() {
        return whiteBKnight;
    }

    public void setWhiteBKnight(String[] whiteBKnight) {
        this.whiteBKnight = whiteBKnight;
    }

    public String[] getWhiteBPawn() {
        return whiteBPawn;
    }

    public void setWhiteBPawn(String[] whiteBPawn) {
        this.whiteBPawn = whiteBPawn;
    }

    public String[] getWhiteCBishop() {
        return whiteCBishop;
    }

    public void setWhiteCBishop(String[] whiteCBishop) {
        this.whiteCBishop = whiteCBishop;
    }

    public String[] getWhiteCPawn() {
        return whiteCPawn;
    }

    public void setWhiteCPawn(String[] whiteCPawn) {
        this.whiteCPawn = whiteCPawn;
    }

    public String[] getWhiteDPawn() {
        return whiteDPawn;
    }

    public void setWhiteDPawn(String[] whiteDPawn) {
        this.whiteDPawn = whiteDPawn;
    }

    public String[] getWhiteEPawn() {
        return whiteEPawn;
    }

    public void setWhiteEPawn(String[] whiteEPawn) {
        this.whiteEPawn = whiteEPawn;
    }

    public String[] getWhiteFBishop() {
        return whiteFBishop;
    }

    public void setWhiteFBishop(String[] whiteFBishop) {
        this.whiteFBishop = whiteFBishop;
    }

    public String[] getWhiteFPawn() {
        return whiteFPawn;
    }

    public void setWhiteFPawn(String[] whiteFPawn) {
        this.whiteFPawn = whiteFPawn;
    }

    public String[] getWhiteGKnight() {
        return whiteGKnight;
    }

    public void setWhiteGKnight(String[] whiteGKnight) {
        this.whiteGKnight = whiteGKnight;
    }

    public String[] getWhiteGPawn() {
        return whiteGPawn;
    }

    public void setWhiteGPawn(String[] whiteGPawn) {
        this.whiteGPawn = whiteGPawn;
    }

    public String[] getWhiteHPawn() {
        return whiteHPawn;
    }

    public void setWhiteHPawn(String[] whiteHPawn) {
        this.whiteHPawn = whiteHPawn;
    }

    public String[] getWhiteHRook() {
        return whiteHRook;
    }

    public void setWhiteHRook(String[] whiteHRook) {
        this.whiteHRook = whiteHRook;
    }

    public String[] getWhiteKing() {
        return whiteKing;
    }

    public void setWhiteKing(String[] whiteKing) {
        this.whiteKing = whiteKing;
    }

    public String[] getWhiteQueen() {
        return whiteQueen;
    }

    public void setWhiteQueen(String[] whiteQueen) {
        this.whiteQueen = whiteQueen;
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

}