package Transport;

public class train extends transport{
    private int trioPrice;
    private int tripTime;
    private String stationName;
    private String finalStop;
    private int numberOfWagons;

    public train(String model, int yearOfManufacture, String countryOfManufacture, int maximumSpeed, String make, double fuel,
                 int category, int trioPrice, int tripTime, String stationName, String finalStop, int numberOfWagons) {
        super(model, yearOfManufacture, countryOfManufacture, maximumSpeed, make, fuel, category);
        this.trioPrice = trioPrice;
        this.tripTime = tripTime;
        this.stationName = stationName;
        this.finalStop = finalStop;
        this.numberOfWagons = numberOfWagons;
    }

    public train(String model, int yearOfManufacture, String countryOfManufacture, int maximumSpeed,
                 String make, int trioPrice, int tripTime, String stationName, String finalStop, int numberOfWagons, double fuel,int category) {
        super(model, yearOfManufacture, countryOfManufacture, maximumSpeed, make,fuel,category);
        this.trioPrice = trioPrice;
        this.tripTime = tripTime;
        this.stationName = validation.validateString(stationName);
        this.finalStop = validation.validateString(finalStop);;
        this.numberOfWagons = numberOfWagons;
    }

    public void print(){
    System.out.println("Поезд{" +
            "модель : " + getModel()  +
            " год производитель : " + getYearOfManufacture() +
            " страна выпуска : " + getCountryOfManufacture() + '\'' +
            " максимальная скорость : " + getMaximumSpeed()+
            " название : " + getMake() );
}
    @Override
    public String toString() {
        return "train{" +
                "trioPrice=" + trioPrice +
                ", tripTime=" + tripTime +
                ", stationName='" + stationName + '\'' +
                ", finalStop='" + finalStop + '\'' +
                ", numberOfWagons=" + numberOfWagons +
                '}';
    }

    public int getTrioPrice() {
        return trioPrice;
    }

    public void setTrioPrice(int trioPrice) {
        this.trioPrice = trioPrice;
    }

    public int getTripTime() {
        return tripTime;
    }

    public void setTripTime(int tripTime) {
        this.tripTime = tripTime;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }
}
