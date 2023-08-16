package movement;

import com.chess.game.ChessBoard;
import com.chess.game.Position;
import com.chess.piece.QueenMovement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class QueenMovementTest {

    private final QueenMovement queenMovement = new QueenMovement();

    private String[][] chessBoard;

    @BeforeAll
    public void setup() {
        ChessBoard chessBoard = new ChessBoard();
        this.chessBoard = chessBoard.board;
    }

    @Test
    @DisplayName("Test to check valid positions for Queen when current position is not in edges")
    public void movementPositionsTest_1() {

        List<String> positions = queenMovement.getMovementPositions(chessBoard, new Position("E4"));

        assertEquals(27, positions.size());
        assertThat(positions).containsExactlyInAnyOrder("A4", "B4", "C4", "D4", "F4", "G4", "H4", "E1", "E2", "E3", "E5", "E6", "E7", "E8", "A8", "B7", "C6", "D5", "F3", "G2", "H1", "B1", "C2", "D3", "F5", "G6", "H7");
    }

    @Test
    @DisplayName("Test to check valid positions for King when current position is in edges")
    public void movementPositionsTest_2() {

        List<String> positions = queenMovement.getMovementPositions(chessBoard, new Position("A8"));

        assertEquals(21, positions.size());
        assertThat(positions).containsExactlyInAnyOrder("B7", "C6", "D5", "E4", "F3", "G2", "H1", "A7", "A6", "A5", "A4", "A3", "A2", "A1", "B8", "C8", "D8", "E8", "F8", "G8", "H8");
    }
}
