package RickGuitarStore.v1;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory(){
        this.guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, String builder, String model, String type, String bWood, String tWood){
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, bWood, tWood);
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

    public Guitar search(Guitar searchGuitar) {
        for (Guitar g : guitars) {
            String builder = searchGuitar.getBuilder();
            if (builder != null && !builder.equals("") && !builder.equals(g.getBuilder()) )
                continue;

            String model = searchGuitar.getModel();
            if (model != null && !model.equals("") && !model.equals(g.getModel()) )
                continue;

            String type = searchGuitar.getType();
            if (type != null && !searchGuitar.equals("") && !type.equals(g.getType()) )
                continue;

            String bWood = searchGuitar.getbWood();
            if (bWood != null && !bWood.equals("") && !bWood.equals(g.getbWood()) )
                continue;

            String tWood = searchGuitar.gettWood();
            if (tWood != null && !tWood.equals("") && !tWood.equals(g.gettWood()) )
                continue;

            return g;
        }
        return null;
    }
}
