import java.util.Arrays;

/**
 * User: Alexander Nazarenko
 */
public class Row {
    private final int[] buckets;
    private int count = 0;
    private int index = -1;

    public Row(int countOfBuckets){
        this.buckets = new int[countOfBuckets];
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(final int index) {
        this.index = index;
    }

    public int getCount() {
        return count;
    }

    public void setCount(final int count) {
        this.count = count;
    }

    public int[] getBuckets() {
        return buckets;
    }

    @Override
    public String toString() {
        return "Row{" +
                "buckets=" + Arrays.toString(buckets) +
                ", count=" + count +
                '}';
    }
}
