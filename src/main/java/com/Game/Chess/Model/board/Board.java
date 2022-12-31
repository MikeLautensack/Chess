package com.Game.Chess.Model.board;

import java.util.HashMap;

import com.Game.Chess.ResourceRepresentationClasses.BoardConfig;

public class Board {

    public Square[][] boardArray = new Square[8][8];
    HashMap<Coordinates, Square> squareCoordinatesMap = new HashMap<>();
    HashMap<Square, Square> squareIndexMap = new HashMap<>();
    String[] fileArray = {"A","B","C","D","E","F","G","H"};

    //Thinking of maybe using the currentBoardConfig & legalMoves objects in the board constrcutors parameters
    public Board() {

        for(int i = 0; i < boardArray.length; i++) {

            int fileIndex = 0;
            SquareColor color = (i % 1 == 0) ? SquareColor.LIGHT : SquareColor.DARK;

            for(String file : fileArray) {

                Square newSquare = new Square(false, color, new Coordinates(file, -i + 8), null, new SquareIndex(fileIndex, i));
                boardArray[i][fileIndex] = newSquare;
                color = (color == SquareColor.DARK) ? SquareColor.LIGHT : SquareColor.DARK;
                squareCoordinatesMap.put(new Coordinates(file, -i + 8), newSquare);
                squareIndexMap.put(newSquare, boardArray[i][fileIndex]);
                fileIndex++;
            }
        }
    }
    
    public void printBoard() {
        for(Square[] row : boardArray) {
            for(Square square : row) {
                System.out.print(square);
            }
            System.out.println();
        }
    }

    



    
}
