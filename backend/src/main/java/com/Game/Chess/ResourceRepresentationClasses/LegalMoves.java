package com.Game.Chess.ResourceRepresentationClasses;

import java.util.HashMap;

public class LegalMoves {

    String[] whiteKing;
    String[] whiteQueen;
    String[] whiteKsRook;
    String[] whiteQsRook;
    String[] whiteLsBishop;
    String[] whiteDsBishop;
    String[] whiteKsKnight;
    String[] whiteQsKnight;
    String[] whiteAPawn;
    String[] whiteBPawn;
    String[] whiteCPawn;
    String[] whiteDPawn;
    String[] whiteEPawn;
    String[] whiteFPawn;
    String[] whiteGPawn;
    String[] whiteHPawn;
    String[] blackKing;
    String[] blackQueen;
    String[] blackKsRook;
    String[] blackQsRook;
    String[] blackLsBishop;
    String[] blackDsBishop;
    String[] blackKsKnight;
    String[] blackQsKnight;
    String[] blackAPawn;
    String[] blackBPawn;
    String[] blackCPawn;
    String[] blackDPawn;
    String[] blackEPawn;
    String[] blackFPawn;
    String[] blackGPawn;
    String[] blackHPawn;

    public LegalMoves(String[] whiteKing, String[] whiteQueen, String[] whiteKsRook, String[] whiteQsRook,
            String[] whiteLsBishop, String[] whiteDsBishop, String[] whiteKsKnight, String[] whiteQsKnight,
            String[] whiteAPawn, String[] whiteBPawn, String[] whiteCPawn, String[] whiteDPawn, String[] whiteEPawn,
            String[] whiteFPawn, String[] whiteGPawn, String[] whiteHPawn, String[] blackKing, String[] blackQueen,
            String[] blackKsRook, String[] blackQsRook, String[] blackLsBishop, String[] blackDsBishop,
            String[] blackKsKnight, String[] blackQsKnight, String[] blackAPawn, String[] blackBPawn,
            String[] blackCPawn, String[] blackDPawn, String[] blackEPawn, String[] blackFPawn, String[] blackGPawn,
            String[] blackHPawn) {

        this.whiteKing = whiteKing;
        this.whiteQueen = whiteQueen;
        this.whiteKsRook = whiteKsRook;
        this.whiteQsRook = whiteQsRook;
        this.whiteLsBishop = whiteLsBishop;
        this.whiteDsBishop = whiteDsBishop;
        this.whiteKsKnight = whiteKsKnight;
        this.whiteQsKnight = whiteQsKnight;
        this.whiteAPawn = whiteAPawn;
        this.whiteBPawn = whiteBPawn;
        this.whiteCPawn = whiteCPawn;
        this.whiteDPawn = whiteDPawn;
        this.whiteEPawn = whiteEPawn;
        this.whiteFPawn = whiteFPawn;
        this.whiteGPawn = whiteGPawn;
        this.whiteHPawn = whiteHPawn;
        this.blackKing = blackKing;
        this.blackQueen = blackQueen;
        this.blackKsRook = blackKsRook;
        this.blackQsRook = blackQsRook;
        this.blackLsBishop = blackLsBishop;
        this.blackDsBishop = blackDsBishop;
        this.blackKsKnight = blackKsKnight;
        this.blackQsKnight = blackQsKnight;
        this.blackAPawn = blackAPawn;
        this.blackBPawn = blackBPawn;
        this.blackCPawn = blackCPawn;
        this.blackDPawn = blackDPawn;
        this.blackEPawn = blackEPawn;
        this.blackFPawn = blackFPawn;
        this.blackGPawn = blackGPawn;
        this.blackHPawn = blackHPawn;
    }

