package com.Game.Chess.Model.board;

import java.util.HashMap;

import com.Game.Chess.Model.piece.*;
import com.Game.Chess.ResourceRepresentationClasses.BoardConfig;

public class Board {

    private Square[][] boardArray = new Square[8][8];
    private HashMap<Coordinates, Square> squareCoordinatesMap = new HashMap<>();
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
                    if (coordinate.equals(k)) {
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

                // Increment file index
                fileIndex++;
            }
        }
    }

    public Board() {
        for (int i = 0; i < boardArray.length; i++) {

            int fileIndex = 0;
            SquareColor color = (i % 1 == 0) ? SquareColor.LIGHT : SquareColor.DARK;

            for (int j = 0; j < fileArray.length; j++) {

                // Build square
                Square newSquare = new Square(color,
                        new Coordinates(j, -i + 8, fileArray[j].toString().concat(String.valueOf(-i + 8))));

                // Add square to board array
                boardArray[i][fileIndex] = newSquare;

                // Change square color
                color = (color == SquareColor.DARK) ? SquareColor.LIGHT : SquareColor.DARK;

                // Create map values
                squareCoordinatesMap.put(
                        new Coordinates(j, -i + 8, fileArray[j].toString().concat(String.valueOf(-i + 8))), newSquare);

                // Increment file index
                fileIndex++;
            }
        }
    }

    public void printBoard() {
        System.out.println("              Chess");
        for (Square[] rank : boardArray) {
            for (Square square : rank) {
                if (square.isOccupied() == true) {
                    System.out.print("|");
                    System.out.print(abbreviatePieceName(square.getPieceOnSquare().getId()));
                    System.out.print("|");

                } else {
                    System.out.print("|");
                    System.out.print("  ");
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }

    public String abbreviatePieceName(String pieceName) {
        if (pieceName.contains("white")) {
            if (pieceName.contains("Pawn")) {
                return "WP";
            } else if (pieceName.contains("Knight")) {
                return "WN";
            } else if (pieceName.contains("Bishop")) {
                return "WB";
            } else if (pieceName.contains("Rook")) {
                return "WR";
            } else if (pieceName.contains("Queen")) {
                return "WQ";
            } else if (pieceName.contains("King")) {
                return "WK";
            }
        } else if (pieceName.contains("black")) {
            if (pieceName.contains("Pawn")) {
                return "BP";
            } else if (pieceName.contains("Knight")) {
                return "BN";
            } else if (pieceName.contains("Bishop")) {
                return "BB";
            } else if (pieceName.contains("Rook")) {
                return "BR";
            } else if (pieceName.contains("Queen")) {
                return "BQ";
            } else if (pieceName.contains("King")) {
                return "BK";
            }
        }
        return "";
    }

    public void addPiece(Piece piece, String coordinate) {
        Board board = this;
        Square[][] arr = board.getBoardArray();
        for (Square[] squareArr : arr) {
            for (Square square : squareArr) {
                if (square.getSquareCoordinate().getID().equals(coordinate)) {
                    square.setPieceOnSquare(piece);
                    square.setOccupied(true);
                    piece.setSquare(square);
                }
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

    public File[] getFileArray() {
        return fileArray;
    }

    public void setFileArray(File[] fileArray) {
        this.fileArray = fileArray;
    }

}
