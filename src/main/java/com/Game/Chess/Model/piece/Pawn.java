package com.Game.Chess.Model.piece;

import java.util.ArrayList;

import com.Game.Chess.Model.game.getLegalMoves;
import com.Game.Chess.Model.board.Square;
import com.Game.Chess.Model.board.squareIndex;

public class Pawn extends Piece implements getLegalMoves{

    private ArrayList<Square> candidateMoves = new ArrayList<>();

    Pawn(pieceColor color, int material, Square currentSquare) {
        super(color, material, currentSquare);
        
        this.material = 1;
        this.currentSquare = null;
        
    }

    @Override
    public ArrayList<Square> getMoves(Square[][] boardArray, Square newSquare) {
        
        boolean firstMove = true;
        Square square;
        Square testingSquare;
        int testingSquareIndexFile;
        int testingSquareIndexRank;
        squareIndex squareIndex;
        squareIndex testingSquareIndex;
        int squareIndexFile;
        int squareIndexRank;
        boolean occupied;
        pieceColor testSquarePieceColor;
        pieceColor pieceColor;
        
        

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

                    if(firstMove = true) {

                        if(testingSquareIndexFile == squareIndexFile && testingSquareIndexRank == squareIndexRank++) {
                            if(occupied = false) {
                                candidateMoves.add(testingSquare);

                            }
    
                        }

                        if(testingSquareIndexFile == squareIndexFile && testingSquareIndexRank == squareIndexRank + 2) {
                            if(occupied = false) {
                                candidateMoves.add(testingSquare);
                                
                            }
    
                        }

                        if(testingSquareIndexFile == squareIndexFile++ && testingSquareIndexRank == squareIndexRank++) {
                            if(occupied = true) {
                                if(testSquarePieceColor != pieceColor) {
                                    candidateMoves.add(testingSquare); 
                                }
                                
                            }
    
                        }

                        if(testingSquareIndexFile == squareIndexFile-- && testingSquareIndexRank == squareIndexRank++) {
                            if(occupied = true) {
                                if(testSquarePieceColor != pieceColor) {
                                    candidateMoves.add(testingSquare); 
                                }
                                  
                            }
    
                        }

                    } else {

                        if(testingSquareIndexFile == squareIndexFile && testingSquareIndexRank == squareIndexRank++) {
                            if(occupied = false) {
                                candidateMoves.add(testingSquare);

                            }
    
                        }

                        if(testingSquareIndexFile == squareIndexFile++ && testingSquareIndexRank == squareIndexRank++) {
                            if(occupied = true) {
                                if(testSquarePieceColor != pieceColor) {
                                    candidateMoves.add(testingSquare); 
                                }
                                
                            }
    
                        }

                        if(testingSquareIndexFile == squareIndexFile-- && testingSquareIndexRank == squareIndexRank++) {
                            if(occupied = true) {
                                if(testSquarePieceColor != pieceColor) {
                                    candidateMoves.add(testingSquare); 
                                }
                                
                                
                            }
    
                        }

                    }  

                }

            }
          
         return candidateMoves;

    }
    


}
