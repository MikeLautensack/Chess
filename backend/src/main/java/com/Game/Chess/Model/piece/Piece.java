package com.Game.Chess.Model.piece;

import com.Game.Chess.Model.board.Square;

public abstract class Piece {

    private PieceColor color;
    private String id;

    Piece(PieceColor color, String id) {

        this.color = color;
        this.id = id;
    }

    public PieceColor getColor() {
        return color;
    }

    public void setColor(PieceColor color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Piece [color=" + color + ", material=" + material + ", currentSquare=" + currentSquare + "]";
    }

}
