package U9.Entregable2021;

import java.sql.Connection;
import java.sql.SQLException;

public class Transacciones {
    private static ConexionDB ConexionBD;

    public static void main(String[] args) {
        Connection con= ConexionDB.getConnection();

        try{
            con.setAutoCommit(false);
            OfficeModel.insertOffice(
                    new Office(
                            "9",
                            "ljkasndlkasjdlkasjd",
                            "+34 955 123 123",
                            "Avda Castilleja",
                            "default",
                            "",
                            "Spain",
                            "41940",
                            "EMEA"));

            System.out.println("Insertada oficina");
            con.commit();


        }catch (SQLException e){
            System.out.println("error: " +e.getMessage());
            try{
                if (con!=null){
                    System.out.println("Dejamos la BBDD en estado consistente.");
                    con.rollback();
                }
            } catch (SQLException throwables){
                System.out.println("Error en el rollback");
                throwables.printStackTrace();
            }
        }
    }
}
