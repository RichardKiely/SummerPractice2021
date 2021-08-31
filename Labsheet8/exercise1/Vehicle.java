package Labsheet8.exercise1;

public class Vehicle {

    private double price;
    private double length;
    private double height;
    private double weight;
    private String manufacturer;
    private String model;

    public Vehicle() {

    }

    public Vehicle(double price, double length, double height, double weight, String manufacturer, String model) {
        this.price = price;
        this.length = length;
        this.height = height;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Price " + getPrice() +
                "\n Length: " + getLength() +
                "\n Height: " + getHeight() +
                "\n Weight: " + getWeight() +
                "\n Manufacturer: " + getManufacturer() +
                "\n Model: " + getModel() ;
    }
}
