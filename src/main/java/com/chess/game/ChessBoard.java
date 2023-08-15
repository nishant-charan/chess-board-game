package com.chess.game;

import java.util.stream.IntStream;

public class ChessBoard {

    private static final int A = 65;

    private static final int SIZE = 8;

    public String board[][];

    public ChessBoard() {
        board = new String[SIZE][SIZE];
        IntStream.range(0, SIZE).forEach(i ->
                IntStream.range(0, SIZE).forEach(j ->
                        board[i][j] = (char)(A+j)+String.valueOf(SIZE-i)
                )
        );
    }
}
