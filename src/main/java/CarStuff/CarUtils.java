package CarStuff;

public class CarUtils {
    public static String getCarDetails(Car car){

        String make = car.getMake();
        String model = car.getModel();
        String year = car.getYear();
        String color = car.getColor();
        Double mileage = car.getMileage();
        Boolean isElectric = car.isElectric();

        if(make == null || model == null || year == null){
            return "Not able to provide you with details ";
        }

        return  year + " " + make + " " + model;
    }
}
