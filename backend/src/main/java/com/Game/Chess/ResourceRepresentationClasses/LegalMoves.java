package com.Game.Chess.ResourceRepresentationClasses;

import java.util.ArrayList;
import java.util.HashMap;

import com.Game.Chess.Model.piece.Piece;

public class LegalMoves {

    private String[] whiteKing;
    private String[] whiteQueen;
    private String[] whiteKsRook;
    private String[] whiteQsRook;
    private String[] whiteLsBishop;
    private String[] whiteDsBishop;
    private String[] whiteKsKnight;
    private String[] whiteQsKnight;
    private String[] whiteAPawn;
    private String[] whiteBPawn;
    private String[] whiteCPawn;
    private String[] whiteDPawn;
    private String[] whiteEPawn;
    private String[] whiteFPawn;
    private String[] whiteGPawn;
    private String[] whiteHPawn;
    private String[] blackKing;
    private String[] blackQueen;
    private String[] blackKsRook;
    private String[] blackQsRook;
    private String[] blackLsBishop;
    private String[] blackDsBishop;
    private String[] blackKsKnight;
    private String[] blackQsKnight;
    private String[] blackAPawn;
    private String[] blackBPawn;
    private String[] blackCPawn;
    private String[] blackDPawn;
    private String[] blackEPawn;
    private String[] blackFPawn;
    private String[] blackGPawn;
    private String[] blackHPawn;

    private LegalMoves(LegalMovesBuilder builder) {

    }

