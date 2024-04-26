package bd.practicatercertrim;

import java.sql.Connection;

public class baseDatos {

    public Connection conectar() {
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/peluqueria", "root", "root");
            return connect;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
