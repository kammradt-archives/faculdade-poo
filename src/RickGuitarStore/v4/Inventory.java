package RickGuitarStore.v4;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        this.guitars = new LinkedList();
    }

    public void addGuitar(Guitar guitar) {
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar g : guitars) {
            if (g.getSerialNumber().equals(serialNumber)) {
                return g;
            }
        }
        return null;
    }

    public List search(GuitarSpec spec) {
        List matchingGuitars = new LinkedList();
        for (Guitar g : this.guitars) {
            if (g.getSpec().isEqual(spec)){
                matchingGuitars.add(g);
            }
        }
        return matchingGuitars;
    }
}