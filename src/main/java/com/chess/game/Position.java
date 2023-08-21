package com.chess.game;

import com.chess.exception.IllegalPositionException;

public class Position {

    private final int row;

    private final int column;

    public Position(String position) {
        String numberIndex = position.substring(1);
        this.row = 8 - Integer.parseInt(numberIndex);
        this.column = position.toCharArray()[0] - 'A';
        if (this.row < 0 || this.column < 0) {
            throw new IllegalPositionException(String.format("Position %s is not valid", position));
        }
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
