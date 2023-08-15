package com.chess.piece;

import com.chess.game.Position;

import java.util.List;

public interface Movement {

    List<String> getMovementPositions(String[][] board, Position position);
}
