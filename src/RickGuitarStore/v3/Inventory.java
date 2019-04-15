package RickGuitarStore.v3;

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

    public List search(GuitarSpec wantedGuitarSpec) {
        List foundGuitars = new LinkedList();
        for (Guitar g : guitars) {
            GuitarSpec guitarSpec = g.getSpec();
            if (wantedGuitarSpec.getBuilder() != guitarSpec.getBuilder())
                continue;

            String model = wantedGuitarSpec.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitarSpec.getModel().toLowerCase())))
                continue;

            if (wantedGuitarSpec.getType() != guitarSpec.getType())
                continue;

            if (wantedGuitarSpec.getbWood() != guitarSpec.getbWood())
                continue;

            if (wantedGuitarSpec.gettWood() != guitarSpec.gettWood())
                continue;
            foundGuitars.add(g);
        }
        return foundGuitars;
    }
}