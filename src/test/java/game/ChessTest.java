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
                .hasMessage("Position D9 is not found");
    }

    @Test
    @DisplayName("Throw Exception when piece is found and position is valid")
    void findAllValidMovementTest_3() {
        List<String> validPositions = chess.findValidMovementPositions("pawn, G1");

        assertThat(validPositions).containsExactlyInAnyOrder("G2");
    }
}
