public class ExceptionCase implements ICasable {
    @Override
    public int test(int val) {
        try {
            val = val / 2;
            return val;
        } catch (ArithmeticException ex) {
            return val;
        }
    }
}
