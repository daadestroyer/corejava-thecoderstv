package customizeexception;

public class TooLateToMarryException extends RuntimeException {
	TooLateToMarryException(String message) {
		super(message);
	}
}
