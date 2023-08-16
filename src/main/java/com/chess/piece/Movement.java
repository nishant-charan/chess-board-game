package com.chess.piece;

import com.chess.game.Position;

import java.util.List;

@FunctionalInterface
public interface Movement {

    List<String> getMovementPositions(String[][] board, Position position);

    default Boolean isValidPosition(int row, int column, int boardSize) {
        return row > -1 && row < boardSize && column > -1 && column < boardSize;
    }
}
