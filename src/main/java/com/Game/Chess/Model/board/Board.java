package com.Game.Chess.Model.board;

import java.util.HashMap;

import com.Game.Chess.ResourceRepresentationClasses.BoardConfig;

public class Board {

    public Square[][] boardArray = new Square[8][8];
    HashMap<Coordinates, Square> squareCoordinatesMap = new HashMap<>();
    HashMap<Square, Square> squareIndexMap = new HashMap<>();
    String[] fileArray = { "a", "b", "c", "d", "e", "f", "g", "h" };

    public Board(BoardConfig boardConfig) {

        for (int i = 0; i < boardArray.length; i++) {

            int fileIndex = 0;
            SquareColor color = (i % 1 == 0) ? SquareColor.LIGHT : SquareColor.DARK;

            for (String file : fileArray) {

                // Build square
                Square newSquare = new Square(false, color,
                        new Coordinates(file, String.valueOf(-i + 8), file.concat(String.valueOf(-i + 8))), null,
                        new SquareIndex(fileIndex, i));

                // Add square to board array
                boardArray[i][fileIndex] = newSquare;

                // Build piece and add to square
                Coordinates squareCoordinate = newSquare.getSquareCoordinate();
                String coordinate = squareCoordinate.getCoordinate();

                // Change square color
                color = (color == SquareColor.DARK) ? SquareColor.LIGHT : SquareColor.DARK;

                // Create map values
                squareCoordinatesMap.put(
                        new Coordinates(file, String.valueOf(-i + 8), file.concat(String.valueOf(-i + 8))), newSquare);
                squareIndexMap.put(newSquare, boardArray[i][fileIndex]);

                // Increment file index
                fileIndex++;
            }
        }
    }

    public void printBoard() {
        for (Square[] row : boardArray) {
            for (Square square : row) {
                System.out.print(square);
            }
            System.out.println();
        }
    }

}
