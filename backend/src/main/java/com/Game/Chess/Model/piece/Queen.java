package com.Game.Chess.Model.piece;

import java.util.ArrayList;
import java.util.List;
import com.Game.Chess.Model.board.Board;
import com.Game.Chess.Model.board.Square;

public class Queen extends Piece {

    private List<Square> candidateMoves = new ArrayList<>();

    public Queen(PieceColor color, String id) {
        super(color, id);
    }

    @Override
    public List<Square> getMoves(Board board) {
        List<Square> temp = new ArrayList<>();
        return temp;
    }

}
