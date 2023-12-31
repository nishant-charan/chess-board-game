package com.chess.piece;

import com.chess.game.Position;

import java.util.ArrayList;
import java.util.List;

public class QueenMovement implements Movement {

    @Override
    public List<String> getMovementPositions(String[][] board, Position position) {
        List<String> validPositions = new ArrayList<>();

        int[][] movementDirections = {
                {-1,0}, {1,0},  //vertical
                {0,-1}, {0,1},  //horizontal
                {-1,-1}, {-1,1}, {1,-1},{1,1} //diagonal
        };

        for (int[] direction : movementDirections) {
            int newRow = position.getRow() + direction[0];
            int newCol = position.getColumn() + direction[1];

            while(isValidPosition(newRow, newCol, board.length)) {
                validPositions.add(board[newRow][newCol]);
                newRow += direction[0];
                newCol += direction[1];
            }
        }

        return validPositions;
    }
}
