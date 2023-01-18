package com.Game.Chess.Model.piece;

import java.util.ArrayList;
import java.util.List;
import com.Game.Chess.Model.board.Square;

public interface GetLegalMoves {

    public List<Square> getMoves(Board board);

}
