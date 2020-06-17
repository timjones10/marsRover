import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MarsRoverTest {

    @Test
    void roverFacingNorthReceivesMoveForwardCommand() {
        MarsRover rover = new MarsRover(0, 0, "N");

        rover.move(new char[]{'F'});

        assertThat(rover.getPosition()).isEqualTo(new int[]{0, 1});
    }

    @Test
    void roverFacingNorthReceivesMoveBackwardCommand() {
        MarsRover rover = new MarsRover(0, 0, "N");

        rover.move(new char[]{'B'});

        assertThat(rover.getPosition()).isEqualTo(new int[]{0, -1});
    }

    @Test
    void roverFacingNorthReceivesMoveLeftCommand() {
        MarsRover rover = new MarsRover(0, 0, "N");

        rover.move(new char[]{'L'});

        assertThat(rover.getPosition()).isEqualTo(new int[]{-1, 0});
    }

    @Test
    void roverFacingNorthReceivesMoveRightCommand() {
        MarsRover rover = new MarsRover(0, 0, "N");

        rover.move(new char[]{'R'});

        assertThat(rover.getPosition()).isEqualTo(new int[]{1, 0});
    }

    @Test
    void roverFacingSouthReceivesMoveForwardCommand() {
        MarsRover rover = new MarsRover(0, 0, "S");

        rover.move(new char[]{'F'});

        assertThat(rover.getPosition()).isEqualTo(new int[]{0, -1});
    }

    @Test
    void roverFacingSouthReceivesMoveBackwardsCommand() {
        MarsRover rover = new MarsRover(0, 0, "S");

        rover.move(new char[]{'B'});

        assertThat(rover.getPosition()).isEqualTo(new int[]{0, 1});
    }

    @Test
    void roverFacingSouthReceivesMoveLeftCommand() {
        MarsRover rover = new MarsRover(0, 0, "S");

        rover.move(new char[]{'L'});

        assertThat(rover.getPosition()).isEqualTo(new int[]{1,0});
    }

    @Test
    void roverFacingSouthReceivesMoveRightCommand(){
        MarsRover rover = new MarsRover(0,0,"S");

        rover.move(new char[]{'R'});

        assertThat(rover.getPosition()).isEqualTo(new int[]{-1, 0});
    }

    @Test
    void roverFacingEastReceivesMoveForwardCommand(){
        MarsRover rover = new MarsRover(0,0,"E");

        rover.move(new char[]{'F'});

        assertThat(rover.getPosition()).isEqualTo(new int[]{1,0});
    }
}
