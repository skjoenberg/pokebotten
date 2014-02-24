import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Move {
    public static void moveUp(){
        ClickAndKeyPress.press(KeyEvent.VK_UP);
    }

    public static void moveDown(){
        ClickAndKeyPress.press(KeyEvent.VK_DOWN);
    }

    public static void moveLeft(){
        ClickAndKeyPress.press(KeyEvent.VK_LEFT);
    }

    public static void moveRight(){
        ClickAndKeyPress.press(KeyEvent.VK_RIGHT);
    }
}
