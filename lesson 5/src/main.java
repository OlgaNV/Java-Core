import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        File file = new File("test.csv");
        String[]  headers = {"Температура1", "Температура2", "Температура3"};
        int[][] data = {
                {24, 13, 8},
                {14, 18, 21},
                {20, 5, 24},
        };
        AppData appdata = new AppData(headers, data);
        appdata.save(file);
        appdata.load(file);

    }
}
