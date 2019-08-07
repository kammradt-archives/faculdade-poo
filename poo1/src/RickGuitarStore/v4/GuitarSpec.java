package RickGuitarStore.v4;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private int numStrings;
    private Wood bWood;
    private Wood tWood;

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood bWood, Wood tWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numStrings = numStrings;
        this.bWood = bWood;
        this.tWood = tWood;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getbWood() {
        return bWood;
    }

    public void setbWood(Wood bWood) {
        this.bWood = bWood;
    }

    public Wood gettWood() {
        return tWood;
    }

    public void settWood(Wood tWood) {
        this.tWood = tWood;
    }

    public boolean isEqual(GuitarSpec spec) {
        boolean isEqual = true;
        if (this.builder != spec.builder)
            isEqual = false;
        if (this.model.isEmpty() && !this.model.equals(spec.model))
            isEqual = false;
        if (this.type != spec.type)
            isEqual = false;
        if (this.numStrings != spec.numStrings)
            isEqual=  false;
        if (this.bWood != spec.bWood)
            isEqual=  false;
        if (this.tWood != spec.tWood)
            isEqual=  false;

        return isEqual;
    }

}
