package com.Game.Chess.Model.Board;

import java.util.HashMap;

import com.Game.Chess.Model.Piece.Bishop;
import com.Game.Chess.Model.Piece.King;
import com.Game.Chess.Model.Piece.Knight;
import com.Game.Chess.Model.Piece.Pawn;
import com.Game.Chess.Model.Piece.PieceColor;
import com.Game.Chess.Model.Piece.Queen;
import com.Game.Chess.Model.Piece.Rook;
import com.Game.Chess.ResourceRepresentationClasses.BoardConfig;

public class Board {

    private Square[][] boardArray = new Square[8][8];
    private HashMap<Coordinates, Square> squareCoordinatesMap = new HashMap<>();
    private HashMap<Square, Square> squareIndexMap = new HashMap<>();
    private File[] fileArray = File.values();

    public Board(BoardConfig boardConfig) {

        for (int i = 0; i < boardArray.length; i++) {

            int fileIndex = 0;
            SquareColor color = (i % 1 == 0) ? SquareColor.LIGHT : SquareColor.DARK;

            for (int j = 0; j < fileArray.length; j++) {

                // Build square
                Square newSquare = new Square(color,
                        new Coordinates(j, -i + 8, fileArray[j].toString().concat(String.valueOf(-i + 8))));

                // Add square to board array
                boardArray[i][fileIndex] = newSquare;

                // Build piece and add to square
                Coordinates squareCoordinate = newSquare.getSquareCoordinate();
                String coordinate = squareCoordinate.getID();
                HashMap<String, String> boardConfigMap = BoardConfig.createConfigMap(boardConfig);

                boardConfigMap.forEach((k, v) -> {
                    if (coordinate == k) {
                        if (v.contains("King")) {
                            if (v.contains("white")) {
                                King piece = new King(PieceColor.WHITE, v);
                                newSquare.setPieceOnSquare(piece);
                                newSquare.setOccupied(true);
                                piece.setSquare(newSquare);
                            } else if (v.contains("black")) {
                                King piece = new King(PieceColor.BLACK, v);
                                newSquare.setPieceOnSquare(piece);
                                newSquare.setOccupied(true);
                                piece.setSquare(newSquare);
                            }
                        } else if (v.contains("Queen")) {
                            if (v.contains("white")) {
                                Queen piece = new Queen(PieceColor.WHITE, v);
                                newSquare.setPieceOnSquare(piece);
                                newSquare.setOccupied(true);
                                piece.setSquare(newSquare);
                            } else if (v.contains("black")) {
                                Queen piece = new Queen(PieceColor.BLACK, v);
                                newSquare.setPieceOnSquare(piece);
                                newSquare.setOccupied(true);
                                piece.setSquare(newSquare);
                            }
                        } else if (v.contains("Rook")) {
                            if (v.contains("white")) {
                                Rook piece = new Rook(PieceColor.WHITE, v);
                                newSquare.setPieceOnSquare(piece);
                                newSquare.setOccupied(true);
                                piece.setSquare(newSquare);
                            } else if (v.contains("black")) {
                                Rook piece = new Rook(PieceColor.BLACK, v);
                                newSquare.setPieceOnSquare(piece);
                                newSquare.setOccupied(true);
                                piece.setSquare(newSquare);
                            }
                        } else if (v.contains("Bishop")) {
                            if (v.contains("white")) {
                                Bishop piece = new Bishop(PieceColor.WHITE, v);
                                newSquare.setPieceOnSquare(piece);
                                newSquare.setOccupied(true);
                                piece.setSquare(newSquare);
                            } else if (v.contains("black")) {
                                Bishop piece = new Bishop(PieceColor.BLACK, v);
                                newSquare.setPieceOnSquare(piece);
                                newSquare.setOccupied(true);
                                piece.setSquare(newSquare);
                            }
                        } else if (v.contains("Knight")) {
                            if (v.contains("white")) {
                                Knight piece = new Knight(PieceColor.WHITE, v);
                                newSquare.setPieceOnSquare(piece);
                                newSquare.setOccupied(true);
                                piece.setSquare(newSquare);
                            } else if (v.contains("black")) {
                                Knight piece = new Knight(PieceColor.BLACK, v);
                                newSquare.setPieceOnSquare(piece);
                                newSquare.setOccupied(true);
                                piece.setSquare(newSquare);
                            }
                        } else if (v.contains("Pawn")) {
                            if (v.contains("white")) {
                                Pawn piece = new Pawn(PieceColor.WHITE, v);
                                newSquare.setPieceOnSquare(piece);
                                newSquare.setOccupied(true);
                                piece.setSquare(newSquare);
                            } else if (v.contains("black")) {
                                Pawn piece = new Pawn(PieceColor.BLACK, v);
                                newSquare.setPieceOnSquare(piece);
                                newSquare.setOccupied(true);
                                piece.setSquare(newSquare);
                            }
                        }
                    }
                });

                // Change square color
                color = (color == SquareColor.DARK) ? SquareColor.LIGHT : SquareColor.DARK;

                // Create map values
                squareCoordinatesMap.put(
                        new Coordinates(j, -i + 8, fileArray[j].toString().concat(String.valueOf(-i + 8))), newSquare);
                squareIndexMap.put(newSquare, boardArray[i][fileIndex]);

                // Increment file index
                fileIndex++;
            }
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

    public File[] getFileArray() {
        return fileArray;
    }

    public void setFileArray(File[] fileArray) {
        this.fileArray = fileArray;
    }

}
