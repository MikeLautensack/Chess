package com.Game.Chess.Model.gameroom;

import java.util.ArrayList;

import com.Game.Chess.Model.game.Game;
import com.Game.Chess.Model.user.User;

public class GameRoom {

    private String roomName;
    private String roomPassword;
    private GameRoomConnectionType connection;
    private GameRoomAccess access;
    private int gameRoomID;
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Game> games = new ArrayList<>();

    public GameRoom(String roomName, String roomPassword, GameRoomConnectionType connection, GameRoomAccess access, int gameRoomID) {
        this.roomName = roomName;
        this.roomPassword = roomPassword;
        this.connection = connection;
        this.access = access;
        this.gameRoomID = gameRoomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomPassword() {
        return roomPassword;
    }

    public void setRoomPassword(String roomPassword) {
        this.roomPassword = roomPassword;
    }

    public GameRoomConnectionType getConnection() {
        return connection;
    }

    public void setConnection(GameRoomConnectionType connection) {
        this.connection = connection;
    }

    public GameRoomAccess getAccess() {
        return access;
    }

    public void setAccess(GameRoomAccess access) {
        this.access = access;
    }

    public int getGameRoomID() {
        return gameRoomID;
    }

    public void setGameRoomID(int gameRoomID) {
        this.gameRoomID = gameRoomID;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    

}
