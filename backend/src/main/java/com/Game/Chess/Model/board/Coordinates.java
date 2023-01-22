package com.Game.Chess.Model.Board;

public class Coordinates {

    private int file;
    private int rank;
    private String id;
    private static File[] fileArr = File.values();

    public Coordinates(int file, int rank, String id) {

        this.file = file;
        this.rank = rank;
        this.id = id;

    }

    public static Coordinates build(Coordinates current, int fileOffset, int rankOffset) {
        return new Coordinates(current.getFile() + fileOffset, current.getRank() + rankOffset,
                fileArr[current.getFile() + fileOffset].toString()
                        .concat(String.valueOf(current.getRank() + rankOffset)));
    }

    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Coordinates [file=" + file + ", rank=" + rank + ", id=" + id + "]";
    }

}
