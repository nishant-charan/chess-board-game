package game;

import com.chess.game.Position;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionTest {

    @Test
    @DisplayName("Get row and column for G4")
    public void getPosition_1() {
        String positionStr = "G4";
        Position position = new Position(positionStr);

        assertEquals(4, position.getRow(), "Wrong row!");
        assertEquals(6, position.getColumn(), "Wrong column!");
    }

    @Test
    @DisplayName("Get row and column for B2")
    public void getPosition_2() {
        String positionStr = "B2";
        Position position = new Position(positionStr);

        assertEquals(6, position.getRow(), "Wrong row!");
        assertEquals(1, position.getColumn(), "Wrong column!");
    }
}
