package RickGuitarStore.v1;

public class Main {
    public static void main(String[] args) {
        Guitar g = new Guitar("5", 5999.99, "Puma", "RTX", "Eletric", "Green", "Cyan");

        Inventory inventory = new Inventory();
        inventory.addGuitar("1", 1999.99, "Fender", "XPS",    "Eletric",  "Red",    "Black");
        inventory.addGuitar("2", 2999.99, "Topper", "GTX",    "Acoustic", "Black",  "Write");
        inventory.addGuitar("3", 3999.99, "Nike",   "Radeon", "Eletric",  "Yellow", "Brown");
        inventory.addGuitar("4", 5999.99, "Puma",   "RTX",    "Eletric",  "Green",  "Cyan");
        inventory.addGuitar("5", 6999.99, "Adidas", "Top",    "Acoustic", "Blue",   "Top");

        Guitar result = inventory.search(g);


        if (result != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Result: ").append("\n");
            sb.append("Builder: ").append(result.getBuilder()).append("\n");
            sb.append("Model: ").append(result.getModel()).append("\n");
            sb.append("Type: ").append(result.getType()).append("\n");
            sb.append("Back Wood: ").append(result.getbWood()).append("\n");
            sb.append("Top Wood: ").append(result.gettWood()).append("\n");
            sb.append("Price: ").append(result.getPrice()).append("\n");

            System.out.println(sb.toString());
        } else {
            System.out.println("No match.");
        }
    }
}
