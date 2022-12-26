package com.Game.Chess.Model.game;

import java.util.List;
import com.Game.Chess.Model.board.Square;

public interface getLegalMoves {
    
    public List<Square> getMoves(Square[][] boardArray, Square newSquare);

}
