package com.Game.Chess.Model.piece;

import java.util.ArrayList;

import com.Game.Chess.Model.board.Board;
import com.Game.Chess.Model.board.Square;
import com.Game.Chess.Model.board.SquareIndex;

public class Pawn extends Piece implements GetLegalMoves {

    private ArrayList<Square> candidateMoves = new ArrayList<>();

    Pawn(PieceColor color) {
        super(color);

    }

    @Override
    public ArrayList<Square> getMoves(Board board) {

    }

}
