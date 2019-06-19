public class ExceptionThrownCase implements ICasable {
    @Override
    public int test(int val) {
        try {
            val = val / (val * 2 - val * 2);
            return val;
        } catch (ArithmeticException ex) {
            return 0;
        }
    }
}
