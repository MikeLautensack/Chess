package com.Game.Chess.Model.piece;

import java.util.ArrayList;
import java.util.List;

import com.Game.Chess.Model.board.Square;
import com.Game.Chess.Model.board.SquareIndex;

public class King extends Piece implements GetLegalMoves {

    private ArrayList<Square> candidateMoves = new ArrayList<>();

    public King(PieceColor color, String id) {
        super(color, id);
    }

    @Override
    public ArrayList<Square> getMoves(Board board) {

    }

}
