package U9.ArroyoCaballeroExamenU8_U9;

import com.google.gson.Gson;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Consultas {
    public static void main(String[] args) {
        mostrarOficinas();
    }

    public static void mostrarOficinas() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/classicmodels?user=root&password="
                    + "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");

            String sql = "select * from offices";
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();

            List<Office> oficinas = new ArrayList<>();
            Gson gson =new Gson();

            while (rs.next()) {
                String codigoOficina = rs.getString("officeCode");
                String ciudad = rs.getString("city");
                String telefono = rs.getString("phone");
                String primeraDireccion = rs.getString("addressLine1");
                String segundaDireccion = rs.getString("addressLine2");
                String estado = rs.getString("state");
                String pais = rs.getString("country");
                String codigoPostal = rs.getString("postalCode");
                String territorio = rs.getString("territory");

                Office office = new Office(codigoOficina,ciudad,telefono,primeraDireccion,segundaDireccion,estado,pais,codigoPostal,territorio);
                oficinas.add(office);


            }
            System.out.println(gson.toJson(oficinas));

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
