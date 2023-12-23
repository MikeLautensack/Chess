package com.Game.Chess.Model.piece;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.Game.Chess.Model.board.Board;
import com.Game.Chess.Model.board.Coordinates;
import com.Game.Chess.Model.board.Square;

public class Queen extends Piece {

    public Queen(PieceColor color, String id) {
        super(color, id);
    }

    @Override
    public List<Coordinates> getMoves(Board board) {
        List<Coordinates> moves = new ArrayList<>();
        Map<Coordinates, Square> map = board.getSquareCoordinatesMap();
        Coordinates current = this.getSquare().getSquareCoordinate();
        getCoordinatesOnVector(moves, map, current, 0, 1, this);
        getCoordinatesOnVector(moves, map, current, 0, -1, this);
        getCoordinatesOnVector(moves, map, current, 1, 0, this);
        getCoordinatesOnVector(moves, map, current, -1, 0, this);
        getCoordinatesOnVector(moves, map, current, 1, 1, this);
        getCoordinatesOnVector(moves, map, current, -1, -1, this);
        getCoordinatesOnVector(moves, map, current, 1, -1, this);
        getCoordinatesOnVector(moves, map, current, -1, 1, this);
        return moves;
    }

}
