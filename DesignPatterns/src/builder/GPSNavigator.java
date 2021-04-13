package builder;

public class GPSNavigator {
	private String route;

	public GPSNavigator() {
		this.route = "Renckstrasse 1, 76135 Karlsruhe";
	}

	public GPSNavigator(String manualRoute) {
		this.route = manualRoute;
	}

	public String getRoute() {
		return route;
	}
}
