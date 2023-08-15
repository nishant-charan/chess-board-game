package com.chess.game;

public class Position {

    private final int row;

    private final int column;

    public Position(String position) {
        String numberIndex = position.substring(1,position.length());
        this.row = 8 - Integer.parseInt(numberIndex);
        this.column = position.toCharArray()[0] - 'A';
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