    public static List<Piece> orderPieces(List arr) {
        Piece piece;
        String pieceID;
        List<Piece> orderedPieces = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            piece = arr.get(i);
            pieceID = piece.getId();

            if (pieceID == "whiteKing") {

            } else if (pieceID == "whiteKing") {
                orderedPieces.add(0, piece);
            } else if (pieceID == "whiteQueen") {
                orderedPieces.add(1, piece);
            } else if (pieceID == "whiteKsRook") {
                orderedPieces.add(2, piece);
            } else if (pieceID == "whiteQsRook") {
                orderedPieces.add(3, piece);
            } else if (pieceID == "whiteLsBishop") {
                orderedPieces.add(4, piece);
            } else if (pieceID == "whiteDsBishop") {
                orderedPieces.add(5, piece);
            } else if (pieceID == "whiteKsKnight") {
                orderedPieces.add(6, piece);
            } else if (pieceID == "whiteQsKnight") {
                orderedPieces.add(7, piece);
            } else if (pieceID == "whiteAPawn") {
                orderedPieces.add(8, piece);
            } else if (pieceID == "whiteBPawn") {
                orderedPieces.add(9, piece);
            } else if (pieceID == "whiteCPawn") {
                orderedPieces.add(10, piece);
            } else if (pieceID == "whiteDPawn") {
                orderedPieces.add(11, piece);
            } else if (pieceID == "whiteEPawn") {
                orderedPieces.add(12, piece);
            } else if (pieceID == "whiteFPawn") {
                orderedPieces.add(13, piece);
            } else if (pieceID == "whiteGPawn") {
                orderedPieces.add(14, piece);
            } else if (pieceID == "whiteHPawn") {
                orderedPieces.add(15, piece);
            } else if (pieceID == "blackKing") {
                orderedPieces.add(16, piece);
            } else if (pieceID == "blackQueen") {
                orderedPieces.add(17, piece);
            } else if (pieceID == "blackKsRook") {
                orderedPieces.add(18, piece);
            } else if (pieceID == "blackQsRook") {
                orderedPieces.add(19, piece);
            } else if (pieceID == "blackLsBishop") {
                orderedPieces.add(20, piece);
            } else if (pieceID == "whiteDsBishop") {
                orderedPieces.add(21, piece);
            } else if (pieceID == "whiteKsKnight") {
                orderedPieces.add(22, piece);
            } else if (pieceID == "whiteQsKnight") {
                orderedPieces.add(23, piece);
            } else if (pieceID == "blackAPawn") {
                orderedPieces.add(24, piece);
            } else if (pieceID == "blackBPawn") {
                orderedPieces.add(25, piece);
            } else if (pieceID == "blackCPawn") {
                orderedPieces.add(26, piece);
            } else if (pieceID == "blackDPawn") {
                orderedPieces.add(27, piece);
            } else if (pieceID == "blackEPawn") {
                orderedPieces.add(28, piece);
            } else if (pieceID == "blackFPawn") {
                orderedPieces.add(29, piece);
            } else if (pieceID == "blackGPawn") {
                orderedPieces.add(30, piece);
            } else if (pieceID == "blackHPawn") {
                orderedPieces.add(31, piece);
            }
        }
        return orderedPieces;
    }

    public String[] getWhiteKing() {
        return whiteKing;
    }

    public String[] getWhiteQueen() {
        return whiteQueen;
    }

    public String[] getWhiteKsRook() {
        return whiteKsRook;
    }

    public String[] getWhiteQsRook() {
        return whiteQsRook;
    }

    public String[] getWhiteLsBishop() {
        return whiteLsBishop;
    }

    public String[] getWhiteDsBishop() {
        return whiteDsBishop;
    }

    public String[] getWhiteKsKnight() {
        return whiteKsKnight;
    }

    public String[] getWhiteQsKnight() {
        return whiteQsKnight;
    }

    public String[] getWhiteAPawn() {
        return whiteAPawn;
    }

    public String[] getWhiteBPawn() {
        return whiteBPawn;
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

    public String[] getWhiteFPawn() {
        return whiteFPawn;
    }

    public String[] getWhiteGPawn() {
        return whiteGPawn;
    }

    public String[] getWhiteHPawn() {
        return whiteHPawn;
    }

    public String[] getBlackKing() {
        return blackKing;
    }

    public String[] getBlackQueen() {
        return blackQueen;
    }

    public String[] getBlackKsRook() {
        return blackKsRook;
    }

    public String[] getBlackQsRook() {
        return blackQsRook;
    }

    public String[] getBlackLsBishop() {
        return blackLsBishop;
    }

    public String[] getBlackDsBishop() {
        return blackDsBishop;
    }

    public String[] getBlackKsKnight() {
        return blackKsKnight;
    }

    public String[] getBlackQsKnight() {
        return blackQsKnight;
    }

    public String[] getBlackAPawn() {
        return blackAPawn;
    }

    public String[] getBlackBPawn() {
        return blackBPawn;
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

    public String[] getBlackFPawn() {
        return blackFPawn;
    }

    public String[] getBlackGPawn() {
        return blackGPawn;
    }

    public String[] getBlackHPawn() {
        return blackHPawn;
    }

    public static class LegalMovesBuilder {

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

        public LegalMovesBuilder WhiteKing(String[] whiteKing) {
            this.whiteKing = whiteKing;
            return this;
        }

        public LegalMovesBuilder WhiteQueen(String[] whiteQueen) {
            this.whiteQueen = whiteQueen;
            return this;
        }

        public LegalMovesBuilder WhiteKsRook(String[] whiteKsRook) {
            this.whiteKsRook = whiteKsRook;
            return this;
        }

        public LegalMovesBuilder WhiteQsRook(String[] whiteQsRook) {
            this.whiteQsRook = whiteQsRook;
            return this;
        }

        public LegalMovesBuilder WhiteLsBishop(String[] whiteLsBishop) {
            this.whiteLsBishop = whiteLsBishop;
            return this;
        }

        public LegalMovesBuilder WhiteDsBishop(String[] whiteDsBishop) {
            this.whiteDsBishop = whiteDsBishop;
            return this;
        }

        public LegalMovesBuilder WhiteKsKnight(String[] whiteKsKnight) {
            this.whiteKsKnight = whiteKsKnight;
            return this;
        }

        public LegalMovesBuilder WhiteQsKnight(String[] whiteQsKnight) {
            this.whiteQsKnight = whiteQsKnight;
            return this;
        }

        public LegalMovesBuilder WhiteAPawn(String[] whiteAPawn) {
            this.whiteAPawn = whiteAPawn;
            return this;
        }

        public LegalMovesBuilder WhiteBPawn(String[] whiteBPawn) {
            this.whiteBPawn = whiteBPawn;
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

        public LegalMovesBuilder WhiteFPawn(String[] whiteFPawn) {
            this.whiteFPawn = whiteFPawn;
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

        public LegalMovesBuilder BlackKing(String[] blackKing) {
            this.blackKing = blackKing;
            return this;
        }

        public LegalMovesBuilder BlackQueen(String[] blackQueen) {
            this.blackQueen = blackQueen;
            return this;
        }

        public LegalMovesBuilder BlackKsRook(String[] blackKsRook) {
            this.blackKsRook = blackKsRook;
            return this;
        }

        public LegalMovesBuilder BlackQsRook(String[] blackQsRook) {
            this.blackQsRook = blackQsRook;
            return this;
        }

        public LegalMovesBuilder BlackLsBishop(String[] blackLsBishop) {
            this.blackLsBishop = blackLsBishop;
            return this;
        }

        public LegalMovesBuilder BlackDsBishop(String[] blackDsBishop) {
            this.blackDsBishop = blackDsBishop;
            return this;
        }

        public LegalMovesBuilder BlackKsKnight(String[] blackKsKnight) {
            this.blackKsKnight = blackKsKnight;
            return this;
        }

        public LegalMovesBuilder BlackQsKnight(String[] blackQsKnight) {
            this.blackQsKnight = blackQsKnight;
            return this;
        }

        public LegalMovesBuilder BlackAPawn(String[] blackAPawn) {
            this.blackAPawn = blackAPawn;
            return this;
        }

        public LegalMovesBuilder BlackBPawn(String[] blackBPawn) {
            this.blackBPawn = blackBPawn;
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

        public LegalMovesBuilder BlackFPawn(String[] blackFPawn) {
            this.blackFPawn = blackFPawn;
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

        public LegalMoves build() {
            return new LegalMoves(this);
        }

    }

}