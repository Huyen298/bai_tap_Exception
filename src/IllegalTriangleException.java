public class IllegalTriangleException extends Exception {
    private String messenger;

    public IllegalTriangleException(String messenger) {
        this.messenger = messenger;
    }

    @Override
    public String getMessage() {
        return this.messenger;
    }
}
