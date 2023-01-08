package com.Game.Chess.Model.piece;

import java.util.ArrayList;
import java.util.List;

import com.Game.Chess.Model.board.Square;
import com.Game.Chess.Model.board.SquareIndex;

public class Bishop extends Piece implements GetLegalMoves{

    private ArrayList<Square> candidateMoves = new ArrayList<>();

    public Bishop(PieceColor color, int material, Square currentSqaure) {
        super(color, material, currentSqaure);
    }

    @Override
    public List<Square> getMoves(Square[][] boardArray, Square newSquare) {
        
        boolean firstMove = true;
        Square currentSquare;
        Square testingSquare;
        int testingSquareIndexFile;
        int testingSquareIndexRank;
        SquareIndex squareIndex;
        SquareIndex testingSquareIndex;
        int squareIndexFile;
        int squareIndexRank;
        int file;
        int rank;
        boolean occupied;
        PieceColor testSquarePieceColor;
        PieceColor pieceColor;
        Square compareSquare;

                currentSquare = this.getCurrentSquare();
                squareIndexFile = currentSquare.getIndex().getFile();
                squareIndexRank = currentSquare.getIndex().getRank();
                pieceColor = currentSquare.getPieceOnSquare().getColor();

                for(int i = 0; i < 7; i++) {

                    file = squareIndexFile++;
                    rank = squareIndexRank++;
                    testingSquare = boardArray[rank][file];
                    testingSquareIndexFile = testingSquare.getIndex().getFile();
                    testingSquareIndexRank = testingSquare.getIndex().getRank();
                    occupied = testingSquare.isOccupied();
                    testSquarePieceColor = testingSquare.getPieceOnSquare().getColor();

                    if(occupied = false) {
                        candidateMoves.add(testingSquare);
                        file = file + 1;
                        rank = rank + 1;
                    } else {
                        if(testSquarePieceColor != pieceColor) {
                            candidateMoves.add(testingSquare);
                        break;
                        } else {
                            break;
                        } 
                    }

                }

                for(int i = 0; i < 7; i++) {

                    file = squareIndexFile--;
                    rank = squareIndexRank--;
                    testingSquare = boardArray[rank][file];
                    testingSquareIndexFile = testingSquare.getIndex().getFile();
                    testingSquareIndexRank = testingSquare.getIndex().getRank();
                    occupied = testingSquare.isOccupied();
                    testSquarePieceColor = testingSquare.getPieceOnSquare().getColor();

                    if(occupied = false) {
                        candidateMoves.add(testingSquare);
                        file = file - 1;
                        rank = rank - 1;
                    } else {
                        if(testSquarePieceColor != pieceColor) {
                            candidateMoves.add(testingSquare);
                        break;
                        } else {
                            break;
                        } 
                    }

                }    

                for(int i = 0; i < 7; i++) {

                    file = squareIndexFile++;
                    rank = squareIndexRank--;
                    testingSquare = boardArray[rank][file];
                    testingSquareIndexFile = testingSquare.getIndex().getFile();
                    testingSquareIndexRank = testingSquare.getIndex().getRank();
                    occupied = testingSquare.isOccupied();
                    testSquarePieceColor = testingSquare.getPieceOnSquare().getColor();

                    if(occupied = false) {
                        candidateMoves.add(testingSquare);
                        file = file + 1;
                        rank = rank - 1;
                    } else {
                        if(testSquarePieceColor != pieceColor) {
                            candidateMoves.add(testingSquare);
                        break;
                        } else {
                            break;
                        } 
                    }

                }        

                for(int i = 0; i < 7; i++) {

                    file = squareIndexFile--;
                    rank = squareIndexRank++;
                    testingSquare = boardArray[rank][file];
                    testingSquareIndexFile = testingSquare.getIndex().getFile();
                    testingSquareIndexRank = testingSquare.getIndex().getRank();
                    occupied = testingSquare.isOccupied();
                    testSquarePieceColor = testingSquare.getPieceOnSquare().getColor();

                    if(occupied = false) {
                        candidateMoves.add(testingSquare);
                        file = file - 1;
                        rank = rank + 1;
                    } else {
                        if(testSquarePieceColor != pieceColor) {
                            candidateMoves.add(testingSquare);
                        break;
                        } else {
                            break;
                        } 
                    }

                }

        return candidateMoves;

    }

    

    
    
}
