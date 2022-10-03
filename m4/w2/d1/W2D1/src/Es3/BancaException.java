package Es3;

public class BancaException extends Exception {

	private String stringErr;

	public BancaException(String message, String err) {
		super(message);
		this.stringErr = message +" "+ err;
	}

	public String getStringErr() {
		return stringErr;
	}

	@Override
	public String toString() {
		return stringErr  ;

	}

}
