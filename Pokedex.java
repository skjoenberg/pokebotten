import java.util.ArrayList;
import java.io.*;

public class Pokedex {
    private ArrayList pokemonList;

    Pokedex() {
        pokemonList = new ArrayList();
    }

    public void addPokemon() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String pokemonName = null;

        try {
            pokemonName = br.readLine();
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
