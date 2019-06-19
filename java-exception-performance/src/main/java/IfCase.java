public class IfCase implements ICasable {
    @Override
    public int test(int val) {
        if (val < 1000) {
            return val;
        }
        return 0;
    }
}
