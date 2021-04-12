package AbstractFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoApp {
	
	private static Application configureApplication() throws IOException {
		Application app;
		GUIFactory factory;
		BufferedReader entry = new BufferedReader(
				new InputStreamReader(System.in));
		String osName = entry.readLine();
		if (osName.contains("mac")) {
			factory = new MacOSFactory();
			app = new Application(factory);
		} else if (osName.contains("win")) {
			factory = new WindowsFactory();
			app = new Application(factory);
		}
		else throw new IOException("No data found for this entry !!");
		return app;
	}

	public static void main(String[] args) throws IOException {
		Application app = configureApplication();
		app.paint();
	}

}
