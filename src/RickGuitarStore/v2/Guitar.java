package RickGuitarStore.v2;

public class Guitar {
    private String serialNumber;
    private String model;
    private Double price;
    private Builder builder;
    private Type type;
    private Wood bWood;
    private Wood tWood;

    public Guitar(String serialNumber, String model, Double price, Builder builder, Type type, Wood bWood, Wood tWood) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.price = price;
        this.builder = builder;
        this.type = type;
        this.bWood = bWood;
        this.tWood = tWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
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
