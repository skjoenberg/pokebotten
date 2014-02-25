import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Controls {
    // Method for clicking 'a' (z) in pokemmo
    public static void a(){
        ClickAndKeyPress.press(KeyEvent.VK_Z);
    }

    // Method for clicking 'b' (x) in pokemmo
    public static void b(){
        ClickAndKeyPress.press(KeyEvent.VK_X);
    }

    // Method for clicking 'up' in pokemmo
    public static void up(){
        ClickAndKeyPress.press(KeyEvent.VK_UP);
    }

    // Method for clicking 'down' in pokemmo
    public static void down(){
        ClickAndKeyPress.press(KeyEvent.VK_DOWN);
    }

    // Method for clicking 'left' in pokemmo
    public static void left(){
        ClickAndKeyPress.press(KeyEvent.VK_LEFT);
    }

    // Method for clicking 'right' in pokemmo
    public static void right(){
        ClickAndKeyPress.press(KeyEvent.VK_RIGHT);
    }
}
