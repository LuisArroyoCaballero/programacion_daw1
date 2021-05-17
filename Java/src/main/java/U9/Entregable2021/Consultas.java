package U9.Entregable2021;

import java.sql.*;
import java.util.Scanner;

public class Consultas {
    public static void main(String[] args) {
        //pagosCliente();
        //infoPedido();
        datosJefe();
    }
    public static void pagosCliente(){
        Connection connection = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de cliente: ");
        int customerNumber = sc.nextInt();

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/classicmodels?user=root&password=");

            Statement statement = connection.createStatement();

            statement.setQueryTimeout(30);

            ResultSet rs = statement.executeQuery("select customers.contactFirstName, customers.contactLastName, customers.country, sum(payments.amount) from customers inner join payments on payments.customerNumber = customers.customerNumber where customers.customerNumber ="+customerNumber);

            while (rs.next()) {
                System.out.println("Contact First Name: " + rs.getString("customers.contactFirstName"));
                System.out.println("Contact Last Name: " + rs.getString("customers.contactLastName"));
                System.out.println("Country: " + rs.getString("customers.country"));
                System.out.println("Payments: " + rs.getString("sum(payments.amount)"));
                System.out.println("-----------------");

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void infoPedido() {
        Connection connection = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de pedido: ");
        int orderNumber = sc.nextInt();

        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost/classicmodels?user=root&password=");

            String sql = "select products.productName, products.buyPrice, orderdetails.quantityOrdered, (orderdetails.priceEach* orderdetails.quantityOrdered) as totalPrice from products inner join orderdetails on products.productCode = orderdetails.productCode where orderdetails.orderNumber = ? ";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1,orderNumber);

            ResultSet rs = statement.executeQuery();

            //Recorremos el conjunto de resultados
            while (rs.next()) {
                String nombre = rs.getString("products.productName");
                String precioUnidad = rs.getString("products.buyPrice");
                String cantidadPedida = rs.getString("orderdetails.quantityOrdered");
                String cantidadPagar = rs.getString("totalPrice");

                System.out.println("-------------------------");
                System.out.println("Nombre del producto: " + nombre);
                System.out.println("Precio del producto: " + precioUnidad);
                System.out.println("Cantidad ordenada: " + cantidadPedida);
                System.out.println("Cantidad a pagar: " + cantidadPagar);
                System.out.println("-------------------------");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void datosJefe() {
        Connection connection = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de empleado: ");
        int employeeNumber = sc.nextInt();

        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost/classicmodels?user=root&password=");

            String sql = "select firstName, lastName from employees where employeeNumber = (select reportsTo from employees where employeeNumber = ?) ";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1,employeeNumber);

            ResultSet rs = statement.executeQuery();

            //Recorremos el conjunto de resultados
            while (rs.next()) {
                String nombre = rs.getString("firstName");
                String apellido = rs.getString("lastName");

                System.out.println("-------------------------");
                System.out.println("Nombre del Jefe: " + nombre);
                System.out.println("Apellido del Jefe: " + apellido);
                System.out.println("-------------------------");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
