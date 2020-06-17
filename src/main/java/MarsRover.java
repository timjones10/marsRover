public class MarsRover {

    private int xAxis;
    private int yAxis;
    private String facingDirection;

    public MarsRover(int xAxis, int yAxis, String facingDirection) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.facingDirection = facingDirection;
    }

    public int[] getPosition() {
        return new int[]{xAxis, yAxis};
    }

    public void move(char[] directions) {
        if ("N".equals(facingDirection)) {
            handleNorthFacingRoverMovement(directions[0]);
        }
        if ("S".equals(facingDirection)) {
            handleSouthFacingRoverMovement(directions[0]);
        }
        if ("E".equals(facingDirection)) {
            if (directions[0] == 'F') {
                xAxis++;
            }
        }
    }


    private void handleNorthFacingRoverMovement(char direction) {
        if (direction == 'F') {
            yAxis++;
        }
        if (direction == 'B') {
            yAxis--;
        }
        if (direction == 'L') {
            xAxis--;
        }
        if (direction == 'R') {
            xAxis++;
        }
    }

    private void handleSouthFacingRoverMovement(char direction) {
        if (direction == 'F') {
            yAxis--;
        }
        if (direction == 'B') {
            yAxis++;
        }
        if (direction == 'L') {
            xAxis++;
        }
        if (direction == 'R') {
            xAxis--;
        }
    }
}
