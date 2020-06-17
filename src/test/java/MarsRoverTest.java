import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MarsRoverTest {

    @Test
    void roverMovesForwardWhenItReceivesFCommand() {
        MarsRover rover = new MarsRover(0, 0, "N");

        rover.moveForward();

        assertThat(rover.getPosition()).isEqualTo(new int[]{0, 1});
    }
}
