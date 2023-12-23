package com.Game.Chess.Model.board;

import com.Game.Chess.Model.piece.Piece;

public class Square {

    private SquareColor color;
    private Coordinates squareCoordinate;
    private Piece pieceOnSquare;
    private boolean occupied;

    public Square(SquareColor color, Coordinates squareCoordinate) {

        this.color = color;
        this.squareCoordinate = squareCoordinate;
        this.occupied = false;
        this.pieceOnSquare = null;

    }

    public SquareColor getColor() {
        return color;
    }

    public void setColor(SquareColor color) {
        this.color = color;
    }

    public Coordinates getSquareCoordinate() {
        return squareCoordinate;
    }

    public void setSquareCoordinate(Coordinates squareCoordinate) {
        this.squareCoordinate = squareCoordinate;
    }

    public Piece getPieceOnSquare() {
        return pieceOnSquare;
    }

    public void setPieceOnSquare(Piece pieceOnSquare) {
        this.pieceOnSquare = pieceOnSquare;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    @Override
    public String toString() {
        return "Square [color=" + color + ", squareCoordinate=" + squareCoordinate + ", pieceOnSquare=" + pieceOnSquare
                + ", occupied=" + occupied + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((squareCoordinate == null) ? 0 : squareCoordinate.hashCode());
        result = prime * result + ((pieceOnSquare == null) ? 0 : pieceOnSquare.hashCode());
        result = prime * result + (occupied ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Square other = (Square) obj;
        if (color != other.color)
            return false;
        if (squareCoordinate == null) {
            if (other.squareCoordinate != null)
                return false;
        } else if (!squareCoordinate.equals(other.squareCoordinate))
            return false;
        if (pieceOnSquare == null) {
            if (other.pieceOnSquare != null)
                return false;
        } else if (!pieceOnSquare.equals(other.pieceOnSquare))
            return false;
        if (occupied != other.occupied)
            return false;
        return true;
    }

}
