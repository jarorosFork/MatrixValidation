import java.util.Arrays;
import java.util.Comparator;

/**
 * User: Alexander Nazarenko
 */
public class MatrixBoard {
    private final Row[] rows;
    private final Column[] columns;
    private int totalCount = 0;

    public MatrixBoard(int rows, int col, String[] rowsNumbers, String[] columnNumbers) {
        this.rows = new Row[rows];
        for (int i = 0; i < rows; i++) {
            this.rows[i] = new Row(col);
            this.rows[i].setIndex(i);
            final int rowNumber = Integer.parseInt(rowsNumbers[i]);
            this.setBucketToRow(i, rowNumber);
        }
        this.columns = new Column[col];
        for (int i = 0; i < col; i++) {
            this.columns[i] = new Column(rows);
            this.columns[i].setIndex(i);
            final int columnNumber = Integer.parseInt(columnNumbers[i]);
            this.setBucketsToColumn(i, columnNumber);
        }
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(final int totalCount) {
        this.totalCount = totalCount;
    }

    public void setBucketToRow(int index, int numOfFullBuckets) {
        this.rows[index].setCount(numOfFullBuckets);
    }

    public void setBucketsToColumn(int index, int numOfFullBuckets) {
        this.columns[index].setCount(numOfFullBuckets);
    }

    public int sizeOfRows() {
        return this.rows.length;
    }

    public int sizeOfColumns() {
        return this.columns.length;
    }

    public Row getRow(int index) {
        return this.rows[index];
    }

    public Column getColumn(int index) {
        return this.columns[index];
    }

    public void sortColumns() {
        Arrays.sort(this.columns, new Comparator<Column>() {
            @Override
            public int compare(final Column o1, final Column o2) {
                return o1.getCount() < o2.getCount() ? 1 : o1.getCount() >  o2.getCount() ? -1 : 0;  //To change body of implemented methods use File | Settings | File Templates.
            }
        });

    }

    @Override
    public String toString() {
        return "MatrixBoard{" +
                "rows=" + Arrays.toString(rows) +
                ", columns=" + Arrays.toString(columns) +
                '}';
    }
}
