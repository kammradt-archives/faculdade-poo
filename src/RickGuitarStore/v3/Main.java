package RickGuitarStore.v3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory i = new Inventory();

        GuitarSpec guitarSpec1 = new GuitarSpec(Builder.ANY, "A", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD);
        GuitarSpec guitarSpec2 = new GuitarSpec(Builder.COLLINGS, "B", Type.ELECTRIC, Wood.CEDAR, Wood.ADIRONDACK);

        Guitar guitar1 = new Guitar("192312", 1999.9, guitarSpec1);
        Guitar guitar2 = new Guitar("345345", 3999.9, guitarSpec2);
        Guitar guitar3 = new Guitar("123632", 4999.9, guitarSpec1);

        i.addGuitar(guitar1);
        i.addGuitar(guitar2);
        i.addGuitar(guitar3);

        List<Guitar> result = i.search(guitarSpec1);

        result.forEach(System.out::println);


    }
}
