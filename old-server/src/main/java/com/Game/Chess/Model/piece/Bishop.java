package com.Game.Chess.Model.piece;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.Game.Chess.Model.board.Board;
import com.Game.Chess.Model.board.Coordinates;
import com.Game.Chess.Model.board.Square;

public class Bishop extends Piece {

    public Bishop(PieceColor color, String id) {
        super(color, id);
    }

    @Override
    public List<Coordinates> getMoves(Board board) {
        List<Coordinates> moves = new ArrayList<>();
        Map<Coordinates, Square> map = board.getSquareCoordinatesMap();
        Coordinates currentCoordinate = this.getSquare().getSquareCoordinate();
        getCoordinatesOnVector(moves, map, currentCoordinate, 1, 1, this);
        getCoordinatesOnVector(moves, map, currentCoordinate, -1, -1, this);
        getCoordinatesOnVector(moves, map, currentCoordinate, 1, -1, this);
        getCoordinatesOnVector(moves, map, currentCoordinate, -1, 1, this);
        return moves;
    }

}
