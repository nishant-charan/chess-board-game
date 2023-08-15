package movement;

import com.chess.game.ChessBoard;
import com.chess.game.Position;
import com.chess.piece.KingMovement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class KingMovementTest {

    private final KingMovement kingMovement = new KingMovement();

    private String[][] chessBoard;

    @BeforeAll
    public void setup() {
        ChessBoard chessBoard = new ChessBoard();
        this.chessBoard = chessBoard.board;
    }

    @Test
    @DisplayName("Test to check valid positions for King when current position is not in edges")
    public void movementPositionsTest_1() {

        List<String> positions = kingMovement.getMovementPositions(chessBoard, new Position("E5"));

        assertEquals(8, positions.size());
        assertThat(positions).containsExactlyInAnyOrder("D4", "D5", "D6", "E6", "F6", "F5", "F4", "E4");
    }

    @Test
    @DisplayName("Test to check valid positions for King when current position is in edges")
    public void movementPositionsTest_2() {

        List<String> positions = kingMovement.getMovementPositions(chessBoard, new Position("H8"));

        assertEquals(3, positions.size());
        assertThat(positions).containsExactlyInAnyOrder("G8", "G7", "H7");
    }
}
