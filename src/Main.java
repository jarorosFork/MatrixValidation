import java.io.IOException;

/**
 * User: Alexander Nazarenko
 */
public class Main {
    public static void main(final String... args) {
        try {
           calculate();
        } catch (Exception e){
            System.out.println("No");
        }

    }

    private static void calculate() throws IOException {
        final MatrixBoard matrixBoard = InputParser.readTestCase();
        matrixBoard.sortColumns();
        boolean columnWithCount  = false;
        boolean rowWithCount  = false;
        for (int i = 0; i < matrixBoard.sizeOfColumns(); i++) {
            final Column column = matrixBoard.getColumn(i);
            for (int countOfBuckets = 0; countOfBuckets < column.getBuckets().length; countOfBuckets++) {
                final Row row = matrixBoard.getRow(countOfBuckets);
                if (row.getCount() > 0 && column.getCount() > 0) {
                    if( column.getBuckets()[countOfBuckets] > 0 || row.getBuckets()[column.getIndex()] > 0){
                        break;
                    }
                    column.getBuckets()[countOfBuckets] += 1;
                    row.getBuckets()[column.getIndex()] += 1;
                    row.setCount(row.getCount() - 1);
                    column.setCount(column.getCount() - 1);
                }
                rowWithCount = row.getCount() > 0;
                columnWithCount = column.getCount() > 0;
            }
        }

        if(columnWithCount || rowWithCount){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

}
