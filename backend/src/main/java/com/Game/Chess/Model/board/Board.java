package com.Game.Chess.Model.board;

import java.lang.reflect.Field;
import java.util.HashMap;

import com.Game.Chess.Model.piece.Knight;
import com.Game.Chess.Model.piece.Piece;
import com.Game.Chess.Model.piece.PieceColor;
import com.Game.Chess.Model.piece.Queen;
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
                HashMap<String, String> boardConfigMap = createConfigMap(boardConfig);

                boardConfigMap.forEach((k, v) -> {
                    if (coordinate == k) {
                        if (v.contains("King")) {
                            if (v.contains("white")) {
                                King piece = new King(PieceColor.WHITE);
                                newSquare.setPieceOnSquare(piece);
                            } else if (v.contains("black")) {
                                King piece = new King(PieceColor.BLACK);
                                newSquare.setPieceOnSquare(piece);
                            }
                        } else if (v.contains("Queen")) {
                            if (v.contains("white")) {
                                Queen piece = new Queen(PieceColor.WHITE);
                                newSquare.setPieceOnSquare(piece);
                            } else if (v.contains("black")) {
                                Queen piece = new Queen(PieceColor.BLACK);
                                newSquare.setPieceOnSquare(piece);
                            }
                        } else if (v.contains("Rook")) {
                            if (v.contains("white")) {
                                Rook piece = new Rook(PieceColor.WHITE);
                                newSquare.setPieceOnSquare(piece);
                            } else if (v.contains("black")) {
                                Rook piece = new Rook(PieceColor.BLACK);
                                newSquare.setPieceOnSquare(piece);
                            }
                        } else if (v.contains("Bishop")) {
                            if (v.contains("white")) {
                                Bishop piece = new Bishop(PieceColor.WHITE);
                                newSquare.setPieceOnSquare(piece);
                            } else if (v.contains("black")) {
                                Bishop piece = new Bishop(PieceColor.BLACK);
                                newSquare.setPieceOnSquare(piece);
                            }
                        } else if (v.contains("Knight")) {
                            if (v.contains("white")) {
                                Knight piece = new Knight(PieceColor.WHITE);
                                newSquare.setPieceOnSquare(piece);
                            } else if (v.contains("black")) {
                                Knight piece = new Knight(PieceColor.BLACK);
                                newSquare.setPieceOnSquare(piece);
                            }
                        } else if (v.contains("Pawn")) {
                            if (v.contains("white")) {
                                Pawn piece = new Pawn(PieceColor.WHITE);
                                newSquare.setPieceOnSquare(piece);
                            } else if (v.contains("black")) {
                                Pawn piece = new Pawn(PieceColor.BLACK);
                                newSquare.setPieceOnSquare(piece);
                            }
                        }
                    }
                });

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
