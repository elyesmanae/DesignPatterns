package factoryMethod;

public class HtmlDialog extends Dialog {

	@Override
	protected Button createButton() {

		return new HtmlButton();
	}

}
