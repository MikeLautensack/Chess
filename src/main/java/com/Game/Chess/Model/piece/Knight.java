package com.Game.Chess.Model.piece;

import java.util.ArrayList;
import java.util.List;

import com.Game.Chess.Model.board.Square;
import com.Game.Chess.Model.board.SquareIndex;

public class Knight extends Piece implements GetLegalMoves {

    private ArrayList<Square> candidateMoves = new ArrayList<>();

    public Knight(PieceColor color, int material, Square currentSqaure) {
        super(color, material, currentSqaure);
    }

    @Override
    public List<Square> getMoves(Square[][] boardArray, Square newSquare) {

        boolean firstMove = true;
        Square square;
        Square testingSquare;
        int testingSquareIndexFile;
        int testingSquareIndexRank;
        SquareIndex squareIndex;
        SquareIndex testingSquareIndex;
        int squareIndexFile;
        int squareIndexRank;
        boolean occupied;
        PieceColor testSquarePieceColor;
        PieceColor pieceColor;
        
        

            for(int i = 0; i < boardArray.length; i++) {

                square = this.getCurrentSquare();
                squareIndex = square.getIndex();
                squareIndexFile = squareIndex.getFile();
                squareIndexRank = squareIndex.getRank();

                pieceColor = square.getPieceOnSquare().getColor();

                


                for(int j = 0; j < boardArray[i].length; j++) {

                    testingSquare = boardArray[i][j];
                    testingSquareIndex = testingSquare.getIndex();
                    testingSquareIndexFile = testingSquareIndex.getFile();
                    testingSquareIndexRank = testingSquareIndex.getRank();
                    occupied = testingSquare.isOccupied();

                    testSquarePieceColor = testingSquare.getPieceOnSquare().getColor();

                    if(testingSquareIndexFile == squareIndexFile-- && testingSquareIndexRank == squareIndexRank + 2) {
                        if(occupied = true) {
                            if(testSquarePieceColor != pieceColor) {
                                candidateMoves.add(testingSquare);
                            }
                        } else {
                            candidateMoves.add(testingSquare);
                        }
                    }

                    if(testingSquareIndexFile == squareIndexFile++ && testingSquareIndexRank == squareIndexRank + 2) {
                        if(occupied = true) {
                            if(testSquarePieceColor != pieceColor) {
                                candidateMoves.add(testingSquare);
                            }
                        } else {
                            candidateMoves.add(testingSquare);
                        }
                    }

                    if(testingSquareIndexFile == squareIndexFile + 2 && testingSquareIndexRank == squareIndexRank++) {
                        if(occupied = true) {
                            if(testSquarePieceColor != pieceColor) {
                                candidateMoves.add(testingSquare);
                            }
                        } else {
                            candidateMoves.add(testingSquare);
                        }
                    }

                    if(testingSquareIndexFile == squareIndexFile + 2 && testingSquareIndexRank == squareIndexRank--) {
                        if(occupied = true) {
                            if(testSquarePieceColor != pieceColor) {
                                candidateMoves.add(testingSquare);
                            }
                        } else {
                            candidateMoves.add(testingSquare);
                        }
                    }

                    if(testingSquareIndexFile == squareIndexFile++ && testingSquareIndexRank == squareIndexRank - 2) {
                        if(occupied = true) {
                            if(testSquarePieceColor != pieceColor) {
                                candidateMoves.add(testingSquare);
                            }
                        } else {
                            candidateMoves.add(testingSquare);
                        }
                    }

                    if(testingSquareIndexFile == squareIndexFile-- && testingSquareIndexRank == squareIndexRank - 2) {
                        if(occupied = true) {
                            if(testSquarePieceColor != pieceColor) {
                                candidateMoves.add(testingSquare);
                            }
                        } else {
                            candidateMoves.add(testingSquare);
                        }
                    }

                    if(testingSquareIndexFile == squareIndexFile - 2 && testingSquareIndexRank == squareIndexRank++) {
                        if(occupied = true) {
                            if(testSquarePieceColor != pieceColor) {
                                candidateMoves.add(testingSquare);
                            }
                        } else {
                            candidateMoves.add(testingSquare);
                        }
                    }

                    if(testingSquareIndexFile == squareIndexFile - 2 && testingSquareIndexRank == squareIndexRank--) {
                        if(occupied = true) {
                            if(testSquarePieceColor != pieceColor) {
                                candidateMoves.add(testingSquare);
                            }
                        } else {
                            candidateMoves.add(testingSquare);
                        }
                    }


                }
                
            }

        return candidateMoves;

    }

                    


    

    
}
