package game;

import com.chess.exception.IllegalPositionException;
import com.chess.exception.PieceNotFoundException;
import com.chess.game.Chess;
import com.chess.game.ChessBoard;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ChessTest {

    private Chess chess = new Chess(new ChessBoard());

    @Test
    @DisplayName("Throw Exception when piece is not found")
    void findAllValidMovementTest_1() {
        assertThatCode(() -> chess.findValidMovementPositions("Bishop, G6"))
                .isExactlyInstanceOf(PieceNotFoundException.class)
                .hasMessage("PieceType BISHOP is not found");
    }

    @Test
    @DisplayName("Throw Exception when position is not valid")
    void findAllValidMovementTest_2() {
        assertThatCode(() -> chess.findValidMovementPositions("Pawn, D9"))
                .isExactlyInstanceOf(IllegalPositionException.class)
                .hasMessage("Position D9 is not valid");
    }

    @Test
    @DisplayName("Throw Exception when piece is pawn and position is valid")
    void findAllValidMovementTest_3() {
        List<String> validPositions = chess.findValidMovementPositions("pawn, G1");

        assertThat(validPositions).containsExactlyInAnyOrder("G2");
    }

    @Test
    @DisplayName("Throw Exception when piece is king and position is valid")
    void findAllValidMovementTest_4() {
        List<String> validPositions = chess.findValidMovementPositions("king, D1");

        assertThat(validPositions).containsExactlyInAnyOrder("C1","C2","D2","E2","E1");
    }

    @Test
    @DisplayName("Throw Exception when piece is queen and position is valid")
    void findAllValidMovementTest_5() {
        List<String> validPositions = chess.findValidMovementPositions("queen, E4");

        assertThat(validPositions).containsExactlyInAnyOrder("A4", "B4", "C4", "D4", "F4", "G4", "H4", "E1", "E2", "E3", "E5", "E6", "E7", "E8", "A8", "B7", "C6", "D5", "F3", "G2", "H1", "B1", "C2", "D3", "F5", "G6", "H7");
    }
}
