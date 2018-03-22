/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataMapper {

    public static ArrayList<Order> getOrders(int id) {
        try {
            ArrayList<Order> orders = new ArrayList<>();
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM orders WHERE user_id=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int orderId = rs.getInt("order_id");
                int length = rs.getInt("length");
                int height = rs.getInt("height");
                int width = rs.getInt("width");
                String status = rs.getString("status");

                orders.add(new Order(orderId, id, length, height, width, status));

            }
            return orders;
        } catch (ClassNotFoundException | SQLException e) {
        }
        return null;
    }
    
    public static ArrayList<Order> getAllOrders() {
        try {
            ArrayList<Order> orders = new ArrayList<>();
            Connection con = Connector.connection();
            String SQL = "SELECT orders.order_id, orders.user_id, orders.length, orders.height, orders.width, orders.status, users.email FROM useradmin.orders INNER JOIN useradmin.users on useradmin.orders.user_id = users.id order by orders.order_id;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int orderId = rs.getInt("order_id");
                int id = rs.getInt("user_id");
                int length = rs.getInt("length");
                int height = rs.getInt("height");
                int width = rs.getInt("width");
                String status = rs.getString("status");
                String email = rs.getString("email");

                orders.add(new Order(orderId, id, length, height, width, status, email));

            }
            return orders;
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
       // ArrayList<Order> orders = new ArrayList<>();
        //orders.add(new Order(99, 99, 99, 99, 99, "shit", "Test"));
        
    }

    public static void createOrder(Order order) {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO useradmin.orders (user_id, length, height, width) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, order.getUserId());
            ps.setInt(2, order.getLength());
            ps.setInt(3, order.getHeight());
            ps.setInt(4, order.getWidth());
            
            ps.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static void changeStatus(int orderId) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "UPDATE useradmin.Orders SET orders.status = 'Sent' "
                    + "where orders.Order_Id =?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, orderId);
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            //throw new LoginSampleException(ex.getMessage());
        }
    }
    
}
