import org.sqlite.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbHandler {

    private final String PATH_TD_DB = "src/main/resources/weather";
    private final Connection connection;

    public DbHandler() throws SQLException {
        DriverManager.registerDriver(new JDBC());
        this.connection = DriverManager.getConnection(PATH_TD_DB);
    }

    public void addPupils(Pupils pupils) {

        try (PreparedStatement preparedStatement = this.connection.prepareStatement(
                 "INSERT INTO pupils('city', 'data', 'temperature') VALUES(?, ?, ?)")) {

            preparedStatement.setObject(1, pupils.getCity());
            preparedStatement.setObject(2, pupils.getCity());
            preparedStatement.setObject(3, pupils.getCity());
            preparedStatement.execute();
        }
        catch (SQLException e){
            e.printStackTrace();
            
        }
        

    }
}
