package com.Game.Chess.Model.board;

import java.lang.reflect.Field;
import java.util.HashMap;

import com.Game.Chess.Model.piece.Knight;
import com.Game.Chess.Model.piece.Piece;
import com.Game.Chess.Model.piece.PieceColor;
import com.Game.Chess.Model.piece.Queen;
import com.Game.Chess.ResourceRepresentationClasses.BoardConfig;

public class Board {

    private Square[][] boardArray = new Square[8][8];
    private HashMap<Coordinates, Square> squareCoordinatesMap = new HashMap<>();
    private HashMap<Square, Square> squareIndexMap = new HashMap<>();
    private String[] fileArray = { "a", "b", "c", "d", "e", "f", "g", "h" };

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
                                King piece = new King(PieceColor.WHITE, v);
                                newSquare.setPieceOnSquare(piece);
                            } else if (v.contains("black")) {
                                King piece = new King(PieceColor.BLACK, v);
                                newSquare.setPieceOnSquare(piece);
                            }
                        } else if (v.contains("Queen")) {
                            if (v.contains("white")) {
                                Queen piece = new Queen(PieceColor.WHITE, v);
                                newSquare.setPieceOnSquare(piece);
                            } else if (v.contains("black")) {
                                Queen piece = new Queen(PieceColor.BLACK, v);
                                newSquare.setPieceOnSquare(piece);
                            }
                        } else if (v.contains("Rook")) {
                            if (v.contains("white")) {
                                Rook piece = new Rook(PieceColor.WHITE, v);
                                newSquare.setPieceOnSquare(piece);
                            } else if (v.contains("black")) {
                                Rook piece = new Rook(PieceColor.BLACK, v);
                                newSquare.setPieceOnSquare(piece);
                            }
                        } else if (v.contains("Bishop")) {
                            if (v.contains("white")) {
                                Bishop piece = new Bishop(PieceColor.WHITE, v);
                                newSquare.setPieceOnSquare(piece);
                            } else if (v.contains("black")) {
                                Bishop piece = new Bishop(PieceColor.BLACK, v);
                                newSquare.setPieceOnSquare(piece);
                            }
                        } else if (v.contains("Knight")) {
                            if (v.contains("white")) {
                                Knight piece = new Knight(PieceColor.WHITE, v);
                                newSquare.setPieceOnSquare(piece);
                            } else if (v.contains("black")) {
                                Knight piece = new Knight(PieceColor.BLACK, v);
                                newSquare.setPieceOnSquare(piece);
                            }
                        } else if (v.contains("Pawn")) {
                            if (v.contains("white")) {
                                Pawn piece = new Pawn(PieceColor.WHITE, v);
                                newSquare.setPieceOnSquare(piece);
                            } else if (v.contains("black")) {
                                Pawn piece = new Pawn(PieceColor.BLACK, v);
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

    public Square[][] getBoardArray() {
        return boardArray;
    }

    public void setBoardArray(Square[][] boardArray) {
        this.boardArray = boardArray;
    }

    public HashMap<Coordinates, Square> getSquareCoordinatesMap() {
        return squareCoordinatesMap;
    }

    public void setSquareCoordinatesMap(HashMap<Coordinates, Square> squareCoordinatesMap) {
        this.squareCoordinatesMap = squareCoordinatesMap;
    }

    public HashMap<Square, Square> getSquareIndexMap() {
        return squareIndexMap;
    }

    public void setSquareIndexMap(HashMap<Square, Square> squareIndexMap) {
        this.squareIndexMap = squareIndexMap;
    }

    public String[] getFileArray() {
        return fileArray;
    }

    public void setFileArray(String[] fileArray) {
        this.fileArray = fileArray;
    }

}
