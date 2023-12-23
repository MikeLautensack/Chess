package com.Game.Chess.Model.game;

import com.Game.Chess.Model.user.User;

public class Player {

    private User user;
    private Color color;

    public Player(User user, Color color) {
        this.user = user;
        this.color = color;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
