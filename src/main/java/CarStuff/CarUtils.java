package CarStuff;

import java.util.Locale;

public class CarUtils {
    public static String getCarDetails(Car car) {

        String make = car.getMake();
        String model = car.getModel();
        String year = car.getYear();
        String color = car.getColor();
        Double mileage = car.getMileage();
        Boolean isElectric = car.isElectric();

        if (car.getMake() == null || car.getModel() == null || car.getYear() == null) {
            return "Not able to provide you with details ";
        }

        return car.getYear() + " " + car.getMake() + " " + car.getModel() + " " + car.getColor();
    }

    //In CarUtils, write a static void method called addToMileage. This method takes in a car object and a double 'mileageToAdd'
    // The method will set the car's mileage to be equal to the current mileage + the mileageToAdd
    public static void addToMileage(Car car, double mileageToAdd) {
        double mileage = car.getMileage() + mileageToAdd;
        System.out.println(mileage);
    }

    //Then, write a test, following Arrange/Act/Assert which tests whether the new mileage was correctly added.
    // You will probably call car.getMileage in your assertion and compare it to what you expect.

    public static void convertToElectric(Car car, String engineType) {
        if (engineType.toLowerCase().contains("electric")) {
            car.setElectric(true);
        }
    }
}
