package com.chess.enums;

import com.chess.exception.PieceNotFoundException;

public enum PieceType {

    PAWN,

    KING,

    QUEEN;

    public static PieceType getPieceType(String pieceType) {
        try {
            return PieceType.valueOf(pieceType);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new PieceNotFoundException(String.format("PieceType %s is not found", pieceType));
        }
    }
}
