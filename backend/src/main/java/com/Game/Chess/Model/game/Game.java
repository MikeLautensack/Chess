package com.Game.Chess.Model.game;

import java.util.LinkedList;

import com.Game.Chess.Model.board.Board;

public class Game {

    private int ID;
    private Board board = new Board();
    private Player playerWhite;
    private Player playerBlack;
    private Boolean checkMate = false;
    private Boolean staleMate = false;
    private Color turn = Color.WHITE;
    private LinkedList<Move> gameNotation = new LinkedList<>();

    public Game(int iD, Player playerWhite, Player playerBlack, LinkedList<Move> gameNotation) {
        ID = iD;
        this.playerWhite = playerWhite;
        this.playerBlack = playerBlack;
        this.gameNotation = gameNotation;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getPlayerWhite() {
        return playerWhite;
    }

    public void setPlayerWhite(Player playerWhite) {
        this.playerWhite = playerWhite;
    }

    public Player getPlayerBlack() {
        return playerBlack;
    }

    public void setPlayerBlack(Player playerBlack) {
        this.playerBlack = playerBlack;
    }

    public Boolean getCheckMate() {
        return checkMate;
    }

    public void setCheckMate(Boolean checkMate) {
        this.checkMate = checkMate;
    }

    public Boolean getStaleMate() {
        return staleMate;
    }

    public void setStaleMate(Boolean staleMate) {
        this.staleMate = staleMate;
    }

    public Color getTurn() {
        return turn;
    }

    public void setTurn(Color turn) {
        this.turn = turn;
    }

    public LinkedList<Move> getGameNotation() {
        return gameNotation;
    }

    public void setGameNotation(LinkedList<Move> gameNotation) {
        this.gameNotation = gameNotation;
    }

}
