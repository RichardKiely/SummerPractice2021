package Labsheet5.exercise3;

public class Thermometer {
    private int currentTemperature;
    private int maximumTemperature;
    private int minimumTemperature;

    public Thermometer(){

        currentTemperature = 0;
        maximumTemperature = Integer.MIN_VALUE;
        minimumTemperature = Integer.MAX_VALUE;
    }
    public Thermometer(int currentTemperature) {
        setCurrentTemperature(currentTemperature);
        setMaximumTemperature(maximumTemperature);
        setMinimumTemperature(minimumTemperature);

    }

    public void setTemperature(int currentTemperature){
        setCurrentTemperature(currentTemperature);
        updateMaxMinTemp();


    }

    private void updateMaxMinTemp(){
        if(currentTemperature > maximumTemperature)
            maximumTemperature = currentTemperature;

        if(currentTemperature < minimumTemperature)
            minimumTemperature = currentTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public int getMaximumTemperature() {
        return maximumTemperature;
    }

    public void setMaximumTemperature(int maximumTemperature) {
        this.maximumTemperature = maximumTemperature;
    }

    public int getMinimumTemperature() {
        return minimumTemperature;
    }

    public void setMinimumTemperature(int minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
    }

    @Override
    public String toString() {
        return " Current Temperature: " + getCurrentTemperature() + "\n" +
                " Maximum Temperature: " + getMaximumTemperature() + "\n" +
                " Minimum Temperature: " + getMinimumTemperature() + "\n" ;
    }
}
