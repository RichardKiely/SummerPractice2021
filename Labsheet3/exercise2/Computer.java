package Labsheet3.exercise2;

/*Computer class is an instantiable class as we will create an object and call
an instance of this class in our main  (TestComputer.java)*/
public class Computer {

    //globally defined attributes
    private String manufacturer;
    private String type;
    private double speed;
    private int RAM;
    private double price;

    // no argument constructor
    public Computer(){

        // set attribute default values
        manufacturer = "Not available";
        type = "Not available";
        speed = 0;
        RAM = 0;
        price = 0;
    }

    //multi argument constructor
    public Computer(String manufacturer,String type, double speed, int RAM, double price){

        // "this" keyword is used to distinguish between the attribute and the argument in the constructor
        this.manufacturer = manufacturer;
        this.type = type;
        this.speed = speed;
        this.RAM = RAM;
        this.price = price;
    }
    //accessor methods (often known as "getters")allows us to get the value of the attribute
    public String getManufacturer() {
        return manufacturer;
    }
    //accessor methods (often known as "getters")allows us to get the value of the attribute
    public String getType() {
        return type;
    }
    //accessor methods (often known as "getters")allows us to get the value of the attribute
    public double getSpeed() {
        return speed;
    }
    //accessor methods (often known as "getters")allows us to get the value of the attribute
    public int getRAM() {
        return RAM;
    }
    //accessor methods (often known as "getters")allows us to get the value of the attribute
    public double getPrice() {
        return price;
    }
    //mutator methods (often known as "setters")allows us to set the value of the attribute
    public void setManufacturer(String manufacturer) {

        this.manufacturer = manufacturer;
    }
    //mutator methods (often known as "setters")allows us to set the value of the attribute
    public void setType(String type) {

        this.type = type;
    }
    //mutator methods (often known as "setters")allows us to set the value of the attribute
    public void setSpeed(double speed) {
        //basic testing to prevent negative values been supplied
        if(speed >0)
        this.speed = speed;
    }
    //mutator methods (often known as "setters")allows us to set the value of the attribute
    public void setRAM(int RAM) {
        //basic testing to prevent negative values been supplied
        if(RAM >0)
        this.RAM = RAM;
    }
    //mutator methods (often known as "setters") allows us to set the value of the attribute
    public void setPrice(double price) {
        //basic testing to prevent negative values been supplied
        if(price >0)
        this.price = price;
    }

    //toString is used to return the state of an object (the values of it's attributes)
    @Override
    public String toString() {
        return " Manufacturer: " + getManufacturer() + " Type: " + getType()  + " Speed: " + getSpeed() +
                " RAM: " + getRAM() + " Price: " + getPrice() ;
    }
}

/*This OO technique of grouping together the attributes of a class and the methods
that will act on those attributes is called encapsulation. To the outside world,
it provides a public interface and hides the data and is a key feature of OO program design.
It means that the implementation details of a class can change and, as long as the public
interface remains the same (or we just add to it), the end users of the class are unaffected
and their code need not change. As mentioned earlier, it also means that the data of an object
cannot be put into an “inconsistent state”, as long as some error-checking is done within the public mutators.
 */