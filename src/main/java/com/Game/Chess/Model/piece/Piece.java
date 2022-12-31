package com.Game.Chess.Model.piece;

import com.Game.Chess.Model.board.Square;

public abstract class Piece {

    PieceColor color;
    int material;
    Square currentSquare;

    Piece(PieceColor color, int material, Square currentSqaure) {

        this.color = color;
        this.material = material;
        this.currentSquare = currentSqaure;
        
    }

    public PieceColor getColor() {
        return color;
    }

    public void setColor(PieceColor color) {
        this.color = color;
    }

    public Square getCurrentSquare() {
        return currentSquare;
    }

    public void setCurrentSquare(Square currentSquare) {
        this.currentSquare = currentSquare;
    }

    @Override
    public String toString() {
        return "Piece [color=" + color + ", material=" + material + ", currentSquare=" + currentSquare + "]";
    }

    
}
