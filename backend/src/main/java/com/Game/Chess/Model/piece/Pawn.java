package com.Game.Chess.Model.Piece;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.Game.Chess.Model.Board.Board;
import com.Game.Chess.Model.Board.Coordinates;

public class Pawn extends Piece {

    private boolean firstMove;
    private String startingSquare;

    public Pawn(PieceColor color, String id) {
        super(color, id);
        if (id.contains("A")) {
            if (id.contains("white")) {
                startingSquare = "a2";
            } else if (id.contains("black")) {
                startingSquare = "a7";
            }

        } else if (id.contains("B")) {
            if (id.contains("white")) {
                startingSquare = "b2";
            } else if (id.contains("black")) {
                startingSquare = "b7";
            }
        } else if (id.contains("C")) {
            if (id.contains("white")) {
                startingSquare = "c2";
            } else if (id.contains("black")) {
                startingSquare = "c7";
            }
        } else if (id.contains("D")) {
            if (id.contains("white")) {
                startingSquare = "d2";
            } else if (id.contains("black")) {
                startingSquare = "d7";
            }
        } else if (id.contains("E")) {
            if (id.contains("white")) {
                startingSquare = "e2";
            } else if (id.contains("black")) {
                startingSquare = "e7";
            }
        } else if (id.contains("F")) {
            if (id.contains("white")) {
                startingSquare = "f2";
            } else if (id.contains("black")) {
                startingSquare = "f7";
            }
        } else if (id.contains("G")) {
            if (id.contains("white")) {
                startingSquare = "g2";
            } else if (id.contains("black")) {
                startingSquare = "g7";
            }
        } else if (id.contains("H")) {
            if (id.contains("white")) {
                startingSquare = "h2";
            } else if (id.contains("black")) {
                startingSquare = "h7";
            }
        }

    }

    @Override
    public List<Coordinates> getMoves(Board board) {

        if (this.getSquare().getSquareCoordinate().getID().equals(this.startingSquare)) {
            firstMove = true;
        } else {
            firstMove = false;
        }

        List<Coordinates> moves = Collections.emptyList();
        if (firstMove == true) {
            moves.add(Coordinates.build(this.getSquare().getSquareCoordinate(), 0, 2));
        }
        moves.add(Coordinates.build(this.getSquare().getSquareCoordinate(), 0, 1));
        moves.add(Coordinates.build(this.getSquare().getSquareCoordinate(), 1, 1));
        moves.add(Coordinates.build(this.getSquare().getSquareCoordinate(), -1, 1));

        return moves.stream()
                // Filter coordinates off board
                .filter((coordinate) -> board.getSquareCoordinatesMap().containsKey(coordinate))
                // Filter coordinates that contain a piece of the same color as this
                .filter((coordinate) -> !(this.getColor()
                        .equals(board.getSquareCoordinatesMap().get(coordinate).getPieceOnSquare().getColor())))

                // Filter coordinats with piece in front of pawn
                .filter((coordinate) -> !(coordinate.getRank() == this.getSquare().getSquareCoordinate().getRank() + 1
                        && coordinate.getFile() == this.getSquare().getSquareCoordinate().getFile()
                        && board.getSquareCoordinatesMap().get(coordinate).isOccupied() == true))

                // Filter coordinates on left diagaonal without a piece on square
                .filter((coordinate) -> !(coordinate.getRank() == this.getSquare().getSquareCoordinate().getRank() + 1
                        && coordinate.getFile() == this.getSquare().getSquareCoordinate().getFile() - 1
                        && board.getSquareCoordinatesMap().get(coordinate).isOccupied() == false))

                // Filter coordinates on right diagaonal without a piece on square
                .filter((coordinate) -> !(coordinate.getRank() == this.getSquare().getSquareCoordinate().getRank() + 1
                        && coordinate.getFile() == this.getSquare().getSquareCoordinate().getFile() + 1
                        && board.getSquareCoordinatesMap().get(coordinate).isOccupied() == false))

                .collect(Collectors.toList());
    }

}
