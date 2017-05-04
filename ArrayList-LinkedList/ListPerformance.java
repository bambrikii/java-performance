import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListPerformance {
    public static void main(String[] args) {
	int n = 4_00_000;
	int n2 = 1_00_000;
	ListPerformance p = new ListPerformance();
	p.getL1(n, new LinkedList<>());
	p.getL1(n, new ArrayList<>());
	p.getL2(n, new LinkedList<>());
	p.getL2(n, new ArrayList<>());
	p.getL3(n2, new LinkedList<>());
	p.getL3(n2, new ArrayList<>());
    }

    private void getL1(int n, List<Integer> arr2) {
	long l = 0;
	long start;
	long stop;
	for (int i = 0; i < n; i++) {
	    Integer i1 = i;
	    start = System.currentTimeMillis();
	    arr2.add(0, i1);
	    stop = System.currentTimeMillis();
	    l += stop - start;
	}
	System.out.println("add(0): " + arr2.getClass().getName() + ": " + l);
    }

    private void getL2(int n, List<Integer> arr2) {
	long l = 0;
	long start;
	long stop;
	for (int i = 0; i < n; i++) {
	    Integer i1 = i;
	    start = System.currentTimeMillis();
	    arr2.add(i1);
	    stop = System.currentTimeMillis();
	    l += stop - start;
	}
	System.out.println("addLast(): " + arr2.getClass().getName() + ": " + l);
    }

    private void getL3(int n, List<Integer> arr2) {
	long l = 0;
	long start;
	long stop;
	for (int i = 0; i < n; i++) {
	    Integer i1 = i;
	    int last = arr2.size();
	    if (last != 0) {
		last = last / 2;
	    }
	    start = System.currentTimeMillis();
	    arr2.add(last, i1);
	    stop = System.currentTimeMillis();
	    l += stop - start;
	}
	System.out.println("addMiddle(): " + arr2.getClass().getName() + ": " + l);
    }
}
