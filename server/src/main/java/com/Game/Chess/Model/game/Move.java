package com.Game.Chess.Model.game;

public class Move {

    private int moveNumber;
    private String whitesMove;
    private String blacksMove;

    public Move(int moveNumber, String whitesMove, String blacksMove) {
        this.moveNumber = moveNumber;
        this.whitesMove = whitesMove;
        this.blacksMove = blacksMove;
    }

    public int getMoveNumber() {
        return moveNumber;
    }

    public void setMoveNumber(int moveNumber) {
        this.moveNumber = moveNumber;
    }

    public String getWhitesMove() {
        return whitesMove;
    }

    public void setWhitesMove(String whitesMove) {
        this.whitesMove = whitesMove;
    }

    public String getBlacksMove() {
        return blacksMove;
    }

    public void setBlacksMove(String blacksMove) {
        this.blacksMove = blacksMove;
    }

}
