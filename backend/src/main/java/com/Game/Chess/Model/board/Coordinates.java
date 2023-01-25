package com.Game.Chess.Model.board;

import java.util.HashMap;
import java.util.Map;

public class Coordinates {

    private int file;
    private int rank;
    private String id;

    public Coordinates(int file, int rank, String id) {

        this.file = file;
        this.rank = rank;
        this.id = id;

    }

    public static Coordinates build(Coordinates current, int fileOffset, int rankOffset) {
        Map<Integer, String> map = new HashMap<>();

        map.put(0, "a");
        map.put(1, "b");
        map.put(2, "c");
        map.put(3, "d");
        map.put(4, "e");
        map.put(5, "f");
        map.put(6, "g");
        map.put(7, "h");

        int newFile = current.getFile() + fileOffset;
        int newRank = current.getRank() + rankOffset;
        String id;

        if (map.containsKey(newFile)) {
            id = map.get(newFile).concat(String.valueOf(newRank));
        } else {
            id = "".concat(String.valueOf(newRank));
        }

        return new Coordinates(newFile, newRank, id);
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
