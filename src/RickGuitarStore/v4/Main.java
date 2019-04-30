package RickGuitarStore.v4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GuitarSpec guitarSpec1 = new GuitarSpec(Builder.ANY, "A", Type.ACOUSTIC, 12, Wood.BRAZILIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD);
        GuitarSpec guitarSpec3 = new GuitarSpec(Builder.ANY, "A", Type.ACOUSTIC, 12, Wood.BRAZILIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD);
        GuitarSpec guitarSpec2 = new GuitarSpec(Builder.ANY, "A", Type.ACOUSTIC, 12, Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD);

        System.out.println(guitarSpec1.isEqual(guitarSpec2));
        System.out.println(guitarSpec1.isEqual(guitarSpec3));

    }
}
