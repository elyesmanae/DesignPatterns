package factoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoApp {

	private static Dialog dialog;

	public static void main(String[] args) throws IOException {
		configure();
		runBusinessLogic();
	}

	static void configure() throws IOException {
		BufferedReader entry = new BufferedReader(
				new InputStreamReader(System.in));
		String osName = entry.readLine();
		if (osName.equals("Windows 10")) {
			dialog = new WindowsDialog();
		} else {
			dialog = new HtmlDialog();
		}

	}

	static void runBusinessLogic() {
		dialog.renderWindow();

	}

}
