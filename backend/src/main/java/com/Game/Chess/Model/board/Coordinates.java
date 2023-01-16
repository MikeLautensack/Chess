package com.Game.Chess.Model.board;

public class Coordinates {

    private String file;
    private String rank;
    private String coordinate;

    Coordinates(String file, String rank, String coordinate) {

        this.file = file;
        this.rank = rank;
        this.coordinate = coordinate;

    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public String toString() {
        return "Coordinates [file=" + file + ", rank=" + rank + ", coordinate=" + coordinate + "]";
    }

}
