import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Map {
    private Scanner in;

    private final char rock = '#';
    private final char grass = 'g';
    private final char road = ' ';
    private final char water ='w';

    private char[][] map;
    private int width;
    private int height;

    private String name;

    public Map(String mapName){
        this.name = mapName;
        this.map = null;
    }

    public void readMap(String fileName){
        try{
            File file = new File(fileName);
            in = new Scanner(file);
            width = in.nextInt();
            height = in.nextInt();

            for (int i = 0; height > i; i++){
                char[] line = in.nextLine().toCharArray();
                for (int j = 0; width > j; j++){
                    map[j][i] = line[j];
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean isRock(int x, int y){
        return (map[x][y] == rock);
    }

    public boolean isWater(int x, int y){
        return (map[x][y] == water);
    }

    public boolean isGrass(int x, int y){
        return (map[x][y] == grass);
    }

    public boolean isRoad(int x, int y){
        return (map[x][y] == road);
    }
}
