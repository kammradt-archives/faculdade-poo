package RickGuitarStore.v3;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood bWood;
    private Wood tWood;

    public GuitarSpec(Builder builder, String model, Type type, Wood bWood, Wood tWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.bWood = bWood;
        this.tWood = tWood;
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
}
