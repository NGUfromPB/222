package web.models;

public class Car {
    private String brand;
    private byte series;
    private int model;
    public Car() {

    }
    public Car (String brand, byte series, int model) {
        this.brand=brand;
        this.series=series;
        this.model=model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public byte getSeries() {
        return series;
    }

    public void setSeries(byte series) {
        this.series = series;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
    @Override
    public String toString() {
        return "brand:= "
                + brand+"model:= "
                + model + "series:= "
                + series;
    }
}
