import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Controls {
    public static void a(){
        ClickAndKeyPress.press(KeyEvent.VK_Z);
    }

    public static void b(){
        ClickAndKeyPress.press(KeyEvent.VK_X);
    }

    public static void up(){
        ClickAndKeyPress.press(KeyEvent.VK_UP);
    }

    public static void down(){
        ClickAndKeyPress.press(KeyEvent.VK_DOWN);
    }

    public static void left(){
        ClickAndKeyPress.press(KeyEvent.VK_LEFT);
    }

    public static void right(){
        ClickAndKeyPress.press(KeyEvent.VK_RIGHT);
    }
}
