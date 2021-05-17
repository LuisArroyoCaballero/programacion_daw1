package U9.ArroyoCaballeroExamenU8_U9;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderModel {
    public static Integer insertOrder(Order order) throws SQLException {
        Integer rowsAffected=0;
        Connection con= ConexionDB.getConnection();

        String sql="INSERT INTO orders VALUES (?,?,?,?,?,?,?)";
        PreparedStatement sentencia=con.prepareStatement(sql);

        sentencia.setInt(1,order.getOrderNumber());
        sentencia.setString(2, order.getOrderDate());
        sentencia.setString(3, order.getRequiredDate());
        sentencia.setDate(4, (Date) order.getShippedDate());
        sentencia.setString(5,order.getStatus());
        sentencia.setString(6,order.getComments());
        sentencia.setInt(7,order.getCustomerNumber());

        rowsAffected=sentencia.executeUpdate();

        return rowsAffected;
    }
}
