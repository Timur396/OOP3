package Transport;

public class Bus extends Transport {
    public Bus(String model, int yearOfManufacture, String countryOfManufacture, int maximumSpeed, String make, double fuel, int category) {
        super(model, yearOfManufacture, countryOfManufacture, maximumSpeed, make,fuel,category);
    }
        public void print(){
            System.out.println("Поезд{" +
                    "модель : " + getModel()  +
                    " год производитель : " + getYearOfManufacture() +
                    " страна выпуска : " + getCountryOfManufacture() + '\'' +
                    " максимальная скорость : " + getMaximumSpeed()+
                    " название : " + getMake() );
        }

}
