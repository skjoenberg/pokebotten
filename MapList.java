import java.util.ArrayList;

public class MapList{

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
