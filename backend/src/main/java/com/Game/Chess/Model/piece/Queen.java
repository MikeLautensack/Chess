package com.Game.Chess.Model.piece;

import java.util.ArrayList;
import java.util.List;

import com.Game.Chess.Model.board.Square;
import com.Game.Chess.Model.board.SquareIndex;

public class Queen extends Piece implements GetLegalMoves {

    private String[] candidateMoves = new ArrayList<>();

    public Queen(PieceColor color, String id) {
        super(color, id);
    }

    @Override
    public String[] getMoves(Board board) {

    }

}
