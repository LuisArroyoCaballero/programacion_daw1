package U9.ArroyoCaballeroExamenU8_U9;

import U9.Entregable2021.ConexionDB;
import U9.Entregable2021.Office;
import U9.Entregable2021.OfficeModel;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

public class Transacciones {
    public static void main(String[] args) {
        insertarPedido();
    }
    public static void insertarPedido() {
        Connection con= ConexionDB.getConnection();

        try{
            con.setAutoCommit(false);
            OrderModel.insertOrder(
                    new Order(
                            10020,
                            "1999-01-01",
                            "1999-01-01",
                            null,
                            "Shipped",
                            null,
                            112));

            OrderDetailsModel.insertOrderDetails(
                    new OrderDetails(
                            10020,
                            "S10_1678",
                            4,
                            48.81,
                            3));
            OrderDetailsModel.insertOrderDetails(
                    new OrderDetails(
                            10020,
                            "S18_2248",
                            2,
                            33.30,
                            4));
            con.commit();


        }catch (SQLException e){
            System.out.println("error: " +e.getMessage());
            try{
                if (con!=null){
                    con.rollback();
                }
            } catch (SQLException throwables){
                throwables.printStackTrace();
            }
        }

    }
}
