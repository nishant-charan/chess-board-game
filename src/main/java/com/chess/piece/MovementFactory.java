package com.chess.piece;

import com.chess.enums.PieceType;

public class MovementFactory {

    public Movement movementByPieceType(PieceType pieceType) {
        switch (pieceType) {
            case PAWN:
                return new PawnMovement();
            case KING:
                return null;
            case QUEEN:
                return null;
            default:
                throw new IllegalArgumentException("Unknown piece : " + pieceType.name());
        }
    }
}
