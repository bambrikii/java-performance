import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class CaseTest {
    private int n;
    private Random rnd;
    private int bound;

    @Before
    public void before() {
        n = 100000000;
        rnd = new Random();
        bound = 1000000;
    }

    private void testPerformance(ICasable cs) {
        long start = 0;
        for (int i = 0; i < n; i++) {
            int val = rnd.nextInt(bound);
            start -= System.currentTimeMillis();
            cs.test(val);
            start += System.currentTimeMillis();
        }
        System.out.println(start);
    }

    @Test
    public void testIf() {
        testPerformance(CaseFactory.ifCase());
    }

    @Test
    public void testException() {
        testPerformance(CaseFactory.exceptionCase());
    }

    @Test
    public void testExceptionThrown() {
        testPerformance(CaseFactory.exceptionThrownCase());
    }
}
