package m5w2d1es.ExceptionControl;


public class BookingException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public BookingException(String message) {
		super(message);
	}

}