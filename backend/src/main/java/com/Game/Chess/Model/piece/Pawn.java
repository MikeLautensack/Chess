package com.Game.Chess.Model.piece;

import java.util.ArrayList;

import com.Game.Chess.Model.board.Board;
import com.Game.Chess.Model.board.Square;
import com.Game.Chess.Model.board.SquareIndex;

public class Pawn extends Piece implements GetLegalMoves {

    private String[] candidateMoves = new ArrayList<>();

    Pawn(PieceColor color, String id) {
        super(color, id);

    }

    @Override
    public String[] getMoves(Board board) {

    }

}
