import java.io.*;

public class AppData {
    String[] headers;
    int[][] data;

    public AppData(String[] headers, int[][] data) {
        this.headers = headers;
        this.data = data;
    }

    public void save(File file) throws IOException {
        try (BufferedWriter bufferedOutputStream = new BufferedWriter(new FileWriter(file))) {
            bufferedOutputStream.write(headers[0] + ";" + headers[1] + ";" + headers[2] + "\n");

            for (int i = 0; i < data.length; i++) {
                bufferedOutputStream.write(data[i][0] + ";" + data[i][1] + ";" + data[i][2] + "\n");

            }
        }


    }

    public String load(File file) throws IOException {
        String data;
        try (BufferedReader bufferedOutputStream = new BufferedReader(new FileReader(file))) {
            headers = bufferedOutputStream.readLine().split(";");
            int cout = 0;
            while ((data = bufferedOutputStream.readLine()) != null) {
                cout++;
            }
            this.data = new int[cout][3];
            int i;
            for (i = 0; i < cout; i++) {
                String[] tmp = bufferedOutputStream.readLine().split(";");
                for (int j = 0; j < 3; j++) {
                    this.data[i][j] = Integer.parseInt(tmp[j]);
                }

            }
        }

        System.out.println();


        return data;
    }

}
