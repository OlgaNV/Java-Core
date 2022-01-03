import java.sql.SQLException;

public class main {

    public static void  main(String[] args) throws SQLException {

        Pupils pupils = new Pupils("Moscow",  15,  6);

        DbHandler dbHandler = new DbHandler();

        dbHandler.addPupils(pupils);

    }

}
