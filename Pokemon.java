import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Color;

public class Pokemon {

    private Color first;
    private Color second;
    private Color third;
    private Color fourth;

    private Color[] colors;
    private Color firstColor;
    private Color secondColor;
    private Color thirdColor;
    private Color fourthColor;

    private String name;

    Pokemon(String name, Color[] colorList){
        this.name = name;
        first = colorList[0];
        second = colorList[1];
        third = colorList[2];
        fourth = colorList[3];
    }

}
