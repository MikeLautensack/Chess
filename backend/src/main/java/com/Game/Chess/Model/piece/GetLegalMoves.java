package com.Game.Chess.Model.piece;

import java.util.List;
import com.Game.Chess.Model.board.Square;

public interface GetLegalMoves {

    public String[] getMoves(Board board);

}
