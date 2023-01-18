package com.Game.Chess.Model.piece;

import java.util.ArrayList;
import java.util.List;

import com.Game.Chess.Model.board.Square;
import com.Game.Chess.Model.board.SquareIndex;

public class Bishop extends Piece implements GetLegalMoves {

    private List<Square> candidateMoves = new ArrayList<>();

    public Bishop(PieceColor color, String id) {
        super(color, id);
    }

    @Override
    public List<Square> getMoves(Board board) {

    }

}
