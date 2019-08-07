package RickGuitarStore.v1;

public class Guitar {
    private String serialNumber;
    private double price;
    private String builder;
    private String model;
    private String type;
    private String bWood;
    private String tWood;

    public Guitar(String serialNumber, double price, String builder, String model, String type, String bWood, String tWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getbWood() {
        return bWood;
    }

    public void setbWood(String bWood) {
        this.bWood = bWood;
    }

    public String gettWood() {
        return tWood;
    }

    public void settWood(String tWood) {
        this.tWood = tWood;
    }

}
