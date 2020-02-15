package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update { ;

    private String termine;
    private String sinonimo;
    private String contrario;

    public Update(){

    }

    public String getUpdate() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://eu-cdbr-west-02.cleardb.net/heroku_36d91ccb9e97f8f?user=bf4762acadbdf4&password=48baa9aa");
            Statement stmt = con.createStatement();

            if(stmt.executeUpdate("UPDATE dizionario SET sinonimo='"+this.sinonimo+"',contrario='"+this.contrario+"' WHERE termine='"+termine+"'")==0){
                return "Termine:"+this.termine+" non trovato";
            }else{
                return "Termine:"+this.termine+" modificato";
            }

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
