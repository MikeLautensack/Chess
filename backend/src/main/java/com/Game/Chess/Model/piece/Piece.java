package com.Game.Chess.Model.piece;

import com.Game.Chess.Model.board.Square;

public abstract class Piece {

    PieceColor color;

    Piece(PieceColor color) {

        this.color = color;

    }

    public PieceColor getColor() {
        return color;
    }

    public void setColor(PieceColor color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Piece [color=" + color + ", material=" + material + ", currentSquare=" + currentSquare + "]";
    }

}
