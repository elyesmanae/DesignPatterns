package Builder;

public class DemoApp {

	public static void main(String[] args) {
		Director director = new Director();

		CarBuilder builder = new CarBuilder();
		director.constructSportsCar(builder);
		
		Car car = builder.getResult();
		System.out.println("Car built: \n" + car.getCartype());
		
		CarManualBuilder manualBuilder = new CarManualBuilder();
		
		director.constructSportsCar(manualBuilder);
		Manual carManual = manualBuilder.getResult();
		System.out.println("\nCar manual built:\n" + carManual.print());

	}

}
