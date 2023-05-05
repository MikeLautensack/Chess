package com.Game.Chess.Model.piece;

import java.io.Console;
import java.util.List;
import java.util.Map;

import com.Game.Chess.Model.board.Board;
import com.Game.Chess.Model.board.Coordinates;
import com.Game.Chess.Model.board.Square;

public abstract class Piece {

    private PieceColor color;
    private String id;
    private Square square;

    public Piece(PieceColor color, String id) {

        this.color = color;
        this.id = id;
        this.square = null;

    }

    public abstract List<Coordinates> getMoves(Board board);

    public static void getCoordinatesOnVector(List<Coordinates> moves,
            Map<Coordinates, Square> map,
            Coordinates current,
            int fileOffset,
            int rankOffset,
            Piece piece) {
        Coordinates next = Coordinates.build(current, fileOffset, rankOffset);
        while (map.containsKey(next)) {
            if (map.get(next).isOccupied()) {
                if (map.get(next).getPieceOnSquare().getColor().equals(piece.getColor())) {
                    break;
                }
                moves.add(next);
                break;
            }
            moves.add(next);
            next = Coordinates.build(next, fileOffset, rankOffset);
        }
    }

    public static boolean compareColor(Piece piece1, Board board, Coordinates coordinate) {
        if (board.getSquareCoordinatesMap().get(coordinate).getPieceOnSquare() != null) {
            if (board.getSquareCoordinatesMap().get(coordinate).getPieceOnSquare().getColor() == piece1.getColor()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
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

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "Piece [color=" + color + ", id=" + id + ", squareCoordinate=" + square.getSquareCoordinate() + "]";
    }

}
