package Labsheet8.exercise1;

public class Bicycle extends Vehicle {
    private int gearCount;
    private boolean hasBell;

    public Bicycle(){
       // setHasBell(false);
    }
    public Bicycle(double price, double length, double height, double weight, String manufacturer, String model, int gearCount, boolean hasBell) {
        super(price, length, height, weight, manufacturer, model);
        this.gearCount = gearCount;
        this.hasBell = hasBell;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public boolean getHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }

    @Override
    public String toString() {
        String str = super.toString() +
                "\n Gear Count: " + getGearCount() +
                "\n Has Bell: ";
                    if(getHasBell()){
                        str += " Yes";
                    }else
                    {
                        str += " No";
                    }

                    return str;
    }
}
