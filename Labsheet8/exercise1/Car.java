package Labsheet8.exercise1;

public class Car extends Vehicle {

    private int maxPassengers;
    private String registrationNumber;

    public Car(){

    }

    public Car(double price, double length, double height, double weight, String manufacturer, String model, int maxPassengers, String registrationNumber) {
        super(price, length, height, weight, manufacturer, model);
        this.maxPassengers = maxPassengers;
        this.registrationNumber = registrationNumber;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMax Passengers: " + getMaxPassengers() +
                "\n Registration Number: " + getRegistrationNumber();
    }
}
