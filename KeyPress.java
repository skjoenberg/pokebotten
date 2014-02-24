import java.awt.Robot;

public static class ClickAndKeyPress {
    private int pressDelay = 500;

    Robot robot = new Robot();
    public static void press(int key){
        robot.keyPress(key);
        robot.delay(pressDelay);
        robot.keyRelease(key);
    }
}
