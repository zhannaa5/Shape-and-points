import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class AssignmentOne {

    private String text;
    Shape shape;

    public AssignmentOne(String filePath) {
        shape = new Shape();

        File myObj = new File(filePath);
        Scanner myReader;
        try {
            myReader = new Scanner(myObj);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (myReader.hasNextLine()) {
            String[] data = myReader.nextLine().split(", ");
            int x = Integer.parseInt(data[0]);
            int y = Integer.parseInt(data[1]);
            Point point = new Point(x, y);
            shape.addPoint(point);
        }
        myReader.close();
    }
}
