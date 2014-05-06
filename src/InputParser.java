import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

/**
 * User: Alexander Nazarenko
 */
public final class InputParser {
    private final static Logger LOG = Logger.getLogger(InputParser.class.getName());

    private static BufferedReader createReader() {
        return new BufferedReader(new InputStreamReader(System.in));
    }

    public static MatrixBoard readTestCase() throws IOException {
        final BufferedReader bufferedReader = createReader();
        final String[] numbers = bufferedReader.readLine().split(" ");
        final int rows = Integer.parseInt(numbers[0]);
        final int columns = Integer.parseInt(numbers[1]);
        final String[] rowsNumbers = bufferedReader.readLine().split(" ");
        final String[] columnNumbers = bufferedReader.readLine().split(" ");

        return new MatrixBoard(rows, columns, rowsNumbers, columnNumbers);
    }


}
