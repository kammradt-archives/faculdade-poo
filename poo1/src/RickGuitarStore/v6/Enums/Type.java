package RickGuitarStore.v6.Enums;

public enum Type {
    ACOUSTIC, ELECTRIC;

    public String toString() {
        switch (this) {
            case ACOUSTIC:
                return "acoustic";
            case ELECTRIC:
                return "electric";
            default:
                return "unspecified";
        }
    }
}
