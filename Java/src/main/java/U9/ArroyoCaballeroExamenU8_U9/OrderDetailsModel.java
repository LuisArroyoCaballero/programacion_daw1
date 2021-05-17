package U9.ArroyoCaballeroExamenU8_U9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDetailsModel {
    private static ConexionDB ConexionBD;

    public static Integer insertOrderDetails(OrderDetails orderDetails) throws SQLException {
        Integer rowsAffected=0;
        Connection con= ConexionDB.getConnection();

        String sql="INSERT INTO orderdetails VALUES (?,?,?,?,?)";
        PreparedStatement sentencia=con.prepareStatement(sql);

        sentencia.setInt(1,orderDetails.getOrderNumber());
        sentencia.setString(2,orderDetails.getProductCode());
        sentencia.setInt(3,orderDetails.getQuantityOrdered());
        sentencia.setDouble(4,orderDetails.getPriceEach());
        sentencia.setInt(5,orderDetails.getOrderNumber());

        rowsAffected=sentencia.executeUpdate();

        return rowsAffected;
    }
}
