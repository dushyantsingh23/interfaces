import model.BMW;
import model.Car;
import model.Maruti;
import service.CarService;

public class Application {

    public static void main(String[] args) {
        CarService carService = new CarService();

        Car bmw = new BMW();
        Car maruti = new Maruti();

        carService.driveCar(bmw);
        carService.driveCar(maruti);
    }
}
