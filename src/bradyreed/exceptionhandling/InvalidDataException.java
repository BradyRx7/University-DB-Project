package bradyreed.exceptionhandling;

public class InvalidDataException extends Exception {

    public InvalidDataException() {
        super();
    }
    
    public InvalidDataException(String errorMessage) {
        super(errorMessage);
    }
}
