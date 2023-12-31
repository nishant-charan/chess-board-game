package com.chess.piece;

import com.chess.enums.PieceType;

public class MovementFactory {

    public Movement movementByPieceType(PieceType pieceType) {
        switch (pieceType) {
            case PAWN:
                return new PawnMovement();
            case KING:
                return new KingMovement();
            case QUEEN:
                return new QueenMovement();
            default:
                throw new IllegalArgumentException("Unknown piece : " + pieceType.name());
        }
    }
}
