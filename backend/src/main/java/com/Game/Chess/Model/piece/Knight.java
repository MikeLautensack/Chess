package com.Game.Chess.Model.Piece;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.Game.Chess.Model.Board.Board;
import com.Game.Chess.Model.Board.Coordinates;

public class Knight extends Piece {

    public Knight(PieceColor color, String id) {
        super(color, id);
    }

    @Override
    public List<Coordinates> getMoves(Board board) {
        List<Coordinates> moves = Collections.emptyList();
        moves.add(Coordinates.build(this.getSquare().getSquareCoordinate(), 1, 2));
        moves.add(Coordinates.build(this.getSquare().getSquareCoordinate(), 2, 1));
        moves.add(Coordinates.build(this.getSquare().getSquareCoordinate(), 2, -1));
        moves.add(Coordinates.build(this.getSquare().getSquareCoordinate(), 1, -2));
        moves.add(Coordinates.build(this.getSquare().getSquareCoordinate(), -1, -2));
        moves.add(Coordinates.build(this.getSquare().getSquareCoordinate(), -2, -1));
        moves.add(Coordinates.build(this.getSquare().getSquareCoordinate(), -2, 1));
        moves.add(Coordinates.build(this.getSquare().getSquareCoordinate(), -1, 2));

        return moves.stream()
                // Filter coordinates off board
                .filter((coordinate) -> board.getSquareCoordinatesMap().containsKey(coordinate))
                // Filter coordinates that contain a piece of the same color as this
                .filter((coordinate) -> !(this.getColor()
                        .equals(board.getSquareCoordinatesMap().get(coordinate).getPieceOnSquare().getColor())))
                .collect(Collectors.toList());
    }

}
