package RickGuitarStore.v4;

public class Guitar {
    private String serialNumber;
    private double price;
    GuitarSpec spec;

    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
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

    public GuitarSpec getSpec() {
        return spec;
    }

    public void setSpec(GuitarSpec spec) {
        this.spec = spec;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Result: ").append(this.serialNumber).append("\n");
        sb.append("Builder: ").append(this.spec.getBuilder()).append("\n");
        sb.append("Model: ").append(this.spec.getModel()).append("\n");
        sb.append("Type: ").append(this.spec.getType()).append("\n");
        sb.append("Back Wood: ").append(this.spec.getbWood()).append("\n");
        sb.append("Top Wood: ").append(this.spec.gettWood()).append("\n");
        sb.append("Price: ").append(this.price).append("\n");

        return sb.toString();
    }
}
