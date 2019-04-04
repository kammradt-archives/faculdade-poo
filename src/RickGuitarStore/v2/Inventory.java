package RickGuitarStore.v2;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        this.guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, String model, Double price, Builder builder, Type type, Wood bWood, Wood tWood) {
        Guitar g = new Guitar(serialNumber, model, price, builder, type, bWood, tWood);
        guitars.add(g);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar g : guitars) {
            if (g.getSerialNumber().equals(serialNumber)) {
                return g;
            }
        }
        return null;
    }

    public List search(Guitar wantedGuitar) {
        List foundGuitars = new LinkedList();
        for (Guitar g : guitars ) {
            if (wantedGuitar.getBuilder() != g.getBuilder())
                continue;

            String model = wantedGuitar.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) && (!model.equals(g.getModel().toLowerCase())))
                continue;

            if (wantedGuitar.getType() != g.getType())
                continue;

            if (wantedGuitar.getbWood() != g.getbWood())
                continue;

            if (wantedGuitar.gettWood() != g.gettWood())
                continue;

            foundGuitars.add(g);
        }
        return foundGuitars;
    }

}
