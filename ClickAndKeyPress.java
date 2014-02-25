import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class ClickAndKeyPress {
    private static int pressDelay = 500;
    private static int clickDelay = 500;

    public static void leftClick(){
        try{
            Robot robot = new Robot();
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.delay(clickDelay);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void press(int key){
        try{
            Robot robot = new Robot();
            robot.keyPress(key);
            robot.delay(pressDelay);
            robot.keyRelease(key);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
