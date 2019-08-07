package RickGuitarStore.v6.Enums;

public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS;

    public String toString() {
        switch (this) {
            case FENDER:
                return "Fender";
            case MARTIN:
                return "Martin";
            case GIBSON:
                return "Gibson";
            case COLLINGS:
                return "Ecollings";
            case OLSON:
                return "Olson";
            case RYAN:
                return "Ryan";
            case PRS:
                return "PRS";
            default:
                return "unspecified";
        }
    }
}