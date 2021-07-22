import CarStuff.Car;
import CarStuff.CarUtils;
import org.junit.Assert;
import org.junit.Test;

public class CarDetailsTests {

    @Test
    public void getCarDetails_GivenValidCar_ReturnsExpectedString() {
        //Arrange
        Car car = new Car();
        car.setMake("Ford");
        car.setModel("Mustang");
        car.setYear("2019");


        //Act
        String details = CarUtils.getCarDetails(car);

        //Assert
        Assert.assertEquals("2019 Ford Mustang", details);
    }

    @Test
    public void getCarDetails_GivenOneNullValues_ReturnsErrorString() {

        //Arrange
        Car car = new Car();
        car.setMake("Ford");
        car.setModel("Mustang");
        //we did not set the year


        //Act
        String details = CarUtils.getCarDetails(car);

        ///Assert
        Assert.assertEquals("Ford Mustang", details);

    }

    @Test
    public void getCarDetails_GivenTwoNullValues_ReturnsErrorString() {

        //Arrange
        Car car = new Car();
        car.setMake("Ford");
      ///missing two values


        //Act
        String details = CarUtils.getCarDetails(car);

        ///Assert
        Assert.assertEquals("Ford", details);
    }

    @Test
    public void getCarDetails_GivenThreeNullValues_ReturnsErrorString() {

        //Arrange
        Car car = new Car();
        car.setMake("Ford");
        car.setModel("Mustang");
        car.setYear("2019");
        car.setColor("Black");


        //Act
        String details = CarUtils.getCarDetails(car);

        ///Assert
        Assert.assertEquals("2019 Ford Mustang Black", details);
    }
}