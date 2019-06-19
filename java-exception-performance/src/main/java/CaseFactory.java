public class CaseFactory {
    private CaseFactory() {
    }

    public static IfCase ifCase() {
        return new IfCase();
    }

    public static ExceptionCase exceptionCase() {
        return new ExceptionCase();
    }

    public static ExceptionThrownCase exceptionThrownCase() {
        return new ExceptionThrownCase();
    }
}
