package Esercizio_m1w2d1;

public class StudentNameException extends RuntimeException {
	
	private String errName;
	
	public StudentNameException(String message, String eN) {
		super(message);
		this.errName = eN;
	}

	public String getErrName() {
		return errName;
	}
	
	
}
