import java.util.Arrays;

/**
 * User: Alexander Nazarenko
 */
public class Column {
    private int [] buckets;
    private int count = 0;
    private int index = -1;

    public Column(int numOfBuckets){
        this.buckets = new int[numOfBuckets];
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

    public void setBuckets(final int[] buckets) {
        this.buckets = buckets;
    }

    @Override
    public String toString() {
        return "Column{" +
                "buckets=" + Arrays.toString(buckets) +
                ", count=" + count +
                '}';
    }
}
