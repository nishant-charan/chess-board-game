package movement;

import com.chess.game.ChessBoard;
import com.chess.game.Position;
import com.chess.piece.PawnMovement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PawnMovementTest {

    private final PawnMovement pawnMovement = new PawnMovement();

    private String[][] chessBoard;

    @BeforeAll
    public void setup() {
        ChessBoard chessBoard = new ChessBoard();
        this.chessBoard = chessBoard.board;
    }

    @Test
    @DisplayName("Test to check valid positions for Pawn when movement is possible")
    void movementPositionsTest_1() {

        List<String> positions = pawnMovement.getMovementPositions(chessBoard, new Position("G1"));

        assertEquals(1, positions.size());
        assertThat(positions).containsExactly("G2");
    }

    @Test
    @DisplayName("Test to check valid positions for Pawn when movement is not possible")
    void movementPositionsTest_2() {

        List<String> positions = pawnMovement.getMovementPositions(chessBoard, new Position("D8"));

        assertEquals(0, positions.size());
    }
}
