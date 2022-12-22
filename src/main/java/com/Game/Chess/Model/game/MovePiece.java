package com.Game.Chess.Model.game;

import java.util.List;
import com.Game.Chess.Model.board.Square;

public interface MovePiece {

    public void move();
    
    public List<Square> getCandidateMoves(Square[][] boardArray, Square newSquare);



    


}
