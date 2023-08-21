package com.chess.game;

import com.chess.enums.PieceType;
import com.chess.piece.Movement;
import com.chess.piece.MovementFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Chess {

    private final ChessBoard chessBoard;

    public Chess(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public List<String> findValidMovementPositions(String input) {
        List<String> inputList = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(input, ", ");
        while (tokenizer.hasMoreTokens()) {
            inputList.add(tokenizer.nextToken());
        }
        String pieceTypeStr = inputList.get(0).toUpperCase();
        String currentPosition = inputList.get(1).toUpperCase();

        PieceType pieceType = PieceType.getPieceType(pieceTypeStr);
        MovementFactory movementFactory = new MovementFactory();
        Movement movement = movementFactory.movementByPieceType(pieceType);
        return movement.getMovementPositions(chessBoard.board, new Position(currentPosition));
    }
}