    public static LegalMoves createLegalMoves(HashMap<K, V> map) {

        LegalMoves legalMoves;
        HashMap<String, String> hashmap = map;

        String whiteKing;
        String whiteQueen;
        String whiteKsRook;
        String whiteQsRook;
        String whiteLsBishop;
        String whiteDsBishop;
        String whiteKsKnight;
        String whiteQsKnight;
        String whiteAPawn;
        String whiteBPawn;
        String whiteCPawn;
        String whiteDPawn;
        String whiteEPawn;
        String whiteFPawn;
        String whiteGPawn;
        String whiteHPawn;
        String blackKing;
        String blackQueen;
        String blackKsRook;
        String blackQsRook;
        String blackLsBishop;
        String blackDsBishop;
        String blackKsKnight;
        String blackQsKnight;
        String blackAPawn;
        String blackBPawn;
        String blackCPawn;
        String blackDPawn;
        String blackEPawn;
        String blackFPawn;
        String blackGPawn;
        String blackHPawn;

        String[] pieces = {
                whiteKing,
                whiteQueen,
                whiteKsRook,
                whiteQsRook,
                whiteLsBishop,
                whiteDsBishop,
                whiteKsKnight,
                whiteQsKnight,
                whiteAPawn,
                whiteBPawn,
                whiteCPawn,
                whiteDPawn,
                whiteEPawn,
                whiteFPawn,
                whiteGPawn,
                whiteHPawn,
                blackKing,
                blackQueen,
                blackKsRook,
                blackQsRook,
                blackLsBishop,
                blackDsBishop,
                blackKsKnight,
                blackQsKnight,
                blackAPawn,
                blackBPawn,
                blackCPawn,
                blackDPawn,
                blackEPawn,
                blackFPawn,
                blackGPawn,
                blackHPawn
        };

        String[] whiteKingArr;
        String[] whiteQueenArr;
        String[] whiteKsRookArr;
        String[] whiteQsRookArr;
        String[] whiteLsBishopArr;
        String[] whiteDsBishopArr;
        String[] whiteKsKnightArr;
        String[] whiteQsKnightArr;
        String[] whiteAPawnArr;
        String[] whiteBPawnArr;
        String[] whiteCPawnArr;
        String[] whiteDPawnArr;
        String[] whiteEPawnArr;
        String[] whiteFPawnArr;
        String[] whiteGPawnArr;
        String[] whiteHPawnArr;
        String[] blackKingArr;
        String[] blackQueenArr;
        String[] blackKsRookArr;
        String[] blackQsRookArr;
        String[] blackLsBishopArr;
        String[] blackDsBishopArr;
        String[] blackKsKnightArr;
        String[] blackQsKnightArr;
        String[] blackAPawnArr;
        String[] blackBPawnArr;
        String[] blackCPawnArr;
        String[] blackDPawnArr;
        String[] blackEPawnArr;
        String[] blackFPawnArr;
        String[] blackGPawnArr;
        String[] blackHPawnArr;

        String[] piecesArr = {
                whiteKingArr,
                whiteQueenArr,
                whiteKsRookArr,
                whiteQsRookArr,
                whiteLsBishopArr,
                whiteDsBishopArr,
                whiteKsKnightArr,
                whiteQsKnightArr,
                whiteAPawnArr,
                whiteBPawnArr,
                whiteCPawnArr,
                whiteDPawnArr,
                whiteEPawnArr,
                whiteFPawnArr,
                whiteGPawnArr,
                whiteHPawnArr,
                blackKingArr,
                blackQueenArr,
                blackKsRookArr,
                blackQsRookArr,
                blackLsBishopArr,
                blackDsBishopArr,
                blackKsKnightArr,
                blackQsKnightArr,
                blackAPawnArr,
                blackBPawnArr,
                blackCPawnArr,
                blackDPawnArr,
                blackEPawnArr,
                blackFPawnArr,
                blackGPawnArr,
                blackHPawnArr
        };

        for (int i = 0; i < pieces.length; i++) {
            String string = pieces[i];
            String[] stringArr;
            hashmap.forEach((k, v) -> {
                if (k == string) {
                    stringArr = v;
                }
            });
            piecesArr[i] = stringArr;
            legalMoves = new LegalMoves(whiteKingArr,
                    whiteQueenArr,
                    whiteKsRookArr,
                    whiteQsRookArr,
                    whiteLsBishopArr,
                    whiteDsBishopArr,
                    whiteKsKnightArr,
                    whiteQsKnightArr,
                    whiteAPawnArr,
                    whiteBPawnArr,
                    whiteCPawnArr,
                    whiteDPawnArr,
                    whiteEPawnArr,
                    whiteFPawnArr,
                    whiteGPawnArr,
                    whiteHPawnArr,
                    blackKingArr,
                    blackQueenArr,
                    blackKsRookArr,
                    blackQsRookArr,
                    blackLsBishopArr,
                    blackDsBishopArr,
                    blackKsKnightArr,
                    blackQsKnightArr,
                    blackAPawnArr,
                    blackBPawnArr,
                    blackCPawnArr,
                    blackDPawnArr,
                    blackEPawnArr,
                    blackFPawnArr,
                    blackGPawnArr,
                    blackHPawnArr);
        }

        return legalMoves;
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

    public String[] getWhiteKsRook() {
        return whiteKsRook;
    }

    public void setWhiteKsRook(String[] whiteKsRook) {
        this.whiteKsRook = whiteKsRook;
    }

    public String[] getWhiteQsRook() {
        return whiteQsRook;
    }

    public void setWhiteQsRook(String[] whiteQsRook) {
        this.whiteQsRook = whiteQsRook;
    }

    public String[] getWhiteLsBishop() {
        return whiteLsBishop;
    }

    public void setWhiteLsBishop(String[] whiteLsBishop) {
        this.whiteLsBishop = whiteLsBishop;
    }

    public String[] getWhiteDsBishop() {
        return whiteDsBishop;
    }

    public void setWhiteDsBishop(String[] whiteDsBishop) {
        this.whiteDsBishop = whiteDsBishop;
    }

    public String[] getWhiteKsKnight() {
        return whiteKsKnight;
    }

    public void setWhiteKsKnight(String[] whiteKsKnight) {
        this.whiteKsKnight = whiteKsKnight;
    }

    public String[] getWhiteQsKnight() {
        return whiteQsKnight;
    }

    public void setWhiteQsKnight(String[] whiteQsKnight) {
        this.whiteQsKnight = whiteQsKnight;
    }

    public String[] getWhiteAPawn() {
        return whiteAPawn;
    }

    public void setWhiteAPawn(String[] whiteAPawn) {
        this.whiteAPawn = whiteAPawn;
    }

    public String[] getWhiteBPawn() {
        return whiteBPawn;
    }

    public void setWhiteBPawn(String[] whiteBPawn) {
        this.whiteBPawn = whiteBPawn;
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

    public String[] getWhiteFPawn() {
        return whiteFPawn;
    }

    public void setWhiteFPawn(String[] whiteFPawn) {
        this.whiteFPawn = whiteFPawn;
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

    public String[] getBlackKsRook() {
        return blackKsRook;
    }

    public void setBlackKsRook(String[] blackKsRook) {
        this.blackKsRook = blackKsRook;
    }

    public String[] getBlackQsRook() {
        return blackQsRook;
    }

    public void setBlackQsRook(String[] blackQsRook) {
        this.blackQsRook = blackQsRook;
    }

    public String[] getBlackLsBishop() {
        return blackLsBishop;
    }

    public void setBlackLsBishop(String[] blackLsBishop) {
        this.blackLsBishop = blackLsBishop;
    }

    public String[] getBlackDsBishop() {
        return blackDsBishop;
    }

    public void setBlackDsBishop(String[] blackDsBishop) {
        this.blackDsBishop = blackDsBishop;
    }

    public String[] getBlackKsKnight() {
        return blackKsKnight;
    }

    public void setBlackKsKnight(String[] blackKsKnight) {
        this.blackKsKnight = blackKsKnight;
    }

    public String[] getBlackQsKnight() {
        return blackQsKnight;
    }

    public void setBlackQsKnight(String[] blackQsKnight) {
        this.blackQsKnight = blackQsKnight;
    }

    public String[] getBlackAPawn() {
        return blackAPawn;
    }

    public void setBlackAPawn(String[] blackAPawn) {
        this.blackAPawn = blackAPawn;
    }

    public String[] getBlackBPawn() {
        return blackBPawn;
    }

    public void setBlackBPawn(String[] blackBPawn) {
        this.blackBPawn = blackBPawn;
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

    public String[] getBlackFPawn() {
        return blackFPawn;
    }

    public void setBlackFPawn(String[] blackFPawn) {
        this.blackFPawn = blackFPawn;
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

}