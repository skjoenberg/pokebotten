import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Pokedex {
    private ArrayList pokemonList;

    Pokedex() {
        pokemonList = new ArrayList();
    }

    public void addPokemon() {
        Scanner in = new Scanner(System.in);

        String pokemonName = null;

        try {
            pokemonName = in.nextLine();
            System.out.println(pokemonName);
            Thread.sleep(4000);
            pokemonList.add(PokemonIdentify.newPokemon(pokemonName));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("IO error trying to read the pokemon name!");
            System.exit(1);
        }
    }
}
