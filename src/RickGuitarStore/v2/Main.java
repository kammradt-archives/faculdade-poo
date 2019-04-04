package RickGuitarStore.v2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory i = new Inventory();
        i.addGuitar("11277","Model 1",2999.99, Builder.FENDER,    Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD);
        i.addGuitar("12312","Model 2",1999.99, Builder.COLLINGS,  Type.ELECTRIC, Wood.ALDER,           Wood.INDIAN_ROSEWOOD);
        i.addGuitar("44234","Model 3",3999.99, Builder.GIBSON,    Type.ACOUSTIC, Wood.CEDAR,           Wood.SITKA);
        i.addGuitar("23421","Model 2",6999.99, Builder.COLLINGS,  Type.ELECTRIC, Wood.ALDER,           Wood.INDIAN_ROSEWOOD);

        Guitar wanted = new Guitar("12312","Model 2",1999.99, Builder.COLLINGS, Type.ELECTRIC, Wood.ALDER, Wood.INDIAN_ROSEWOOD);
        List<Guitar> found = i.search(wanted);

        if (!found.isEmpty()) {
            for (Guitar g : found) {
                StringBuilder sb = new StringBuilder();
                    sb.append("Result: ").append("\n");
                    sb.append("Builder: ").append(g.getBuilder()).append("\n");
                    sb.append("Model: ").append(g.getModel()).append("\n");
                    sb.append("Type: ").append(g.getType()).append("\n");
                    sb.append("Back Wood: ").append(g.getbWood()).append("\n");
                    sb.append("Top Wood: ").append(g.gettWood()).append("\n");
                    sb.append("Price: ").append(g.getPrice()).append("\n");

                System.out.println(sb.toString());
            }
        }else{
            System.out.println("No matches.");
        }

    }
}
