package customizeexception;

public class TooEarlyToMarryException extends RuntimeException {
	TooEarlyToMarryException(String message){
		super(message);
	}
}
