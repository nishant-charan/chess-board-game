package com.chess.piece;

import com.chess.game.Position;

import java.util.ArrayList;
import java.util.List;

public class PawnMovement implements Movement {

    @Override
    public List<String> getMovementPositions(String[][] board, Position position) {
        List<String> validPositions = new ArrayList<>();

        if (position.getRow() != 0) {
            validPositions.add(board[position.getRow() - 1][position.getColumn()]);
        }

        return validPositions;
    }
}
