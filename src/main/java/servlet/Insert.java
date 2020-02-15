package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert { ;

    private String termine;
    private String sinonimo;
    private String contrario;

    public Insert(){

    }

    public String getInsert() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://eu-cdbr-west-02.cleardb.net/heroku_36d91ccb9e97f8f?user=bf4762acadbdf4&password=48baa9aa");
            Statement stmt = con.createStatement();

            stmt.executeUpdate("INSERT INTO dizionario (termine, sinonimo, contrario) VALUES ('"+this.termine+"', '"+this.sinonimo+"','"+this.contrario+"')");

            return "Inserimento Eseguito";

        } catch (Exception e) {
            return "Internal Error";
        }

    }

    public void setTermine(String termine) {
        this.termine = termine;
    }

    public void setSinonimo(String sinonimo) {
        this.sinonimo = sinonimo;
    }

    public void setContrario(String contrario) {
        this.contrario = contrario;
    }
}
