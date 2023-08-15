package com.chess;

import com.chess.game.Chess;
import com.chess.game.ChessBoard;

import java.util.List;
import java.util.Scanner;

public class ChessMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input in format (chess-piece, position) : ");
        String input = scanner.nextLine();
        Chess chess = new Chess(new ChessBoard());
        List<String> positions = chess.findValidMovementPositions(input);

        System.out.println("Valid Position(s) : "
                + ((positions.size()>0) ? String.join(",", positions) : "None"));
    }
}