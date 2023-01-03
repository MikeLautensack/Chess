package com.Game.Chess.Model.game;

import com.Game.Chess.Model.board.Board;
import com.Game.Chess.ResourceRepresentationClasses.BoardConfig;
import com.Game.Chess.ResourceRepresentationClasses.LegalMoves;

public class GenerateLegalMoves {

    public static LegalMoves generateLegalMoves(BoardConfig boardConfig) {

        // Create board
        Board board = new Board(boardConfig);

        // Access board's boardArray

        // Loop through boardArray and access square and piece on square

        // Preform getMoves() operations on each piece

        // Create new LegalMoves object from the return values of the previous steps

        // Return LegalMoves object
        return new LegalMoves(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

}
