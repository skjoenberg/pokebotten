import java.util.ArrayList;
import java.io.Serializable;

public class MapList implements Serializable{

    private ArrayList<Map> maplist;

    public MapList(){
        maplist = new ArrayList<Map>();
    }

    public void addMap(String mapName, String fileName){
        Map map = new Map(mapName);
        map.readMap(fileName);
        maplist.add(map);
    }
}
