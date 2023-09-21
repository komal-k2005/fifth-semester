import java.util.Iterator;

class NumberGenerator implements Iterable<Integer> {
    private final int start;
    private final int end;

    public NumberGenerator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int current = start;

            @Override
            public boolean hasNext() {
                return current <= end;
            }

            @Override
            public Integer next() {
                return current++;
            }
        };
    }
}

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator(1, 5);
        for (int num : generator) {
            System.out.println(num);
        }
    }
}