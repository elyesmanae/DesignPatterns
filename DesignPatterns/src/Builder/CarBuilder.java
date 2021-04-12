package Builder;

public class CarBuilder implements Builder {
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;
	private CarType type;

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}

	public Car getResult() {
		return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
	}

	@Override
	public void setCarType(CarType type) {
		this.type = type;
	}

	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
	}
}
