import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MarsRoverTest {

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("N",'F',0,1),
                Arguments.of("N",'B',0,-1),
                Arguments.of("N",'L',-1,0),
                Arguments.of("N",'R',1,0),
                Arguments.of("S",'F',0,-1),
                Arguments.of("S",'B',0,1)
//                Arguments.of("S",'L',1,)
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void roverFacingNorthReceivesMoveForwardCommand(
            String facingDirection, char movement, int x, int y
    ) {
        MarsRover rover = new MarsRover(0, 0, facingDirection);

        rover.move(new char[]{movement});

        assertThat(rover.getPosition()).isEqualTo(new int[]{x, y});
    }

//    @Test
//    void roverFacingNorthReceivesMoveBackwardCommand() {
//        MarsRover rover = new MarsRover(0, 0, "N");
//
//        rover.move(new char[]{'B'});
//
//        assertThat(rover.getPosition()).isEqualTo(new int[]{0, -1});
//    }

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

    @Test
    void roverFacingEastReceivesMoveBackwordsCommand(){
        MarsRover rover = new MarsRover(0,0,"E");

        rover.move(new char[]{'B'});

        assertThat(rover.getPosition()).isEqualTo(new int[]{-1,0});
    }

    @Test
    void roverFacingEastReceivesMoveLeftCommand(){
        MarsRover rover = new MarsRover(0,0,"E");

        rover.move(new char[]{'L'});

        assertThat(rover.getPosition()).isEqualTo(new int[]{0,1});
    }

    @Test
    void roverFacingEastReceivesMoveRightCommand(){
        MarsRover rover = new MarsRover(0,0,"E");

        rover.move(new char[]{'R'});

        assertThat(rover.getPosition()).isEqualTo(new int[]{0,-1});
    }
}
