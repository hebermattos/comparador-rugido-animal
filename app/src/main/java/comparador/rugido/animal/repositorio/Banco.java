package comparador.rugido.animal.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Banco implements IRepositorioVencedores {

    public ArrayList<String> buscarVencedores() {

        ArrayList<String> listaVencedores = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/animais?useSSL=false&useTimezone=true&serverTimezone=UTC", "root",
                    "admin");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from vencedores");

            while (rs.next()) {
                listaVencedores.add(rs.getString(2));
            }

            con.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaVencedores;

    }

    public void salvarVencedor(String animalVencendor) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/animais?useSSL=false&useTimezone=true&serverTimezone=UTC", "root",
                    "admin");

            Statement stmt = con.createStatement();
            stmt.execute("INSERT INTO Vencedores (TipoAnimal) VALUES ('" + animalVencendor + "');");

            con.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
