package Lindsoft;

import java.util.LinkedHashMap;
import java.util.Map;

public class PlanetList {

    private final String listName;
    private Map<String, Planet> list;

    public PlanetList(String listName) {
        this.listName = listName;
        this.list = new LinkedHashMap<>();
    }

    public void addPlanet(String name, Planet planet) {
        list.put(name, planet);
    }

    public void removePlanet(String name) {
        list.remove(name);
    }

    @Override
    public String toString() {
        String returnString = "";
        System.out.println(list.size());
        for (Map.Entry<String, Planet> entry : list.entrySet()) {
            returnString += "Planet name: " + entry.getValue().getHostName() + "\n Radius: " + entry.getValue().getRa() + "\t Dec: " + entry.getValue().getDec() + "\n";
        }

        return returnString;
    }
}
