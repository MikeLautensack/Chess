package com.Game.Chess.Model.Piece;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.Game.Chess.Model.Board.Board;
import com.Game.Chess.Model.Board.Coordinates;
import com.Game.Chess.Model.Board.Square;

public class Rook extends Piece {

    public Rook(PieceColor color, String id) {
        super(color, id);
    }

    @Override
    public List<Coordinates> getMoves(Board board) {
        List<Coordinates> moves = Collections.emptyList();
        Map<Coordinates, Square> map = board.getSquareCoordinatesMap();
        Coordinates current = this.getSquare().getSquareCoordinate();
        getCoordinatesOnVector(moves, map, current, 0, 1, this);
        getCoordinatesOnVector(moves, map, current, 0, -1, this);
        getCoordinatesOnVector(moves, map, current, 1, 0, this);
        getCoordinatesOnVector(moves, map, current, -1, 0, this);
        return moves;
    }

}