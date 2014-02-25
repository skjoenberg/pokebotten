import java.awt.Robot;
import java.awt.Color;
import java.awt.AWTException;

public class PokemonIdentify{

    private static final int[] firstPixel = {840,250};
    private static final int[] secondPixel = {810,210};
    private static final int[] thirdPixel = {840,210};
    private static final int[] fourthPixel = {810,250};

    public static Color[] getColors(){
        try {
            Color[] colors = new Color[5];
            Robot robot = new Robot();
            colors[0] = robot.getPixelColor(firstPixel[0],firstPixel[1]);
            colors[1] = robot.getPixelColor(secondPixel[0],secondPixel[1]);
            colors[2] = robot.getPixelColor(thirdPixel[0],thirdPixel[1]);
            colors[3] = robot.getPixelColor(fourthPixel[0],fourthPixel[1]);
        return colors;
         } catch (AWTException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Pokemon newPokemon(String name){
        return (new Pokemon(name, getColors()));
    }
}
