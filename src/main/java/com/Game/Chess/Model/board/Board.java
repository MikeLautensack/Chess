package com.Game.Chess.Model.board;

import java.lang.reflect.Field;
import java.util.HashMap;

import com.Game.Chess.Model.piece.Piece;
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

                // Get square coordinate
                Coordinates squareCoordinate = newSquare.getSquareCoordinate();
                String coordinate = squareCoordinate.getCoordinate();

                // Get value of the instance variable of the boardConfig passed in that matches
                // square coordinate
                Field[] boardConfigFields = boardConfig.getClass().getDeclaredFields();
                for (Field field : boardConfigFields) {
                    Field f = boardConfig.getClass().getDeclaredField(field);
                    if (field.getName().equals(coordinate)) {
                        String boardConfigPieceValue = field.get(field);
                    }
                }

                // Build piece object that represents the value you got from the previus step

                // Set pieceOnSquare of newSqaure to the piece you build in the previus step

                Piece piece = boardArray[i][fileIndex].getPieceOnSquare();

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
