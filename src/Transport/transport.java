package Transport;

public class transport {

    private String model;
    private int yearOfManufacture;
    private String countryOfManufacture;
    private int maximumSpeed;
    private String make;
    private double fuel;
    private String refill;
    private int category;

    public transport(String model, int yearOfManufacture, String countryOfManufacture, int maximumSpeed, String make, double fuel, int category) {
        this.model = validation.validateString(model);
        this.yearOfManufacture = validation.validateYear(yearOfManufacture);
        this.countryOfManufacture = validation.validateString(countryOfManufacture);
        this.maximumSpeed = validation.validateSpeed(maximumSpeed);
        this.make = validation.validateString(make);
        this.fuel = validation.validateRefiel(fuel);
        if (category <= 0 || category > 6 ){
            this.category=category;
        }else this.category=1;
    }

  public String refill(int category) {
        String fuel = "";
        String fuel1 = " дизель";
        String fuel2 = " бензин";
        String fuel3 = " электричество";
        String fuel4 = " газ";
        if (category == 1) {
            fuel = fuel1;
        } else if (category == 2) {
            fuel = fuel2;
        } else if (category == 3) {
            fuel = fuel3;
        } else if (category == 4) {
            fuel = fuel4;
        } else if (category == 5) {
            fuel = fuel1 + " и " + fuel2;
        } else if (category == 6) {
            fuel = fuel1 + " , " + fuel2 + " и " + fuel3;
        }
        System.out.println(fuel);
        return fuel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = validation.validateString(make);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = validation.validateString(model);
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public void print() {
        System.out.println("transport{" +
                "model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", countryOfManufacture='" + countryOfManufacture + '\'' +
                ", maximumSpeed=" + maximumSpeed +
                ", make='" + make + '\'');
    }

    @Override
    public String toString() {
        return "transport{" +
                "model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", countryOfManufacture='" + countryOfManufacture + '\'' +
                ", maximumSpeed=" + maximumSpeed +
                ", make='" + make + '\'' +
                '}';
    }
}
