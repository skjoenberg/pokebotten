import java.io.*;
import java.util.Scanner;

public class Init {

    public static void main(String[] args) {
        Pokedex pokedex;
        MapList mapList;

        ObjectInputStream objIn;

        //Loading poke.dex file
        try{
            objIn = new ObjectInputStream(new FileInputStream("Poke.dex"));
            pokedex = (Pokedex) objIn.readObject();
            objIn.close();
            System.out.println("Pokedex loaded successfully");
        } catch (IOException | ClassNotFoundException e) {
            pokedex = new Pokedex();
            System.out.println("Pokedex did not load successfully");
        }

        //Loading list.maps file
        try{
            objIn = new ObjectInputStream(new FileInputStream("list.maps"));
            mapList = (MapList) objIn.readObject();
            objIn.close();
            System.out.println("Maplist loaded successfully");
        } catch (IOException | ClassNotFoundException e) {
            mapList = new MapList();
            System.out.println("Maplist did not load successfully");
        }
    }
}
