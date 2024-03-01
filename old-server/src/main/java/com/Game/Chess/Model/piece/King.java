package com.Game.Chess.Model.piece;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.Game.Chess.Model.board.Board;
import com.Game.Chess.Model.board.Coordinates;

public class King extends Piece {

    public King(PieceColor color, String id) {
        super(color, id);
    }

    @Override
    public List<Coordinates> getMoves(Board board) {
        List<Coordinates> moves = new ArrayList<>();
        moves.add(Coordinates.build(this.getSquare().getSquareCoordinate(), 0, 1));
        moves.add(Coordinates.build(this.getSquare().getSquareCoordinate(), 1, 1));
        moves.add(Coordinates.build(this.getSquare().getSquareCoordinate(), 1, 0));
        moves.add(Coordinates.build(this.getSquare().getSquareCoordinate(), 1, -1));
        moves.add(Coordinates.build(this.getSquare().getSquareCoordinate(), 0, -1));
        moves.add(Coordinates.build(this.getSquare().getSquareCoordinate(), -1, -1));
        moves.add(Coordinates.build(this.getSquare().getSquareCoordinate(), -1, 0));
        moves.add(Coordinates.build(this.getSquare().getSquareCoordinate(), -1, 1));

        return moves
                .stream()
                // Filter coordinates off board
                .filter((coordinate) -> board.getSquareCoordinatesMap().containsKey(coordinate))
                // Filter coordinates that contain a piece of the same color as this
                .filter((coordinate) -> !(compareColor(this, board, coordinate)))
                .collect(Collectors.toList());

    }

}
